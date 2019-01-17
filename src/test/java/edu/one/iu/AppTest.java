package edu.one.iu;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testIfListIsEmpty()
    {
        LinkedList<String> list = new LinkedList<>();
        Assert.assertEquals(0, list.size());
    }
}
