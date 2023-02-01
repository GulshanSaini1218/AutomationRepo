package annotation;

import org.testng.annotations.Test;

public class DisabledExample {

    @Test
    public void testcase1(){
        System.out.println("test case 1");

    }

    @Test(alwaysRun = true)
    public void testcase2(){
        System.out.println("test case 2");

    }

    @Test(enabled = false)
    public void testcase3(){
        System.out.println("test case 3");

    }

    @Test
    public void testcase4(){
        System.out.println("test case 4");

    }
}
