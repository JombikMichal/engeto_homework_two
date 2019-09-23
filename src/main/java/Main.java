import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;

public class Main {
    public static void main(String[] args) {
        CalculatorHolder calculatorHolder = new CalculatorHolder();

        int a = 10;
        int b = 5;
        char c = '-';

        System.out.println("ahoj" + calculatorHolder.calculate(new Operands(a,b), c));
    }
}
