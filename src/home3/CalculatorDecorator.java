package home3;

public class CalculatorDecorator  implements ICalculator
{
    private double rez;
    ICalculator calculator;

    public CalculatorDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }
    public double getRez() {
        return rez;
    }

    @Override
    public double add(double a, double b) {
        this.rez=rez+calculator.add(a,b);
        return calculator.add(a,b);
    }

    @Override
    public double subtr(double a, double b) {
         return calculator.subtr(a,b);
    }

    @Override
    public double multipl(double a, double b) {
       return calculator.multipl(a,b);
    }

    @Override
    public double divis(double a, double b) {
       return calculator.divis(a,b);
    }

    @Override
    public double power(double a, int b) {
       return calculator.power(a,b);
    }

    @Override
    public double abs(double a) {
        return calculator.abs(a);
    }

    @Override
    public double sqrt(int s) {
        return calculator.sqrt(s);
    }
}
