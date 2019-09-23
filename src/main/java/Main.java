import com.bmi_module.BMI;
import com.calculator_module.calculator.CalculatorHolder;

public class Main {
    public static void main(String[] args) {
        CalculatorHolder calculatorHolder = new CalculatorHolder();
        BMI bmi = new BMI(0,1.86);

        bmi.getBMI().display();
    }
}
