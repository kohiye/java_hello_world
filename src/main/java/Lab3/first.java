package Lab3;

import java.util.*;

public class first {
    public static void run(int num){
        // a
        Integer[] arr = generate(num);
        System.out.print('[');
        for (int i : arr) System.out.print(i + ", ");
        System.out.println(']');

        // b
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);

        // c
        Collections.sort(list);
        System.out.println(list);

        // d
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        // e
        Collections.shuffle(list);
        System.out.println(list);

        //f
        Collections.rotate(list, 1);
        System.out.println(list);

        //g
        List<Integer> unique_list = new ArrayList<>(new HashSet<>(list));
        System.out.println(unique_list);

        //h
        Set<Integer> unique_set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for (Integer i : list){
            if (unique_set.contains(i)) {
                duplicates.add(i);
            }else{
                unique_set.add(i);
            }
        }
        System.out.println(duplicates);
        list = duplicates;

        //i
        Integer[] newarr = list.toArray(new Integer[0]);
        System.out.print('[');
        for (Integer i : newarr) System.out.print(i + ", ");
        System.out.println(']');

        //j
        Map<Integer, Integer> counts = new HashMap<>();
        for(Integer i : newarr){
            if(! counts.containsKey(i)){
                counts.put(i, 1);
            }else{
                counts.put(i, counts.get(i) + 1);
            }
        }
        System.out.println(counts);

    }
    static Integer[] generate(int n){
        Random rand = new Random();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; ++i){
           arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}
