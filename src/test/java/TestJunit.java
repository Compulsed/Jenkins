import org.junit.Test;

import junit.framework.TestCase;


public class TestJunit extends TestCase {
    @Test
    public void testAdd() {
        assertTrue("This is true again", true);
    }

    public void randomTest() {
        assertTrue("This is a random value", Math.random() > 0.5 ? true : false);
    }
}
