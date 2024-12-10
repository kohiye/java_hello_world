package Lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void getValue() {
        Table table = new Table(3,4);
    }

    @Test
    void rows() {
        Table table = new Table(55,4);
        assertEquals(55, table.rows());
    }

    @Test
    void cols() {
        Table table = new Table(3,2);
        assertEquals(2, table.cols());
    }

    @Test
    void average() {
        Table table = new Table(2,3);
        table.setValue(0,0,100);
        table.setValue(0,2,-190);
        table.setValue(1,2, 10);
        table.setValue(1,1, 20);
        assertEquals(-10, table.average());
    }
}