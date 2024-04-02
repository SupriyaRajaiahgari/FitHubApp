package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Growth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_growth);
    }

    public void OnclickRedirectToBMI(View view) {
        Intent intent = new Intent(this, BMICalculator.class);
        startActivity(intent);

    }
}