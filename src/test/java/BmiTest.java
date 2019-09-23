import com.bmi_module.BMI;
import org.junit.Assert;
import org.junit.Test;

public class BmiTest {
    static BMI bmi = new BMI(150,1.86);

    @Test
    public void bmiTest(){
        String result = bmi.getBMI();
        String expectedResult = "Těžká obezita";
        Assert.assertEquals(expectedResult,result);
    }

}
