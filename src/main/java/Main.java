import com.calculator_module.calculator.CalculatorHolder;
import com.geometric_object_module.ThreeDimensionObjects;
import com.geometric_object_module.TwoDimensionObjects;
import com.geometric_object_module.drawing.DrawRectangle;
import com.geometric_object_module.real_geometric_objects.*;

public class Main {
    public static void main(String[] args) {
        CalculatorHolder calculatorHolder = new CalculatorHolder();

//        TwoDimensionObjects twoDimensionObjects = new Rectangle("Recangle", 5,6);



//        TwoDimensionObjects twoDimensionObjects = new Triangle("Triangle", 5,4,5);
//        System.out.println(twoDimensionObjects.calculateContent());
//        System.out.println(twoDimensionObjects.calculateCircuit());
//        System.out.println(twoDimensionObjects.getType());


//        Rectangle t = new Rectangle("Rectangle", 100,80);
//        t.display();
//
//        Squere s = new Squere("Squere", 100);
//        s.display();


//        BMI bmi = new BMI(150,1.86);
//
//        bmi.getBMI().display(bmi);

        ThreeDimensionObjects threeDimensionObjects = new Block("Dice", 5,5,0);
        System.out.println(threeDimensionObjects.calculateVolume());
        System.out.println(threeDimensionObjects.calculateSurface());

//        System.out.println(twoDimensionObjects.calculateContent());
//        System.out.println(twoDimensionObjects.calculateCircuit());
//        System.out.println(twoDimensionObjects.getType());


    }
}
