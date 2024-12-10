package Lab2.geometry2d;

import Lab2.exceptions.NegativeValue;
import Lab2.exceptions.ZeroValue;

public class Rectangle implements Figure{
    private final double m_a;
    private final double m_b;
    public Rectangle(double a, double b) throws ZeroValue,NegativeValue {
        if(a == 0){
            throw new ZeroValue("a is zero");
        }else if(a < 0){
            throw new NegativeValue("a is negative");
        }
        else if (b == 0){
            throw new ZeroValue("b is zero");
        }else if (b < 0){
            throw new NegativeValue("b is negative");
        }
        this.m_a = a;
        this.m_b = b;
    }
    @Override
    public double area(){
        return m_a * m_b;
    }
    @Override
    public double perimeter(){
        return 2*(m_a + m_b);
    }
    public String toString(){
        return "Rectangle(Side A: " + m_a + ", Side B: " + m_b + ")";
    }
}
