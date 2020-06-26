package HomeWork1;

public class Task4 {
    public static void main(String[] args) {
//4 тут короче от рандома зависит что выпадет
        int rand = (int) (Math.random() * (100 + 1) + 0);
        boolean weekday = false;
        boolean vacation = false;
        if (rand >= 0 && rand < 33)
            weekday = true;
        else if (rand > 33 && rand < 66)
            vacation = true;
        else if (rand > 66 && rand < 100) {
            weekday = true;
            vacation = true;
        }
        whatToDo(sleepin(weekday, vacation));
    }


    public static void whatToDo(boolean a) {
        if (a)
        System.out.println("Можем спать дальше!");
        else
            System.out.println("Вставай, пора на работу!");
    }

    public static boolean sleepin(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }
}
