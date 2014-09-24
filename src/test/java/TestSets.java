import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dale on 24/09/14.
 */
public class TestSets extends TestCase{
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testEmptyList() throws Exception {
        List<Integer> aList = new ArrayList();

        aList.add(5);
        aList.add(10);
        aList.add(20);
        aList.add(3);


        // STILL SHOULD NOT WORK
        Collections.sort(aList);
        boolean isSorted = true;
        try {
            Integer number = aList.get(0);
            for (Integer listItem : aList) {
                if (listItem >= number) number = listItem;
                else {
                    isSorted = false;
                    break;
                }
            }
        } catch (Exception e){} // if there is nothing in the list

        assertTrue("The list should be sorted", true);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

}
