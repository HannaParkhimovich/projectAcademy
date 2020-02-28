package home4.warAndpeace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    /*
     Написать класс RegExSearch реализующий интерфейс ISearchEngine. Реализовать поиск по строкам при помощи класса Matcher
     */
    @Override
    public int search(String text, String word) {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        int count=0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
