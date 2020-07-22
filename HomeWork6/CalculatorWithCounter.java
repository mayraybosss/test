package HomeWork6;

public class CalculatorWithCounter {

    private int CountOperation = 0;
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathExtends calculatorWithMathExtends;
    private CalculatorWithMathCopy calculatorWithMathCopy;

    public CalculatorWithCounter(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    public int getCountOperation() {
        return CountOperation;
    }

    public double division(double whatToDivide, double byWhatDivide) {
        CountOperation++;
        if (calculatorWithOperator != null)
            return calculatorWithOperator.division(whatToDivide, byWhatDivide);
        else if (calculatorWithMathExtends != null)
            return calculatorWithMathExtends.division(whatToDivide, byWhatDivide);
        else
            return calculatorWithMathCopy.division(whatToDivide, byWhatDivide);
    }

    public double multiply(double a, double b) {
        CountOperation++;
        if (calculatorWithOperator != null)
            return calculatorWithOperator.multiply(a, b);
        else if (calculatorWithMathExtends != null)
            return calculatorWithMathExtends.multiply(a, b);
        else
            return calculatorWithMathCopy.multiply(a, b);
    }

    public double minus(double a, double b) {
        CountOperation++;
        if (calculatorWithOperator != null)
            return calculatorWithOperator.minus(a, b);
        else if (calculatorWithMathExtends != null)
            return calculatorWithMathExtends.minus(a, b);
        else
            return calculatorWithMathCopy.minus(a, b);
    }

    public double plus(double a, double b) {
        CountOperation++;
        if (calculatorWithOperator != null)
            return calculatorWithOperator.plus(a, b);
        else if (calculatorWithMathExtends != null)
            return calculatorWithMathExtends.plus(a, b);
        else
            return calculatorWithMathCopy.plus(a, b);
    }

    public double root(double number) {
        CountOperation++;
        if (calculatorWithOperator != null)
            return calculatorWithOperator.root(number);
        else if (calculatorWithMathExtends != null)
            return calculatorWithMathExtends.root(number);
        else
            return calculatorWithMathCopy.root(number);
    }

    public double power(double numToPower, int power) {
        CountOperation++;
        if (calculatorWithOperator != null)
            return calculatorWithOperator.power(numToPower, power);
        else if (calculatorWithMathExtends != null)
            return calculatorWithMathExtends.power(numToPower, power);
        else
            return calculatorWithMathCopy.power(numToPower, power);
    }

    public double module(double number) {
        CountOperation++;
        if (calculatorWithOperator != null)
            return calculatorWithOperator.module(number);
        else if (calculatorWithMathExtends != null)
            return calculatorWithMathExtends.module(number);
        else
            return calculatorWithMathCopy.module(number);
    }

}
