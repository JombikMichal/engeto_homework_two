import com.bmi_module.BMI;
import com.calculator_module.calculator.CalculatorHolder;

public class Main {
    public static void main(String[] args) {
        CalculatorHolder calculatorHolder = new CalculatorHolder();
        BMI bmi = new BMI(50,1.86);

        int a = 10;
        int b = 5;
        char c = '-';

        System.out.println(bmi.getBMI());
    }
}
