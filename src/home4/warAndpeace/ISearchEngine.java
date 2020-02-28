package home4.warAndpeace;

/*
Написать интерфейс ISearchEngine.
Это будет функциональный интерфейс в котором будет метод search который будет принимать две строки
(массив строк в котором мы ищем наше слово, слово которое мы будем искать), а возвращать число (количество найденных совпадений).

 */

@FunctionalInterface
public interface ISearchEngine {
    int search(String text,String word);
}
