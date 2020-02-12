package home2;

import java.util.Objects;
import java.util.Scanner;

public class Home2Main3 {
    public static void main(String[] args) {
        /*
         Используя статью https://metanit.com/java/tutorial/2.9.php запросить у пользователя его имя.
         Если имя будет равно имени Вася тогда в консоль должно вывести сообщение "Привет!" на одной строке,
         а на второй "Я тебя так долго ждал".
         Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщени "Я тебя так долго ждал".
         В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
         Написать ТРИ ОТДЕЛЬНЫХ решения при помощи if, else if, switch.
         В примерах if и else if для сравнения имё использовать код на подобии Objects.equals("Имя1", "Имя2");
         */
        System.out.printf("Введите Ваше имя: ");
        Scanner vvod=new Scanner(System.in);
        String name;
        String name1="Вася";
        String name2="Анастасия";
        name=vvod.nextLine();

        //реализация через if
        if (Objects.equals(name, name1)==true){
            System.out.printf("Привет! \nЯ тебя так долго ждал");
        }else {
            if (Objects.equals(name, name2)==true){
                System.out.println("Я тебя так долго ждал");
            }else {
                System.out.println("Добрый день, а вы кто?");
            }
        }


        //реализация через else if
        if (Objects.equals(name, name1)==true){
            System.out.printf("Привет! \nЯ тебя так долго ждал");
        }else if (Objects.equals(name, name2)==true){
              System.out.println("Я тебя так долго ждал");
            }
        else {
                System.out.println("Добрый день, а вы кто?");
        }

        //реализация через switch
        switch (name){
            case "Вася":
                System.out.printf("Привет! \nЯ тебя так долго ждал");
                break;

            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;


        }


    }
}
