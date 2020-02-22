package home3;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.printf("Введите целое число =");
        int a=in.nextInt();
        System.out.printf("Рузельтат перемножения всех чисел числа " + a + " =");
        Recursia rr=new Recursia();
        rr.ost(a);
        System.out.printf(rr.getCounter()+"\n");



    }
}
