import org.junit.Test;

import junit.framework.TestCase;


public class TestJunit extends TestCase {
    @Test
    public void testAdd() {
        assertTrue("This is true again", true);
    }

    @Test
    public void testRandom() {
        assertTrue("This is a random value", Math.random() > 0.5 ? true : false);
    }
}
