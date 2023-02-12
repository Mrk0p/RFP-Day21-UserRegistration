package com.bridgelabz.user_registration;

import com.bridgelabz.user_registration.UserRegistration;
import org.junit.Test;
import junit.framework.Assert;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Rajkumar");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_ShouldReturnFalse() {
        boolean result = userRegistration.firstName("rajkumar");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Verma");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("verma");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail_ShouldReturnTrue() {
        boolean result = userRegistration.email("rajkumar@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_ShouldReturnFalse() {
        boolean result = userRegistration.email("raj&.com");
        Assert.assertEquals(false, result);

    }
    @Test
    public void givenPhoneNumber_ShouldReturnTrue() {
        boolean result = userRegistration.mobileNumber("919865325487");
        Assert.assertEquals(true, result);

    }

    @Test
    public void givenPhoneNumber_ShouldReturnFalse() {
        boolean result = userRegistration.mobileNumber("64587541236");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_ShouldReturnTrue(){
        boolean result = userRegistration.password("Rajubhai");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_ShouldReturnFalse(){
        boolean result = userRegistration.password("asdfghjk");
        Assert.assertEquals(false, result);
    }
}
