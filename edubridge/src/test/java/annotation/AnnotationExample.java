package annotation;

import org.testng.annotations.*;

public class AnnotationExample {

    @BeforeClass
    public void beforeclass(){
        System.out.println("Before class Example");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("Before Method Example");
    }

    @Test
    public void Testcase1(){
        System.out.println("This is test case 1");
    }

    @Test
    public void Testcase2(){
        System.out.println("This is test case 2");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("After Method Example");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("After class Example");
    }

}
