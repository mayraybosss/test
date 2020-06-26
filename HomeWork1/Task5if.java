package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Task5if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (Objects.equals(name, "Анастасия"))
            System.out.println("Я тебя так долго ждал");

        if (!Objects.equals(name, "Анастасия") && !Objects.equals(name, "Вася"))
            System.out.println("Добрый день, а вы кто?");
    }
}
