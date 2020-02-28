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
        System.out.println("matches");
        System.out.println("Поиск  h*: "+ str.matches("h*")); //false, т.к текст не соответствует шаблону
        System.out.println("Поиск h+: "+ str.matches("h+"));//false, т.к текст не соответствует шаблону
        System.out.println("Поиск h?: "+ str.matches("h?"));//false, т.к текст не соответствует шаблону

        System.out.println("find");
        Pattern pattern = Pattern.compile("h*");
        Matcher matcher = pattern.matcher(str);
        System.out.println("Поиск  h*: "+matcher.find());//true, т.к. в тексте есть совпадения по шаблону h*-ноль и более раз

        pattern=Pattern.compile("h+");
        matcher=pattern.matcher(str);
        System.out.println("Поиск  h+: "+matcher.find());//false, т.к. в тексте нет совпадения по шаблону h+-один и более раз

        pattern=Pattern.compile("h?");
        matcher=pattern.matcher(str);
        System.out.println("Поиск  h?: "+matcher.find());//true, т.к. в тексте есть совпадения по шаблону h?- один или отсутствует

    }

}
