package Lab2.geometry2d;

import Lab2.exceptions.NegativeValue;
import Lab2.exceptions.ZeroValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        Rectangle rect = new Rectangle(3, 5.5);
        assertEquals(16.5, rect.area());
    }

    @Test
    void perimeter() {
        Rectangle rect = new Rectangle(0.4, 3.5);
        assertEquals(7.8, rect.perimeter());
    }

    @Test
    void testToString() {
        Rectangle rect = new Rectangle(4, 9);
        assertEquals("Rectangle(Side A: 4.0, Side B: 9.0)", rect.toString());
    }

    @Test
    void exceptionTest(){
        try{
            new Rectangle(0,6);
            fail();
        }catch(ZeroValue ex){
            assertEquals("a is zero", ex.getMessage());
        }
        try{
            new Rectangle(6,0);
            fail();
        }catch(ZeroValue ex){
            assertEquals("b is zero", ex.getMessage());
        }

        try{
            new Rectangle(-6,6);
            fail();
        }catch(NegativeValue ex){
            assertEquals("a is negative", ex.getMessage());
        }
        try{
            new Rectangle(6,-6);
            fail();
        }catch(NegativeValue ex){
            assertEquals("b is negative", ex.getMessage());
        }
    }
}