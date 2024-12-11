package Lab3;

import java.util.ArrayList;
import java.util.List;

public class PrimesGenerator {
    public static List<Integer> generate(int N) throws IllegalArgumentException {
        if(N <= 0)
            throw new IllegalArgumentException("N is negative or zero");
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        int num = 3;
        while(primes.size() < N){
            boolean is_prime = true;
            for(Integer prime : primes){
                if (num % prime == 0) {
                    is_prime = false;
                    break;
                }
            }
            if(is_prime)
                primes.add(num);
            num+=2;
        }
        return primes;
    }
}
