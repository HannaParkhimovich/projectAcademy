package home2;

import java.io.PrintStream;
import java.util.Scanner;

public class Home2Part2 {
    /*
    Вторая часть домашнего задания.
1. Циклы:
 1.1. Вывести таблицу умножения в консоль
    1.2. Перемножить числа от 1 до числа (включительно) введеннго через аргумент к исполняемой программе
    1.3. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль
2. Массивы:
 2.1 Вывести все элементы в консоль при помощи do....while, while, for, foreach. Элементы массива вводить через консоль. Массив хранит в себе числа.
 2.2 Вывести каждый второй элемент массива
     */

    public static void main(String[] args) {
//1.1. Вывести таблицу умножения в консоль
        System.out.println("Таблица умножения");
        tableMultiply();

        Scanner in=new Scanner(System.in);
        System.out.println("1.2.Перемножить числа от 1 до числа (включительно) введеннго через аргумент к исполняемой программе");
        System.out.printf("Введите целое число =");
        int a=in.nextInt();
        System.out.printf("\n");
        Home2Part2 h=new Home2Part2();
        System.out.printf("Рузельтат перемножения от 1 до %d = %d \n", a, h.numberMulti(a));

//1.3. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль
        System.out.printf("Рузельтат перемножения всех чисел числа " + a + " =");
        System.out.printf(" "+h.perMult(a)+"\n");
//2.1 Вывести все элементы в консоль при помощи do....while, while, for, foreach. Элементы массива вводить через консоль. Массив хранит в себе числа.
        System.out.printf("Введите размер массива =");
        int size=in.nextInt();
        System.out.printf("\n");
        int [] mas=new int[size];
        for (int i=1;i<=mas.length;i++){
            System.out.printf("Введитиде "+i+" масства:");
             mas[i-1]=in.nextInt();
        }
        if (mas.length>0) {
            System.out.println("Вывод элементов массива с помощью цикла do....while");
            int e=0;
            do {
                System.out.printf(mas[e] + "  ");
                e++;
            } while (e < mas.length);
            System.out.printf("\n");
            System.out.println("Вывод элементов массива с помощью цикла While");
            int k = 0;
            while (k < mas.length) {
                System.out.printf(mas[k] + "  ");
                k++;
            }
            System.out.printf("\n");


            System.out.println("Вывод элементов массива с помощью цикла for");
            for (int i = 0; i < mas.length; i++) {
                System.out.printf(mas[i] + "  ");
            }
            System.out.printf("\n");
            System.out.println("Вывод элементов массива с помощью цикла foreach");
            for (int i:mas) {
                System.out.printf(i + "  ");
            }
            System.out.printf("\n");
        } else System.out.println("Массив пуст");

//2.2 Вывести каждый второй элемент массива
        System.out.println("Вывод каждого второго элемента массива");
        for (int i = 1; i < mas.length; i=i+2) {
            System.out.printf(mas[i] + "  ");
        }
        
    }

    static void tableMultiply(){
       for (int a=2;a<10;a++) {
            for (int i = 2; i <6; i++) {

                System.out.printf(i + " x " + a + " = " + i * a + "      ");
                }
            System.out.printf("\n");
        }
        System.out.printf("\n\n");
        for (int a=2;a<10;a++) {
            for (int i = 6; i <10; i++) {

                System.out.printf(i + " x " + a + " = " + i * a + "      ");
            }
            System.out.printf("\n");
        }
        return ;
   }

   public  long numberMulti(int a){
        long rez=1;
        for (int i=1;i<=a;i++){
            rez=rez*i;
            }
        return rez;
   }

    public  int perMult(int a){
        int l=a;
        int rez=1;
        do{
            int b=l%10;
            System.out.printf(b+" * ");
            rez=rez*b;
            l=l/10;
        }while (l>0);
        System.out.printf(" = ");
        return rez;
    }



}