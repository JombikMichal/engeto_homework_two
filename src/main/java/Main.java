import com.calculator_module.calculator.CalculatorHolder;
import com.geometric_object_module.ThreeDimensionObjects;
import com.geometric_object_module.TwoDimensionObjects;
import com.geometric_object_module.drawing.DrawRectangle;
import com.geometric_object_module.real_geometric_objects.*;

public class Main {
    public static void main(String[] args) {
        CalculatorHolder calculatorHolder = new CalculatorHolder();


        TwoDimensionObjects triangle = new Triangle("Triangle", 5,5,5);
        triangle.display();

        TwoDimensionObjects rectangle = new Rectangle("Rectangle", 100,80);
        rectangle.display();

        TwoDimensionObjects squere = new Squere("Squere", 100);
        squere.display();


//        BMI bmi = new BMI(150,1.86);
//
//        bmi.getBMI().display(bmi);

        ThreeDimensionObjects block = new Block("Block", 5,5,9);
        block.display();

        ThreeDimensionObjects dice = new Dice("Dice",10);
        dice.display();


    }
}
