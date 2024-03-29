package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
    }
    //Added onClick Property
    public void OnclickSaveProfileBTN(View view)
    {

        Intent intent = new Intent(this, BMICalculator.class);
        startActivity(intent);


    }


}