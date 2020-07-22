package HomeWork6;

public class CalculatorWithMathExtends extends CalculatorWithOperator{
    @Override
    public double power(double numToPower, int power) {
        return Math.pow(numToPower, power);
    }

    @Override
    public double module(double a) {
        return Math.abs(a);
    }

    @Override
    public double root(double a) {
        return Math.sqrt(a);
    }
}
