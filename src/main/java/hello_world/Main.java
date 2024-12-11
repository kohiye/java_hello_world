package hello_world;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Lab#: ");
        Scanner lab = new Scanner(System.in);
        switch (lab.nextInt()){
            case 1:
                Lab1Demo.demo();
                break;
            case 2:
                Lab2Demo.demo();
                break;
            case 3:
                Lab3Demo.demo();
                break;
            case 4:
                Lab4Demo.demo();
                break;
            default:
        }
    }
}