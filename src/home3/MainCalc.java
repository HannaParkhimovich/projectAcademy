package home3;
/*
3. В отдельном классе, создать мэйн метод. Внутри данного метода создать экземпляр класса Calculator сохранив его в переменную.
При помощи методов созданного объекта вичислить результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2.
Результат записать в переменную (определить самый подходящий тип переменной). Вывести сохранённый результат в консоль.
 */
public class MainCalc {
    public static void main(String[] args) {


        CalculatorDecorator calculator = new CalculatorDecorator(new Calculator());
        double rez=calculator.add(4.1,calculator.add(calculator.power(calculator.divis(28,5),2),calculator.multipl(15,7)));
        System.out.println(rez);
        System.out.println(calculator.getCounter());

    }
}
