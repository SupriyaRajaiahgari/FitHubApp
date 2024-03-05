package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WeightPlans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_plans);
    }

    public void OnclickOverweightBTN(View view) {
        Intent intent = new Intent(this, OverWeight.class);
        startActivity(intent);
    }
}