package home4.warAndpeace;

public class EasySearch implements ISearchEngine{
    /*
    Написать класс EasySearch реализующий интерфейс ISearchEngine. Реализовать поиск по строкам при помощи метода indexOf.
     */

    @Override
    public int search(String text, String word) {
        int index=0;
        int count;
        for (count=0;; count++){
            index=text.indexOf(word,index);
           if (index!=-1)
           {index++;}
           else break;;
        }
        return count;
    }


}
