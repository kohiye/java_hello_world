package Lab2;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private final List<Integer> m_evens;
    private final List<Integer> m_odds;
    public OddEvenSeparator(){
        m_evens = new ArrayList<>();
        m_odds = new ArrayList<>();
    }

    public void addNumber(int num){
        if (num % 2 == 0)
            m_evens.add(num);
        else
            m_odds.add(num);
    }

    public void even(){
        for (Integer mEven : m_evens) System.out.printf("%d ",mEven);
        System.out.print('\n');
    }
    public void odd(){
        for (Integer mOdd : m_odds) System.out.printf("%d ",mOdd);
        System.out.print('\n');
    }
}
