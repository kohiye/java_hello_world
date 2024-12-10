package Lab2.geometry3d;

import Lab2.exceptions.NegativeValue;
import Lab2.exceptions.ZeroValue;
import Lab2.geometry2d.Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void volume() {
        Cylinder cylinder = new Cylinder(new Rectangle(3,4), 6);
        assertEquals(72, cylinder.volume());
    }
    @Test
    void exceptionTesting(){
        try{
           new Cylinder(new Rectangle(3,3), 0);
           fail();
        }catch (ZeroValue ex){
            assertEquals("height is zero", ex.getMessage());
        }
        try{
            new Cylinder(new Rectangle(3,3), -6);
            fail();
        }catch (NegativeValue ex){
            assertEquals("height is negative", ex.getMessage());
        }
    }
}