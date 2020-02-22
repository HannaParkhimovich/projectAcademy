package home3;

public class Recursia {

    //1.3. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль
    private int rez=1;


    public double ost(int a){
        if (a==0) {
            return 0;}
        else{
            int b = a % 10;
            if (a/10>0){
                System.out.printf(b + "*");
            }else {
                System.out.printf(b + "=");
            }
            this.rez = rez * b;
            return ost(a/10) ;
        }

    }
    public int getCounter() {
        return rez;
    }

}
