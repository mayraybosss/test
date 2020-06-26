package HomeWork1;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(arr));
    }

    public static String createPhoneNumber(int[] arr) {
        String result = "(";
        for (int i : arr) {
            if (result.length() == 4) {
                result += ") ";
            }
            if (result.length() == 9) {
                result += "-";
            }
            result += String.valueOf(i);
        }
        return result;
    }
}
