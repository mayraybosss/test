package HomeWork2;

import java.util.Scanner;

public class Task4Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число которое хотите возвести в степень: ");
        int a = sc.nextInt();
        while(a == 0){
            System.out.println("Введите число не равное 0!");
            a = sc.nextInt();
        }
        System.out.println("Введите число-степень в которую вы хотите возвести: ");
        int b = sc.nextInt();
        System.out.println(numToPower(a, b));
    }

    public static int numToPower(int a, int b) {
        if(b == 0)
            return 1;
        else {
            int tmp = 1;
            for (int i = 1; i <= b; i++) {
              tmp *= a;
            }
            return tmp;
        }
    }
}
