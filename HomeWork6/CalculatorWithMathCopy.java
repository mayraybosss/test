package HomeWork6;

public class CalculatorWithMathCopy {
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

    public double root(double number) {
        return Math.sqrt(number);
    }

    public double power(double numToPower, int power) {
        return Math.pow(numToPower, power);
    }

    public double module(double number) {
        return Math.abs(number);
    }
}
