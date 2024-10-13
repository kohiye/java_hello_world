package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Lab1Test {

    @Test
    void fizzbuzz(){
        List<String> arr = Lab1.fizzbuzz();
        assertEquals("1", arr.getFirst());
        assertEquals("fizz", arr.get(4));
        assertEquals("buzz", arr.get(6));
        assertEquals("fizzbuzz", arr.get(34));
    }
    @Test
    void invert(){
        assertEquals("llatsni ekam", Lab1.invert());
    }
    @Test
    void quadraticRoots(){
        assertEquals("No Real Solutions", Lab1.quadraticRoots(2, 1, 9));
        assertEquals("-2.0 3.0", Lab1.quadraticRoots(1, -1, -6));
    }
    @Test
    void palindrome(){
        assert (Lab1.palindrome("aboba"));
        assert (Lab1.palindrome("torrot"));
        assert (!Lab1.palindrome("not pali"));
    }
    @Test
    void series(){
        assert ( 0.607955 < Lab1.series() && Lab1.series() < 0.607957 );
    }
}