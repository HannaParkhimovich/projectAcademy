package home3;

public class Calculator implements ICalculator {

    public double add(double a, double b) {
        return  a+b;
    }

    public double subtr(double a, double b) {
        return a-b;
    }

    public double multipl(double a, double b) {
        return a*b;
    }
    public double divis(double a,double b){

        return a/b;
    }

    public double power(double a, int b) {
        return Math.pow(a,b);
    }

    public double abs(double a) {
        return Math.abs(a);
    }

    public double sqrt(int s) {
        return Math.sqrt(s);
    }
}
