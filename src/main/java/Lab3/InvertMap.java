package Lab3;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {
    //only works for hashmaps :(
    public static <V,K> Map<V, K> invert(Map<K, V> map) {
        Map<V, K> reverse = new HashMap<>();
        for(Map.Entry<K, V> entry : map.entrySet()){
            reverse.put(entry.getValue(), entry.getKey());
        }
        return reverse;
    }
}
