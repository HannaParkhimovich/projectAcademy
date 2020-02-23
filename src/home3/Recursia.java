package home3;

public class Recursia {

    //1.3. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль



    public double ost(int a){
        if (a==0) {
            return 1; }
        else{
            return ost(a/10)*(a%10) ;
        }
    }


}
