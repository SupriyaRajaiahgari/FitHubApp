package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BMICalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);
    }

    public void OnclickNextBTN(View view) {
        Intent intent = new Intent(this, WeightPlans.class);
        startActivity(intent);
    }
}