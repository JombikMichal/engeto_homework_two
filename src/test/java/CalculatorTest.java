import com.calculator_module.calculator.CalculatorHolder;
import com.calculator_module.operands.Operands;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private CalculatorHolder calculatorHolder = new CalculatorHolder();
    private Operands operands = new Operands(10.0,5.0);
    private Operands operandsExp = new Operands(2.0,2.0);
    private Operands operandsSqrt = new Operands(4.0,4.0);

    @Test
    public void addition(){
        final double result =  calculatorHolder.calculate(operands,'+');
        final double expectedResult = 15;
        Assert.assertEquals(expectedResult,result,0);
    }

    @Test
    public void subtraction(){
        final double result =  calculatorHolder.calculate(operands,'-');
        final double expectedResult = 5;
        Assert.assertEquals(expectedResult,result,0);
    }

    @Test
    public void multiplication(){
        final double result =  calculatorHolder.calculate(operands,'*');
        final double expectedResult = 50;
        Assert.assertEquals(expectedResult,result,0);
    }

    @Test
    public void division(){
        final double result =  calculatorHolder.calculate(operands,'/');
        final double expectedResult = 2;
        Assert.assertEquals(expectedResult,result,0);
    }

    @Test
    public void power(){
        final double result = calculatorHolder.calculate(operandsExp,'^');
        final double expectedResult = 4;
        Assert.assertEquals(expectedResult,result,0);
    }

    @Test
    public void squere(){
        final double result = calculatorHolder.calculate(operandsSqrt,'√');
        final double expectedResult = 2;
        Assert.assertEquals(expectedResult,result,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void unsupportedOperation(){
        calculatorHolder.calculate(operands,'=');
    }

}
