package failtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class failTestCaseScriptExample {
    @Test
    public void testCase1(){
        Assert.assertTrue(true);
    }
    @Test
    public void testCase2(){
        Assert.assertTrue(true);
    }
    @Test
    public void testCase3(){
        Assert.assertTrue(true);
    }

    @Test
    public void testCase4(){
        Assert.assertTrue(false);
    }
    @Test
    public void testCase5(){
        Assert.assertTrue(true);
    }
}
