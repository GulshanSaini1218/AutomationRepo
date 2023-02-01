package annotation;

import org.testng.annotations.Test;

public class InvocationCountAndTimeoutExample {

    @Test(invocationCount = 10000, invocationTimeOut = 1)
    public void Testcase1(){
        System.out.println("test case 1");
    }

    @Test
    public void Testcase2(){
        System.out.println("tese case 2");
    }

    @Test
    public void Testcase3(){
        System.out.println("tese case 3");
    }
}
