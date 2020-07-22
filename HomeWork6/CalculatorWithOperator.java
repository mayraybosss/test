package HomeWork6;

public class CalculatorWithOperator {

    public double division(double whatToDivide, double byWhatDivide) {
        return whatToDivide / byWhatDivide;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double plus(double a, double b) {
        return a + b;
    }

    public double power(double numToPower, int power) {
        double result = numToPower;
        for (int i = 1; i < power; i++) {
            result *= numToPower;
        }
        return result;
    }

    public double module(double a) {
        if (a >= 0)
            return a;
        else
            return -1 * a;
    }

    public double root(double a) {
        double tmp;
        double sqrt = a / 2;

        do {
            tmp = sqrt;
            sqrt = (tmp + (a / tmp)) / 2;
        } while ((tmp - sqrt) != 0);

        return sqrt;
    }

}



