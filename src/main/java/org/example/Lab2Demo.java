package org.example;
import Lab2.Button;
import Lab2.Balance;
import Lab2.Bell;
import Lab2.OddEvenSeparator;
import Lab2.Table;
import Lab2.geometry2d.Rectangle;
import Lab2.geometry3d.Cylinder;

public class Lab2Demo {
    public static void demo(){
        System.out.println("Button:");
        button();
        System.out.println("Balance:");
        balance();
        System.out.println("Bell:");
        bell();
        System.out.println("OddEvenSeparator:");
        oddEven();
        System.out.println("Table:");
        table(4, 5);
        System.out.println("Geometry:");
        geometry();
    }
    public static void button(){
        Button button = new Button();
        button.click();
        button.click();
        button.click();
        Button new_button = new Button();
        new_button.click();
        new_button.click();
        new_button.click();
    }
    public static void balance(){
        Balance scale = new Balance();
        scale.result();
        scale.addLeft(3);
        scale.result();
        scale.addRight(4);
        scale.result();
        scale.addLeft(1);
        scale.result();
    }
    public static void bell(){
        Bell.sound();
        Bell.sound();
        Bell.sound();
    }
    public static void oddEven(){
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(3);
        separator.addNumber(2);
        separator.addNumber(6);
        separator.addNumber(9);
        separator.addNumber(99);
        separator.even();
        separator.odd();
    }
    public static void table(int rows, int cols){
        Table table = new Table(rows, cols);
        table.setValue(0,1,100);
        table.setValue(3,4,2);
        table.setValue(2,2,2);
        table.setValue(3,0,-10);
        System.out.print("Val at (3,4) = ");
        System.out.println(table.getValue(3,4));
        System.out.print("Cols = ");
        System.out.println(table.cols());
        System.out.print("Average = ");
        System.out.println(table.average());
        System.out.print(table);
    }
    public static void geometry(){
        Cylinder cylinder = new Cylinder(new Rectangle(4,9), 9);
        System.out.print("Cylinder Volume = ");
        System.out.println(cylinder.volume());
    }
}

