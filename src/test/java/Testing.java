import com.accounts.server.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testing {
    @Test
    public void testAdd(){
        Calculator cal = new Calculator();
        assertEquals(5,cal.add(2,3));
    }
    @Test
    public void testSub(){
        Calculator cal = new Calculator();
        assertEquals(1,cal.subtract(3,2));
    }
}
