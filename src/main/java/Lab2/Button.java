package Lab2;

public class Button {
    private int m_clicks;
    public Button(){
        this.m_clicks = 0;
    }
    public void click(){
        ++ m_clicks;
        System.out.println(m_clicks);
    }
}
