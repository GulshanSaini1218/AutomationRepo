package annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = {"p0"})
    public void testcase1(){
        System.out.println("test case 1");
        Assert.assertFalse(true);
    }

    @Test(groups = {"p1"})
    public void testcase2(){
        System.out.println("test case 2");

    }

    @Test
    public void testcase3(){
        System.out.println("test case 3");

    }

    @Test(dependsOnGroups = "p0")
    public void testcase4(){
        System.out.println("test case 4");

    }


}
