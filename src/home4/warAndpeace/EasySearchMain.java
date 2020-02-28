package home4.warAndpeace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/*
3.4. Вывести информацию как часто встречаются строки "война", "и" (как союз), "мир".
Написать два мэйн класса, в одном используем реализацию EasySearch, во втором RegExSearch.
 */
public class EasySearchMain {
    public static void main(String[] args) {
        String filePath = "c:/temp/WarAndPeace.txt";
        String text= readAllBytesJava7( filePath );

        EasySearch easySearch =new EasySearch();
        int countWar=easySearch.search(text,"война");
        int countAnd=easySearch.search(text,"и");
        int countPeace=easySearch.search(text,"мир");

        System.out.println("часто встречаются строки \"война\"= "+countWar);
        System.out.println("часто встречаются строки \"и\"= "+countAnd);
        System.out.println("часто встречаются строки \"мир\"= "+countPeace);

    }

    private static String readAllBytesJava7(String filePath)
    {
        String content = "";
        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return content;
    }
}
