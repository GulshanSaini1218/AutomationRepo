package annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test
    public void verifyLogin(){
        System.out.println("Verify Login");
        Assert.assertFalse(true);
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void verifyRegister(){
        System.out.println("Verify Register");
    }

    @Test
    public void verifyUser(){
        System.out.println("Verify user");
    }

    @Test(dependsOnMethods = "verifyUser")
    public void verifyHomePage(){
        System.out.println("Verify Homepage");
    }

}
