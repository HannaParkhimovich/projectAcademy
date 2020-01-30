public class CalculatorWithCounter {

    private CalculatorWithCounter result_counter;
    private CalculatorWithOperator result_Oper;

    public CalculatorWithCounter(CalculatorWithCounter result) {
    this.result_counter=result;
    }

    public CalculatorWithCounter (CalculatorWithOperator result){
        this.result_Oper=result;
    }


}
