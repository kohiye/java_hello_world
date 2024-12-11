package Lab3;

import java.util.Comparator;

public class HumanComparatorByLastName implements Comparator<Human> {
    @Override
    public int compare(Human human, Human other) {
        return human.get_lastname().compareTo(other.get_lastname());
    }
}
