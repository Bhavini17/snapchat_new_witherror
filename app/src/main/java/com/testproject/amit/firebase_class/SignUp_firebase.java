package com.testproject.amit.firebase_class;

/**
 * Created by Amit on 7/18/2016.
 */
public class SignUp_firebase {
    String User, Password, Email;

    public SignUp_firebase(){
    }

    public SignUp_firebase(String User,String Password,String Email) {
        this.User = User;
        this.Password = Password;
        this.Email = Email;
    }

    public String getUser() {
        return User;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }


}
