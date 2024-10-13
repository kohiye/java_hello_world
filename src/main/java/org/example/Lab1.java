package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lab1 {
    static List<String> fizzbuzz(){
        List<String> array = new ArrayList<>();
        for(int i=1; i <= 500; ++i) {
            if(i%5 == 0) {
                if(i%7 == 0){
                    array.add("fizzbuzz");
                }else{
                    array.add("fizz");
                }
            }else if(i%7 == 0){
                array.add("buzz");
            }else{
                array.add(String.valueOf(i));
            }
        }
        return array;
    }
    static String invert(){
        String str = "make install";
        StringBuilder strbuild = new StringBuilder();
        for(int i = 0; i < str.length(); ++i){
            strbuild.append(str.charAt(str.length() - i - 1));
        }
        return strbuild.toString();
    }
    static String quadraticRoots(double a, double b, double c){
        double discriminant = Math.pow(b,2) - 4 * a * c;
        if(discriminant < 0){
            return "No Real Solutions";
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a) + " "
                + (-b + Math.sqrt(discriminant)) / (2 * a);
    }
    static boolean palindrome(String str){
        int length = str.length();
        for(int i = 0; str.charAt(i) == str.charAt(length - i - 1) ; ++i){
            if (i >= length - i - 1)
                return true;
        }
        return false;
    }
    static double series(){
        double sum = 0;
        int i = 2;
        double member;
        do {
            member = 1 / ( Math.pow(i, 2) + i - 2);
            sum += member;
            ++i;
        }while(member > 10e-6d);
        return sum;
    }
}
