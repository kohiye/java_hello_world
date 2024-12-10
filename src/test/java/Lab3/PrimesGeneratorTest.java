package Lab3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class PrimesGeneratorTest {

    @Test
    void generate() {
        List<Integer> primes = PrimesGenerator.generate(6);
        List<Integer> test = new ArrayList<>();
        test.add(2);
        test.add(3);
        test.add(5);
        test.add(7);
        test.add(11);
        test.add(13);
        assertEquals(test, primes);
        System.out.println(primes);
        System.out.println(primes.reversed());
    }
}