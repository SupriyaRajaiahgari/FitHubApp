package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bodybuild extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodybuild);
    }

    public void OnclickImproveBTN(View view) {
        Intent intent = new Intent(this, Growth.class);
        startActivity(intent);

    }
}