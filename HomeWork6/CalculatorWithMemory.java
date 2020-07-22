package HomeWork6;

public class CalculatorWithMemory {

    private String memory = "";
    private int CountOperation = 0;
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathExtends calculatorWithMathExtends;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    public CalculatorWithMemory(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }
    public CalculatorWithMemory(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithMemory(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    public double getMemory() {
        if (!memory.equals("")) {
            double tmp = Double.parseDouble(memory);
            memory = "";
            return tmp;
        } else {
            System.out.println("В памяти ничего не хронится!");
            return 0.0;
        }

    }

    public void setMemory(double memory) {
        this.memory = String.valueOf(memory);
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
