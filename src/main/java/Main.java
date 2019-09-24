import com.bmi_module.BMI;
import com.calculator_module.calculator.CalculatorHolder;
import com.geometric_object_module.GeometricObject;
import com.geometric_object_module.TwoDimensionObjects;
import com.geometric_object_module.real_geometric_objects.Rectangle;
import com.geometric_object_module.real_geometric_objects.Squere;
import com.geometric_object_module.real_geometric_objects.Triangle;

public class Main {
    public static void main(String[] args) {
        CalculatorHolder calculatorHolder = new CalculatorHolder();

//        TwoDimensionObjects twoDimensionObjects = new Rectangle("Recangle", 5,6);



        TwoDimensionObjects twoDimensionObjects = new Triangle("Triangle", 5,4,5);
        System.out.println(twoDimensionObjects.calculateContent());
        System.out.println(twoDimensionObjects.calculateCircuit());
        System.out.println(twoDimensionObjects.getType());



//        BMI bmi = new BMI(150,1.86);
//
//        bmi.getBMI().display(bmi);


    }
}
