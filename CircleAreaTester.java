import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CircleAreaTester {
    CircleArea area1;
    CircleArea area2;

    @Before
    public void setUp(){
        area1 = new CircleArea();
        area2 = new CircleArea();
    }
    
    @Test 
    public void testCircleArea1(){
        area1.CircleAreaCalc(2.0);
        //3.14 * 2 * 2 = 3.14 * 4 = 12.56
        assertEquals("Test 1", "12.56", area1.result());
    }

    @Test 
    public void testCircleArea2(){
        area2.CircleAreaCalc(-1.0);
        //3.14 * 2 * 2 = 3.14 * 4 = 12.56
        assertEquals("Test 1", "3.14", area2.result());
    }
}
