import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestJunit {
    @Test
    public void testAdd() {
        System.out.println("Inside testAddz()");

        assertEquals(true,false);
        assertEquals(false,false);
        assertEquals(false,true);
    }

    @Test
    public void trueTest() {
        System.out.println("Inside anotherTest()");


        assertEquals(true, true);
    }

    @Test
    public void failTest() {
        System.out.println("Inside failTest()");


        assertEquals(true, false);
    }

    @Test
    public void failTest2() {
        System.out.println("Inside fail2Test()");

        assertEquals(true, false);
    }
}
