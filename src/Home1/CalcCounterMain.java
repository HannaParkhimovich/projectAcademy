package Home1;

public class CalcCounterMain {

    public static void main(String[] args) {

        CalculatorWithMath math=new CalculatorWithMath();
        CalculatorWithOperator math2=new CalculatorWithOperator();
        CalculatorWithCounter counter = new CalculatorWithCounter(math);
        CalculatorWithCounter counter2 = new CalculatorWithCounter(math2);

        double resultMath= counter.add(counter.add(4.1,counter.multipl(15,7)),counter.power(counter.divis(28,5),2));
       // double resultMath2= counter2.add(counter2.add(4.1,counter2.multipl(15,7)),counter2.power(counter2.divis(28,5),2));

        //System.out.println(resultMath);
        //System.out.println(resultMath2);

        System.out.println("Количество произведенных операций="+counter.getCountOperation());
        //System.out.println("Количество произведенны операций="+counter2.getCountOperation());

    }


}


