package HomeWork2;

public class Task3Multyplication {
    public static void main(String[] args) {
        multiply(args[0]);

    }

    public static void multiply(String s) {
        int sum = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1)
                System.out.print(s.charAt(i) + " = ");
            else
                System.out.print(s.charAt(i) + " * ");
            sum *= Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.print(sum);
    }
}
