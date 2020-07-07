package HomeWork3.PCSimulator;

import java.util.Random;

public class Ram implements IPC {

    private boolean tested = false;

    @Override
    public boolean test() {
        Random random = new Random();
        int i = random.nextInt(10);
        if (i > 8)
            return false;
        else {
            tested = true;
            return true;
        }
    }

    @Override
    public boolean run() {
        if (isTested())
            return true;
        else
            return false;
    }

    public boolean isTested() {
        return tested;
    }

    public String toString() {
        return "ram";
    }
}
