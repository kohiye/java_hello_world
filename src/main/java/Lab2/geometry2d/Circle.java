package Lab2.geometry2d;
import Lab2.exceptions.NegativeValue;
import Lab2.exceptions.ZeroValue;

public class Circle implements Figure{
    private final double m_r;
    public Circle(double r) throws ZeroValue,NegativeValue {
        if(r == 0) {
            throw new ZeroValue("r is zero");
        }else if (r < 0){
            throw new NegativeValue("r is negative");
        }
        this.m_r = r;
    }
    @Override
    public double area(){
        return Math.PI * m_r * m_r;
    }
    @Override
    public double perimeter(){
        return 2 * Math.PI * m_r;
    }
    public String toString(){
        return "Circle(Radius: " + m_r + ")";
    }
}
