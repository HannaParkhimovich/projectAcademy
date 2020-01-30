public class CalcMain {

    public static void main(String[] args) {
 /*
        В отдельном классе, создать мэйн метод.
        Внутри данного метода создать экземпляр класса Calculator сохранив его в переменную.
        При помощи методов созданного объекта вичислить результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2.
        Результат записать в переменную (определить самый подходящий тип переменной).
        Вывести сохранённый результат в консоль.
 */
        CalculatorWithOperator calculator=new CalculatorWithOperator();
        double result= calculator.addition(
                                        calculator.addition( 4.1,
                                                              calculator.multiplication(15,7)),
                                        calculator.power(calculator.division(28,5),2));
        System.out.println("п.3-5");
        System.out.printf("Результат вычисления= %.2f",result);
        System.out.println();
        System.out.printf("Результат /0 = %.2f",result/0);
        System.out.println();
        System.out.printf("Результат /0.0d = %.2f",result/0.0d);
        System.out.println();
        System.out.println("п.8");
        CalculatorWithMath calculator2=new CalculatorWithMath();
        double result2= calculator2.add(calculator2.add(4.1,calculator2.multipl(15,7)),calculator2.power(calculator2.divis(28,5),2));
        System.out.printf("Результат вычисления= %.2f",result2);
        System.out.println();
        System.out.printf("Результат /0 = %.2f",result2/0);
        System.out.println();
        System.out.printf("Результат /0.0d = %.2f",result2/0.0d);



    }


}
