package Lab3;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InvertMapTest {

    @Test
    void invert() {
        Map<String, Integer> map = new HashMap<>();
        Map<Integer,String> rev = new HashMap<>();
        map.put("Hallo", 1);
        map.put("Bye", 10);
        map.put("Hello", -1);
        rev.put(1, "Hallo");
        rev.put(-1, "Hello");
        rev.put(10, "Bye");
        assertEquals(rev, InvertMap.invert(map));
    }
}