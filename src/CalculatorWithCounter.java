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

    public double add(double a, double b){
        if (null != result) {
            setCountOperation(count);
            return result.add(a,b);
        }else  if (null != result2){
            setCountOperation(count);
            return result2.add(a,b);
        }
        return 0; //не знаю, почему в методе требуется добавлять доп. возвращаемое значение, но если убрать появляется ошибка: missing return statement
    }

    public double subtr(double a, double b){
        if (null != result) {
            setCountOperation(count);
            return result.subtr(a,b);
        }else  if (null != result2){
            setCountOperation(count);
            return result2.subtr(a,b);
        }
        return 0;
    }

    public double multipl(double a, double b){
        if (null != result) {
            setCountOperation(count);
            return result.multipl(a,b);
        }else  if (null != result2){
            setCountOperation(count);
            return result2.multipl(a,b);
        }
        return 0;
    }

    public double divis(double a,double b){
        if (null != result) {
            setCountOperation(count);
            return result.divis(a,b);
        }else  if (null != result2){
            setCountOperation(count);
            return result2.divis(a,b);
        }
        return 0;

    }

    public double power(double a, int b){
        if (null != result) {
            setCountOperation(count);
            return result.power(a,b);
        }else  if (null != result2){
            setCountOperation(count);
            return result2.power(a,b);
        }
        return 0;
    }


    public void setCountOperation(int count) {
        this.count = count+1;
    }

    public int getCountOperation() {
        return count;
    }
}