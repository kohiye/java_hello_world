package Lab2;

public class Table {
    private final int[][] m_arr;
    public Table(int rows, int cols){
        m_arr = new int[rows][cols];
        for(int i=0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j)
                m_arr[i][j] = 0;
        }
    }
    public int getValue(int row, int col){
        return m_arr[row][col];
    }
    public void setValue(int row, int col, int val){
        m_arr[row][col] = val;
    }
    public int rows(){
        return m_arr.length;
    }
    public int cols(){
        return m_arr[1].length;
    }
    public double average(){
        double sum = 0;
        for(int[] row : m_arr) for (int i : row) sum += i;
        return sum / (rows()*cols());
    }
    public String toString(){
        StringBuilder stringBuild = new StringBuilder();
        for(int[] row : m_arr){
            for(int i : row) {
                stringBuild.append(i);
                stringBuild.append(' ');
            }
            stringBuild.append('\n');
        }

        return stringBuild.toString();
    }

}
