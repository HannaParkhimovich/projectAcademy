package home4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    /*
    2. Выполнить Поиск в строке "Я люблю JAVA" при помощи регулярных выражений h*, h+, h? - "h" это символ, "* + ?" - квантификаторы.
    Объяснить в комментариях к коду почему находит\не находит все три примера для метода find и matches
     */
    public static void main(String[] args) {

        String str="Я люблю JAVA";

        System.out.println(str.matches("h*"));

        System.out.println(str.matches("h+"));
        System.out.println(str.matches("h?"));


        Pattern pattern = Pattern.compile("h?");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());

    }

}
