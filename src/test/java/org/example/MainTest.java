package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fizzbuzz(){
        List<String> arr = Main.fizzbuzz();
        assertEquals("1", arr.getFirst());
        assertEquals("fizz", arr.get(4));
        assertEquals("buzz", arr.get(6));
        assertEquals("fizzbuzz", arr.get(34));
    }
    @Test
    void invert(){
        assertEquals("llatsni ekam", Main.invert());
    }
    @Test
    void quadraticRoots(){
        assertEquals("No Real Solutions", Main.quadraticRoots(1, 1, 9));
        assertEquals("-2.0 3.0", Main.quadraticRoots(1, -1, -6));
    }
    @Test
    void palindrome(){
        assert (Main.palindrome("aboba"));
        assert (Main.palindrome("torrot"));
        assert (!Main.palindrome("not pali"));
    }
    @Test
    void series(){
        assert ( 0.607955 < Main.series() && Main.series() < 0.607957 );
    }
}