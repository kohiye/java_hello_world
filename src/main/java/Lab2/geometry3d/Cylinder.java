package Lab2.geometry3d;

import Lab2.exceptions.NegativeValue;
import Lab2.geometry2d.Figure;
import Lab2.exceptions.ZeroValue;

public class Cylinder {
    private final Figure m_base;
    private final double m_height;
    public Cylinder(Figure base, double height) throws ZeroValue,NegativeValue {
        if(height == 0){
            throw new ZeroValue("height is zero");
        }else if (height < 0){
            throw new NegativeValue("height is negative");
        }
        this.m_base = base;
        this.m_height = height;
    }
    public double volume(){
        return m_base.area() * m_height;
    }
}
