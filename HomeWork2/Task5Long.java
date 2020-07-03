package HomeWork2;

public class Task5Long {
    public static void main(String[] args) {
        long a = 1L;
        long b = 3L;
        long lastResult = a;
        long tmp;

        do {
            tmp = lastResult;
            lastResult *= b;
        } while(lastResult > tmp);
        System.out.println("Последний результат до переполнения: " + tmp);
        System.out.println("Результат после переполнения: " + lastResult);
    }
}
