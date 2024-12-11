package Lab3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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

        ListIterator<Integer> prime_iter = primes.listIterator();
        while(prime_iter.hasNext())
            System.out.print(prime_iter.next() + " ");
        System.out.println();
        while(prime_iter.hasPrevious())
            System.out.print(prime_iter.previous() + " ");
        System.out.println();
    }
}