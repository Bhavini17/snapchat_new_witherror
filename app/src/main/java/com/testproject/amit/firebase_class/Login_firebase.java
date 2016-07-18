package com.testproject.amit.firebase_class;

/**
 * Created by Amit on 7/18/2016.
 */
public class Login_firebase {

    String User, Password;
    Login_firebase(){
    }

    Login_firebase(String User,String Password) {
        this.User = User;
        this.Password = Password;
    }

    public String getUser() {
        return User;
    }

    public String getPassword() {
        return Password;
    }

}
