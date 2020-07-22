package HomeWork6;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();

        double result = calculatorWithOperator.plus(4.1, calculatorWithOperator.plus(calculatorWithOperator.multiply(15, 7),
                calculatorWithOperator.power(calculatorWithOperator.division(28, 5), 2)));

        System.out.println(result);
        System.out.println(result/0); // В первом случае получается бесконечность потому что мы делим double на инт, но в полседствии этот 0 также будет приведен к типу double
        System.out.println(result/0.0d); // во втором случае получается бесконечность потому что мы делим double на double


        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();

        double resultCopy = calculatorWithMathCopy.plus(4.1, calculatorWithMathCopy.plus(calculatorWithMathCopy.multiply(15, 7),
                calculatorWithMathCopy.power(calculatorWithMathCopy.division(28, 5), 2)));

        System.out.println(resultCopy);
        System.out.println(resultCopy/0); // Такая же ситуация как и в предыдущем примере
        System.out.println(resultCopy/0.0d); //


        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        double resultExtends = calculatorWithMathExtends.plus(4.1, calculatorWithMathExtends.plus(calculatorWithMathExtends.multiply(15, 7),
                calculatorWithMathExtends.power(calculatorWithMathExtends.division(28, 5), 2)));

        System.out.println(resultExtends);
        System.out.println(resultExtends/0); // Такая же ситуация как и в предыдущем примере
        System.out.println(resultExtends/0.0d); //

        CalculatorWithCounter calculatorWithCounter = new CalculatorWithCounter(calculatorWithOperator);
        double resultWithCounter = calculatorWithCounter.plus(4.1, calculatorWithCounter.plus(calculatorWithCounter.multiply(15, 7),
                calculatorWithCounter.power(calculatorWithCounter.division(28, 5), 2)));
        System.out.println(resultWithCounter);
        System.out.println(calculatorWithCounter.getCountOperation());


        CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory(calculatorWithOperator);

        double resultWithMemory1 = calculatorWithMemory.division(28, 5);
        calculatorWithMemory.setMemory(resultWithMemory1);
        double resultWithMemory2 = calculatorWithMemory.power(calculatorWithMemory.getMemory(), 2);
        calculatorWithMemory.setMemory(resultWithMemory2);
        double resultWithMemory3 = calculatorWithMemory.multiply(15, 7);
        calculatorWithMemory.setMemory(calculatorWithMemory.plus(calculatorWithMemory.getMemory(), resultWithMemory3));
        calculatorWithMemory.setMemory(calculatorWithMemory.plus(calculatorWithMemory.getMemory(), 4.1));
        System.out.println(calculatorWithMemory.getMemory());

    }
}
