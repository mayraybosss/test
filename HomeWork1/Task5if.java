package HomeWork1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5if {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);

        }
        Scanner sc = new Scanner(System.in);
        String name;
        String vasya = "Вася";
        String nastya = "Анастасия";
        do {
            System.out.println("Введите ваше имя:");
            name = sc.nextLine();
        } while (!name.equalsIgnoreCase(vasya) && !name.equalsIgnoreCase(nastya));


        boolean isVasya = name.equalsIgnoreCase(vasya);
        if (isVasya) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        boolean isNastya = name.equalsIgnoreCase(nastya);
        if (isNastya)
            System.out.println("Я тебя так долго ждал");


    }
}