package HomeWork3;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        int[] arr2 = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        int[] arr3 = {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        int[] arr4 = {10};
        int[] arr5 = {1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        int[] arr6 = {5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};
        System.out.println(meetOddElements(arr1));
    }

    public static int meetOddElements(int[] arr) {
        int number = arr[0];
        int maxTimes = 0;
        int times = 0;
        for (int value : arr) {
            for (int i : arr) {
                if (value == i)
                    times += 1;
            }
            if (times > maxTimes && times % 2 != 0) {
                maxTimes = times;
                number = value;
            }
            times = 0;
        }
        return number;
    }
}
