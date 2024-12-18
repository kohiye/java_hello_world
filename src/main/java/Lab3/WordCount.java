package Lab3;

import java.util.*;

public class WordCount {
    public static void count(String string){
        String[] list = string.toLowerCase().split("\\W+"); // regex all not WORDS+
        HashMap<String, Integer> freqs = new HashMap<>();
        for(String word : list){
            if(freqs.containsKey(word)){
                freqs.put(word, freqs.get(word) + 1);
            }else{
                freqs.put(word, 1);
            }
        }
        System.out.println(freqs);
    }
}
