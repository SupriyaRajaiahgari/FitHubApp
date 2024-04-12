package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    TextView forgotPasswordTV = findViewById(R.id.ForgotPassword);
forgotPasswordTV.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        Intent intent = new Intent(getApplicationContext(), ForgotPasswordActivity.class);
        startActivity(intent);
    }
    });
}



    public void OnclickLoginBTN(View view) {
        Intent intent = new Intent(this, CreateProfileActivity.class);
        startActivity(intent);
    }


        //Added onClick property
        public void OnclickRegisterBTN (View view){
            Intent intent1 = new Intent(this, RegisterActivity.class);
            startActivity(intent1);

        }


    }




