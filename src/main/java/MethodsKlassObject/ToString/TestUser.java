package MethodsKlassObject.ToString;

import MethodsKlassObject.ToString.ClassUser;
import org.testng.annotations.Test;

public class TestUser {
    @Test
    public void userToString(){
        ClassUser user = new ClassUser("Serg", 45);
        ClassUser user1 = new ClassUser("Ivan", 25);
        System.out.println(user.toString());
        System.out.println(user1.toString());
    }
    @Test
    public void userHashCode(){

        System.out.println("Hash code city = " + hashCode());
    }

}
