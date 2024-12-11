package Lab3;

import java.util.*;

public class HumanStuff {
    public static void run(){
        // a) hash set has no defined order
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Andrea", "Bogg", 29));
        humans.add(new Human("Patrick", "Glek", 40));
        humans.add(new Human("Lucy", "Alan", 23));
        humans.add(new Human("John", "Smith", 80));
        HashSet<Human> humanHashSet = new HashSet<>(humans);
        printHumanSet(humanHashSet);

        // b) linked hash set has order of the list
        LinkedHashSet<Human> humanLinkedHashSet = new LinkedHashSet<>(humans);
        printHumanSet(humanLinkedHashSet);

        // c) tree set sorts using Comparable interface
        TreeSet<Human> humanTreeSet = new TreeSet<>(humans);
        printHumanSet(humanTreeSet);

        // d) sorts using custom comparator
        TreeSet<Human> humanComp = new TreeSet<>(new HumanComparatorByLastName());
        humanComp.addAll(humans);
        printHumanSet(humanComp);

        // e) sorts using lambda
        TreeSet<Human> humanLambdaSet = new TreeSet<>((h1, h2) -> Integer.compare(h2.get_age(), h1.get_age()));
        humanLambdaSet.addAll(humans);
        printHumanSet(humanLambdaSet);
    }
    public static void printHumanSet(Set<Human> set){
        System.out.print("[");
        Iterator<Human> iter = set.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next().asString());
            if(iter.hasNext())
                System.out.print(", ");
        }

        System.out.print("]\n");
    }
}
