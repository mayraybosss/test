package HomeWork2;

public class Task2Factorial {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        if (number > 15) {
            System.out.println("Число не может быть больше 15");
            return;
        }
        if (number <= 0) {
            System.out.println("Число должно быть больше 0");
            return;
        }

        System.out.println(factorial(number));

    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
