public class CalcOperMain {
    public static void main(String[] args) {
        CalculatorWithMath calculator2=new CalculatorWithMath();
        double result2= calculator2.add(calculator2.add(4.1,calculator2.multipl(15,7)),calculator2.power(calculator2.divis(28,5),2));
        System.out.printf("Результат вычисления= %.2f",result2);
        System.out.println();
        System.out.printf("Результат /0 = %.2f",result2/0);
        System.out.println();
        System.out.printf("Результат /0.0d = %.2f",result2/0.0d);
        System.out.println();
    }
}
