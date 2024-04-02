package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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

        public void OnclickForgotPasswordBTN (View view){
            Intent intent2 = new Intent(this, ForgotPasswordActivity.class);
            startActivity(intent2);
        }
    }

