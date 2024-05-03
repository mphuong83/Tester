import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.example.Main;

public class TestMain {
    @Test
    public void TestAdd(){
        Main n = new Main();
        int result = n.add(2, 3);
        assertEquals(5, result);
    }
    @Test
    public void TestSubtract(){
        Main n = new Main();
        int result = n.subtract(10, 5);
        assertEquals(1, result);
    }
}