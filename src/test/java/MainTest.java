import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    String message = "Main test message";

    @Test
    public void message(){
        assertEquals("Main test message", message);
    }
}
