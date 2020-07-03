package HomeWork2;

public class Task1table {
    public static void main(String[] args) {
        multTable2();
    }

    public static void multTable2() {
        int counter = 0;
        boolean nextTable = false;
        boolean anotherTable = false;
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 9; j++) {
                if (nextTable) {
                    j = 6;
                    nextTable = false;
                }
                System.out.print(j + " x " + i + " = " + (i * j) + (i * j <= 9 ? "    " : (i == 10 ? "  " : "   ")));
                if (counter == 9 && j == 5) {
                    i = 0;
                    j = 10;
                    anotherTable = true;
                    System.out.println();
                }
                if (j == 5) {
                    counter++;
                    break;
                }
            }
            if (anotherTable)
                nextTable = true;
            System.out.println();
        }
    }

    public static void multTable() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + (i * j <= 9 ? "    " : (i == 10 ? "  " : "   ")));
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + (i * j <= 9 ? "    " : (i == 10 ? "  " : "   ")));
            }
            System.out.println();
        }
    }
}