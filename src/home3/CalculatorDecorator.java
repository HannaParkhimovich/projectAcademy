package home3;

public class CalculatorDecorator  implements ICalculator
{
    private int counter;
    ICalculator calculator;

    public CalculatorDecorator(ICalculator calculator) {
        counter=0;
        this.calculator = calculator;
    }

    @Override
    public double add(double a, double b) {
        counter++;
        return calculator.add(a,b);
    }

    @Override
    public double subtr(double a, double b) {
        counter++;
         return calculator.subtr(a,b);
    }

    @Override
    public double multipl(double a, double b) {
        counter++;
       return calculator.multipl(a,b);
    }

    @Override
    public double divis(double a, double b) {
        counter++;
       return calculator.divis(a,b);
    }

    @Override
    public double power(double a, int b) {
        counter++;
       return calculator.power(a,b);
    }

    @Override
    public double abs(double a) {
        counter++;
        return calculator.abs(a);
    }

    @Override
    public double sqrt(int s) {
        counter++;
        return calculator.sqrt(s);
    }

    public int getCounter() {
        return counter;
    }
}
