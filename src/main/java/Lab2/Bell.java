package Lab2;

public class Bell {
    private static boolean m_state = true;
    public static void sound(){
        if(m_state)
            System.out.println("ding");
        else
            System.out.println("dong");
        m_state = !m_state;
    }
}
