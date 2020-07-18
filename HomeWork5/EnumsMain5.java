package HomeWork5;

import java.util.Scanner;

public class EnumsMain5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название цвета");
        String nameColor = scan.nextLine();

        Color selectedColor = Color.searchForEnum(nameColor);

        System.out.println(selectedColor.getId());
        System.out.println(selectedColor.getRusName());
    }
}
