package home4;

public class CountryMain {
    public static void main(String[] args) {
        Country country=Country.valueOf("GREECE");
        System.out.println(country);
        int n=Country.valueOf("CANADA").ordinal();
        System.out.println(n);

        //1.6 Сравнить результат valueOf и элемент энума через оператор ==
        if (country.RUSSIA==Country.valueOf("RUSSIA")){
            System.out.println("Значения равны");
        }else {System.out.println("Значения разные");
        }
        //1.7. Передать в valueOf имя несуществующего элемента
       /* Country country1=Country.valueOf("ABCD");
        System.out.println(country1);

        */
       //1.8**. Добавить в энум метод (испрользуя интерфейс Comparable из jdk) сравнения площади двух стран.
       // В этом задании есть нюанс, расскажите мне о нём в личке и получите инструкции.
        System.out.println(country.RUSSIA.compareTo(country.RUSSIA));

        Count k=new Count();
        int c=k.compare(country.RUSSIA,country.CHINA);
        if (c==1){
            System.out.println("Площадь первой страны больше второй");
        } else if (c==-1){
            System.out.println("Площадь второй страны больше первой");
        }
        else {System.out.println("Площади стран равны");}


    }
}
