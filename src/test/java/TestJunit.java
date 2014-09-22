import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestJunit {
    @Test
    public void testAdd() {
        System.out.println("Inside testAddz()");

        assertEquals(true,true);
        assertEquals(true,true);
        assertEquals(true,true);
    }

    @Test
    public void trueTest() {
        System.out.println("Inside anotherTest()");


        assertEquals(true, true);
    }

    @Test
    public void failTest() {
        System.out.println("Inside failTest()");


        assertEquals(true, true);
    }

    @Test
    public void failTest2() {
        System.out.println("Inside fail2Test()");

        assertEquals(true, true);
    }
}
