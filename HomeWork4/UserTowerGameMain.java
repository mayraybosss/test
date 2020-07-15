package HomeWork4;

import java.util.Scanner;

public class UserTowerGameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество колец");
        int n = sc.nextInt();

        while (n < 3 || n > 8) {
            System.out.println("Минимальное число столбцов - 3, максимальное - 8");
            n = sc.nextInt();
        }

        int[][] arr = new int[3][n];
        for (int i = 0; i < arr[0].length; i++) {
            arr[0][i] = n--;
        }


        while (true) {
            view(arr);
            modify(arr, n);
        }
    }

    public static void view(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] == 0 ? "*" : arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] modify(int[][] arr, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Передвинуть кольцо \n0 - Закончить");
        int a = sc.nextInt();

        while (a != 1) {
            if (a == 0)
                System.exit(-1);

            System.out.println("Вы ввели не верное число \n1 - Передвинуть кольцо\n0 - Закончить");
            a = sc.nextInt();
        }

        int rowFrom;
        int rowTo;

        do {
            System.out.println("Введите номер столбца с которого хотите передвинуть кольцо");
            rowFrom = sc.nextInt();
            while (rowFrom > arr.length || rowFrom < 0) {
                System.out.println("Такого столбца не существует, всего есть " + arr.length + " столбца!");
                rowFrom = sc.nextInt();
            }
            System.out.println("Введите номер столбца куда хотите передвинуть кольцо");
            rowTo = sc.nextInt();

            while (rowTo > arr.length || rowTo < 0) {
                System.out.println("Такой столбец отсутствует, всего есть " + arr.length + " столбца!");
                rowTo = sc.nextInt();
            }

            int lastTo = findIndexLastNotZero(arr[rowTo - 1]);

            for (int i = arr[rowFrom - 1].length - 1; i >= 0; i--) {
                if (arr[rowFrom - 1][i] != 0 && arr[rowFrom - 1][i] < arr[rowTo - 1][lastTo] && lastTo != n - 1) {
                    arr[rowTo - 1][lastTo + 1] = arr[rowFrom - 1][i];
                    arr[rowFrom - 1][i] = 0;
                    return arr;
                } else if (arr[rowTo - 1][lastTo] == 0 && arr[rowFrom - 1][i] != 0) {
                    arr[rowTo - 1][lastTo] = arr[rowFrom - 1][i];
                    arr[rowFrom - 1][i] = 0;
                    return arr;
                }
            }
            System.out.println("Нельзя совершить данную операцию!");
        } while (true);
    }

    public static int findIndexLastNotZero(int[] arr) {
        int indexOfMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                indexOfMax = i;
        }
        return indexOfMax;
    }
}
