package home2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Home2Part2Main2 {
    /*
    3. Сортировки. Реализовать ВСЕ. Нарисовать блок схему любой из сортировок с помощью обмена:
    4. Написать код который будет получать значения элементов массива из консоли.
    Далее массив нужно отсортировать любым способом из прошлого задания.
    В случае нахождения одинаковых элементов массива дубликат требуется удалить
     */
    public static void main(String[] args) {
        int [] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=rand.nextInt(10);
        }
        System.out.println("Исходный массив:"+Arrays.toString(array));
        int[] arraySelectionSort=SelectionSort(array);
        System.out.println("Отсортирован массив сортировкой выбором:"+Arrays.toString(arraySelectionSort));
        int[] arrayBubbleSort=BubbleSort(array);
        System.out.println("Отсортирован массив пузырьковой сортировкой:"+Arrays.toString(arrayBubbleSort));
        int[] arrayShakerSort=shakerSort(array);
        System.out.println("Отсортирован массив шейкерной сортировкой:"+Arrays.toString(arrayShakerSort));
        int[] arrayInsertionSort=insertionSort(array);
        System.out.println("Отсортирован массив cортировкой с помощью включения:"+Arrays.toString(arrayInsertionSort));
        int[] arrayMergeSort=mergeSort(array,0,array.length-1);
        System.out.println("Отсортирован массив cортировкой слиянием:"+Arrays.toString(arrayMergeSort));
        int[] arrayQuickSort=quickSort(array,0,array.length-1);
        System.out.println("Отсортирован массив cортировкой с помощью разделения:"+Arrays.toString(arrayQuickSort));

        //Задание 4
        Scanner in=new Scanner(System.in);
        System.out.printf("Введите размер массива =");
        int size=in.nextInt();
        System.out.printf("\n");
        int[] mas=new int[size];
        for (int i=1;i<=mas.length;i++){
            System.out.printf("Введитиде "+i+" масства:");
            mas[i-1]=in.nextInt();
        }
        System.out.println("Исходный массив:"+Arrays.toString(mas));
        int[] sortArray=quickSort(mas,0,mas.length-1);
        System.out.println("Отсортированный массив:"+Arrays.toString(sortArray));
        int k=0;
        for (int j=0; j<sortArray.length-1;j++){
            if (sortArray[j]==sortArray[j+1]){
                k++;
            }
        }
        int p=0;
        int[] delDublArray=new int[sortArray.length-k];
        delDublArray[0]=sortArray[0];
        for (int l=1; l<sortArray.length;l++){
            if (delDublArray[p]!=sortArray[l]){
                p++;
                delDublArray[p]=sortArray[l];

            }

        }


        System.out.println("Массив без дублей:"+Arrays.toString(delDublArray));

    }
    //3.1.Сортировка выбором
    public static int[] SelectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int k = array[i];
            array[i] = array[min];
            array[min] = k;

        }
        return array;
    }
    // 3.2.Сортировки с помощью обменов
    //a)Пузырьковая сортировка
    public static int[] BubbleSort(int array[]){
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int k = array[i];
                    array[i] = array[i-1];
                    array[i-1] = k;
                    flag = true;
                }
            }
        }
        return array;
    }
    // 3.2.Сортировки с помощью обменов
    // b)Шейкерная сортировка
    public  static int[] shakerSort(int array[]){
        var left = 0;
        var right = array.length - 1;
        while (left < right) {
            for (var i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    int k = array[i];
                    array[i] = array[i+1];
                    array[i+1] = k;

                }
            }
            right--;
            for (var i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    int k = array[i];
                    array[i] = array[i-1];
                    array[i-1] = k;
                }
            }
            left++;
        }
        return array;
    }
    // 3.3.Сортировка с помощью включения
    public static int[] insertionSort(int array[]) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                 if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                   break;
                }
            }
            array[i + 1] = value;
        }
        return array;
    }
    // 3.4.Сортировка слиянием
    public static int[] mergeSort(int array[],int left,int right){

        int delimiter = left + ((right - left) / 2) + 1;
        // Выполним рекурсивно данную функцию для двух половинок (если сможем разбить(
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(array, left, delimiter - 1);
            mergeSort(array, delimiter, right);
        }
        // Создаём временный массив с нужным размером
        int[] buffer = new int[right - left + 1];
        // Начиная от указанной левой границы идём по каждому элементу
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            // Мы используем delimeter чтобы указывать на элемент из правой части
            // Если delimeter > right, значит в правой части не осталось недобавленных элементов
            if (delimiter > right || array[cursor] > array[delimiter]) {
                buffer[i] = array[cursor];
                cursor++;
            } else {
                buffer[i] = array[delimiter];
                delimiter++;
            }
        }
        return array;
    }
    // 3.5.Сортировка с помощью разделения
    public static  int[] quickSort(int array[],int low,int high){
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);

        return array;
    }



}
