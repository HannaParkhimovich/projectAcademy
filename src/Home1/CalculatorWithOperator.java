package Home1;

public class CalculatorWithOperator {

    public  double add(double a, double b){

        return  a+b;
    }

    public double subtr(double a, double b){

        return a-b;
    }

    public double multipl(double a, double b){
        return a*b;
    }

    public  double divis(double a,double b){

        return a/b;
    }

    public double power(double a, int b){
        for (int i=2; i<=b; i++){
            a = a*a;
        }
        return a;
    }

    public double abs(double a){
        if (a>=0) {
            return a;
        }
        else return -1*a;
    }

    public double sqrt(int s, int e){
        double a=1;
        double b=s;
        double l;
        do {
            double k=a+(b-a)/2;
             l=k*k;
            if (l>s) {
                b=k;
            }
            else a=k;

        } while ((abs(l-a))>e);
        return b;

    }

}
