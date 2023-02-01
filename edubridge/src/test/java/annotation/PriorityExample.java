package annotation;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void Gulshan(){
        System.out.println("Gulshan");
    }

    @Test
    public void Kiran(){
        System.out.println("Kiran");
    }

    @Test(priority = 2)
    public void Tanvi(){
        System.out.println("Tanvi");
    }

    @Test
    public void Komal(){
        System.out.println("Komal");
    }

    @Test
    public void ARVIND(){
        System.out.println("Arvind");
    }


}
