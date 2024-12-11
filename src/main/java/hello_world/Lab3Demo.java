package hello_world;

import Lab3.*;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Lab3Demo {
    public static void demo(){
        System.out.println("Collections (N=60): ");
        first.run(60);

        System.out.println("Primes (N=10): ");
        List<Integer> primes = PrimesGenerator.generate(10);
        System.out.println(primes);

        System.out.println("WordCount: ");
        WordCount.count("Example string of, text ? and ---- stuff And EVEN MORE AND MORE STuff,,;");

        System.out.println("Map inverter: ");
        Map<String, Integer> map = new HashMap<>();
        map.put("First", 10);
        map.put("Second", 191);
        map.put("Third", 42);
        System.out.println("Before " + map);
        Map<Integer,String> inverted = InvertMap.invert(map);
        System.out.println("After " + inverted);

        HumanStuff.run();
    }
}
