package com.testproject.amit.snapchat_new;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Amit on 7/17/2016.
 */
public class InitFirebase extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
