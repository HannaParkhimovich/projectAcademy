package home4.warAndpeace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RegExSearchMain {
    public static void main(String[] args) {
        String filePath = "c:/temp/WarAndPeace.txt";
        String text= readAllBytesJava7( filePath );

        RegExSearch regExSearch=new RegExSearch();
        int countWar=regExSearch.search(text,"война");
        int countAnd=regExSearch.search(text,"и");
        int countPeace=regExSearch.search(text,"мир");

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
