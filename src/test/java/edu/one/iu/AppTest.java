package edu.one.iu;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    private LinkedList<String> list;

    @Before
    public void setUp()
    {
        list = new LinkedList<>();
    }
    @Test
    public void testIfListIsEmpty()
    {
        LinkedList<String> list = new LinkedList<>();
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testGetNext()
    {
        LinkedList<String> list2 = new LinkedList<>();
        Assert.assertEquals(null, list2.next);
    }
}
