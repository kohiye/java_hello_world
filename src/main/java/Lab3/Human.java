package Lab3;


public class Human implements Comparable<Human> {
    private final String m_firstname;
    private final String m_lastname;
    private final int m_age;

    public Human(String first, String last, int age){
        this.m_firstname = first;
        this.m_lastname = last;
        this.m_age = age;
    }

    @Override
    public int compareTo(Human other){
        int cmp;
        if((cmp = m_lastname.compareTo(other.m_lastname)) != 0) {
            return cmp;
        }
        else if ((cmp += m_firstname.compareTo(other.m_firstname)) != 0) {
            return cmp;
        }
        else if ((cmp += Integer.compare(m_age, other.m_age)) != 0) {
            return cmp;
        }
        return 0;
    }

    public String get_lastname() {
        return m_lastname;
    }

    public int get_age() {
        return m_age;
    }
    public String asString(){
        return  m_firstname + " " + m_lastname + " ( " + m_age + " )";
    }
}
