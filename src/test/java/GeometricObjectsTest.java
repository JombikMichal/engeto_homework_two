import com.geometric_object_module.TwoDimensionObjects;
import com.geometric_object_module.real_geometric_objects.Rectangle;
import com.geometric_object_module.real_geometric_objects.Squere;
import com.geometric_object_module.real_geometric_objects.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class GeometricObjectsTest {
    private static TwoDimensionObjects squere = new Squere("Squere", 5);
    private static TwoDimensionObjects triangle = new Triangle("Triangle",5,5,5);
    private static TwoDimensionObjects rectangle = new Rectangle("Rectangle",5,10);

    @Test
    public void squereTest(){
        Assert.assertEquals("Squere",squere.getType());
        Assert.assertEquals(25.0d,squere.calculateContent(),0);
        Assert.assertEquals(20.0d,squere.calculateCircuit(),0);
    }
    @Test
    public void triangleTest(){
        Assert.assertEquals("Triangle",squere.getType());
        Assert.assertEquals(25.0d,squere.calculateContent(),0);
        Assert.assertEquals(20.0d,squere.calculateCircuit(),0);
    }

    @Test
    public void rectangleTest(){
        Assert.assertEquals("Rectangle",squere.getType());
        Assert.assertEquals(25.0d,squere.calculateContent(),0);
        Assert.assertEquals(20.0d,squere.calculateCircuit(),0);
    }

    @Test
    public void circuitTest(){
        Assert.assertEquals("Circuit",squere.getType());
        Assert.assertEquals(25.0d,squere.calculateContent(),0);
        Assert.assertEquals(20.0d,squere.calculateCircuit(),0);
    }

}
