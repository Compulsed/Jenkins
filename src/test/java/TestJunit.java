import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestJunit {
    @Test
    public void testAdd() {

        System.out.println("Inside testAdd()");

        String str= "Junit is working fine";


        assertEquals("Junit is working fine",str);
        assertEquals(true, true);
    }
}
