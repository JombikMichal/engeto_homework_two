import com.bmi_module.BMI;
import com.bmi_module.display.DisplayBMIResult;
import com.bmi_module.display.HealthyWeight;
import org.junit.Assert;
import org.junit.Test;

public class BmiTest {
    static BMI bmi = new BMI(150,1.86);
    static BMI badBmi = new BMI(-1,1.86);

    @Test
    public void bmiTesDone(){
        DisplayBMIResult result = bmi.getBMI();
        DisplayBMIResult expectedResult = new HealthyWeight();
        Assert.assertEquals(expectedResult.getClass(),result.getClass());
    }

    @Test(expected = ArithmeticException.class)
    public void wrongParameter(){
        badBmi.getBMI();
    }

}
