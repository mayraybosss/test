package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Task21Array {
    public static void main(String[] args) {
        int[] arr = fillArray();
//проверка задания 2.1
        arrayDoWhile(arr);
        arrayWhile(arr);
        arrayFor(arr);
        arrayForEach(arr);

//проверка задания 2.2
        everySecondElementOfArray(arr);

//проверка задания 3
        System.out.println("Массив до сортировки:  " + Arrays.toString(arr));
        bubbleSortOfArray(arr);
        System.out.println("Массив после сортировки:  " + Arrays.toString(arr));

    }

    public static int[] fillArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер вашего массива: ");
        int sizeOfArray = sc.nextInt();

        while (sizeOfArray <= 0) {
            System.out.println("Размер массива должен быть больше 0!");
            sizeOfArray = sc.nextInt();
        }
        int[] tmp = new int[sizeOfArray];

        int count = 0;
        while (count != tmp.length) {
            System.out.println("Введите " + count + "й элемент массива: ");
            tmp[count] = sc.nextInt();
            count++;
        }
        return tmp;
    }

    public static void arrayDoWhile(int[] arr) {
        int count = 0;
        do {
            System.out.print(count == 0 ? "[" + arr[count] + ", " : count == arr.length - 1 ? arr[count] + "]" : arr[count] + ", ");
            count++;
        } while (count != arr.length);
        System.out.println();
    }

    public static void arrayWhile(int[] arr) {
        int count = 0;
        while (count != arr.length) {
            System.out.print(count == 0 ? "[" + arr[count] + ", " : count == arr.length - 1 ? arr[count] + "]" : arr[count] + ", ");
            count++;
        }
        System.out.println();
    }

    public static void arrayFor(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == 0 ? "[" + arr[i] + ", " : i == arr.length - 1 ? arr[i] + "]" : arr[i] + ", ");
        }
        System.out.println();
    }

    public static void arrayForEach(int[] arr) {
        int count = 0;
        for (int i : arr) {
            System.out.print(count == 0 ? "[" + i + ", " : count == arr.length - 1 ? i + "]" : i + ", ");
            count++;
        }
        System.out.println();
    }

    public static void everySecondElementOfArray(int[] arr) {
        System.out.print("Каждый второй элемент массива: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + (i + 2 >= arr.length ? "." : ", "));
            }
        }
    }

    public static int[] bubbleSortOfArray(int[] arr) {
        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    needSort = true;
                }
            }
        }
        return arr;
    }
}
