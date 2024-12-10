package Lab2;

public class Balance {
    private int m_rightWeight;
    private int m_leftWeight;
    public Balance(){
        m_leftWeight = 0;
        m_rightWeight = 0;
    }

    public void addRight(int weight){
        m_rightWeight += weight;
    }
    public void addLeft(int weight){
        m_leftWeight += weight;
    }

    public void result(){
        if(m_rightWeight == m_leftWeight)
            System.out.println('=');
        else if(m_rightWeight > m_leftWeight)
            System.out.println('R');
        else
            System.out.println('L');
    }
}
