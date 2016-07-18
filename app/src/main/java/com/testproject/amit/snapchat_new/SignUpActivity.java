package com.testproject.amit.snapchat_new;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;
import com.testproject.amit.firebase_class.SignUp_firebase;

public class SignUpActivity extends AppCompatActivity {

    protected EditText mUsername,mPassword,mEmail;
    protected Button mSignUp;
    private String mUrl="https://snapchat-52070.firebaseio.com/";
    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        getActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        mSignUp = (Button) findViewById(R.id.SignUp);
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String User,Pass,Email;

                mUsername = (EditText) findViewById(R.id.Name_SignUp);
                mPassword = (EditText) findViewById(R.id.Password_SignUp);
                mEmail = (EditText) findViewById(R.id.Email_SignUp);

                User = mUsername.getText().toString();
                Pass = mPassword.getText().toString();
                Email = mPassword.getText().toString();

                if(User.trim().equals("") || Pass.trim().equals("") || Email.trim().equals(""))
                {
                    //Error Dialog
                    AlertDialog.Builder alert = new AlertDialog.Builder(SignUpActivity.this);
                    alert.setTitle("OOPS!");
                    alert.setMessage("Please Fill All The Credentials");
                    alert.setPositiveButton("OK",null);

                    AlertDialog ref = alert.create() ;
                    ref.show();
                }
                else
                {
                    mRef = new Firebase(mUrl);
                    SignUp_firebase obj = new SignUp_firebase( User, Pass, Email);

                    mRef.push().setValue(obj);

                    //Clearing the rest of the text.
                    mUsername.setText("");
                    mPassword.setText("");
                    mEmail.setText("");


                }

            }
        });
    }
}
