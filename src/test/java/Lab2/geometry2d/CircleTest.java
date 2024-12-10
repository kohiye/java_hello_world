package Lab2.geometry2d;

import Lab2.exceptions.NegativeValue;
import Lab2.exceptions.ZeroValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() {
        Circle circle = new Circle(43);
        assertEquals(5809, Math.round(circle.area()));
        assertNotEquals(5800, Math.round(circle.area()));
    }

    @Test
    void perimeter() {
        Circle circle = new Circle(10.5);
        assertEquals(66, Math.round(circle.perimeter()));
        assertNotEquals(67, Math.round(circle.perimeter()));
    }

    @Test
    void testToString() {
        Circle circle = new Circle(43.9);
        assertEquals("Circle(Radius: 43.9)", circle.toString());
        assertNotEquals("Circle(Radius: 43.", circle.toString());
    }
    @Test
    void exceptionTest(){
        try{
            new Circle(0);
            fail();
        }catch (ZeroValue ex){
            assertEquals("r is zero", ex.getMessage());
        }
        try{
            new Circle(-5);
            fail();
        }catch (NegativeValue ex){
            assertEquals("r is negative", ex.getMessage());
        }
    }
}