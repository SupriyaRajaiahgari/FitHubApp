package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Underweight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_underweight);
    }

    public void OnclickImproveBTN(View view) {
        Log.d("UnderweightActivity", "Button clicked");
        Intent intent = new Intent(this, Growth.class);
        startActivity(intent);
    }

}