public class CalculatorWithCounter {

    private CalculatorWithMath result;
    private CalculatorWithOperator result2;
    int count=0;

    public CalculatorWithCounter(CalculatorWithMath result) {
        this.result=result;
    }

    public CalculatorWithCounter (CalculatorWithOperator result){
        this.result2=result;
    }

    public void setCountOperation(int count) {
        this.count = count+1;
    }

    public int getCountOperation() {
        return count;
    }

    public double add(double a, double b){
        if (result != null) {
            setCountOperation(count);
            return result.add(a,b);
        }else {
            setCountOperation(count);
            return result2.add(a,b);
        }
    }

    public double subtr(double a, double b){
        if (result != null) {
            setCountOperation(count);
            return result.subtr(a,b);
        }else {
            setCountOperation(count);
            return result2.subtr(a,b);
        }
    }

    public double multipl(double a, double b){
        if (result != null) {
            setCountOperation(count);
            return result.multipl(a,b);
        }else {
            setCountOperation(count);
            return result2.multipl(a,b);
        }
    }

    public double divis(double a,double b){
        if (result != null) {
            setCountOperation(count);
            return result.divis(a,b);
        }else {
            setCountOperation(count);
            return result2.divis(a,b);
        }
    }

    public double power(double a, int b){
        if (null != result) {
            setCountOperation(count);
            return result.power(a,b);
        }else {
            setCountOperation(count);
            return result2.power(a,b);
        }
    }

}