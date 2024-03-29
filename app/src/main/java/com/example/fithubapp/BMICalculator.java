package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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


        public void calculateBMI(View v) {
            int color = 0;
            try {
                EditText Weight = findViewById(R.id.WeightET);
                EditText Height = findViewById(R.id.HeightET);
                TextView display = findViewById(R.id.displayTV);

                double WT = Double.parseDouble(Weight.getText().toString());
                double HT = Double.parseDouble(Height.getText().toString());
                double bmi = (WT / (HT * HT)) * 10000;

                String Text = String.format("BMI: %.2f", bmi);


                if (bmi < 18.5) {
                    Text += "\nCategory: Under weight";
                    color = getResources().getColor(android.R.color.holo_blue_light);
                } else if (bmi < 24.9) {
                    Text += "\nCategory: Normal weight";
                    color = getResources().getColor(android.R.color.holo_green_light);
                } else if (bmi < 29.9) {
                    Text += "\nCategory: Over weight";
                    color = getResources().getColor(android.R.color.holo_orange_light);
                } else {
                    Text += "\nCategory: Obese";
                    color = getResources().getColor(android.R.color.holo_red_light);
                }
                display.setText(Text);
                display.setTextColor(color);
                display.setTypeface(null, Typeface.BOLD);
            }
            catch (NumberFormatException e) {
                TextView displayTV = findViewById(R.id.displayTV);
                displayTV.setText("Please enter valid weight and height.");


            }
        }
        public void clear(View v) {
            EditText WeightET = findViewById(R.id.WeightET);
            EditText HeightET = findViewById(R.id.HeightET);
            TextView displayTV = findViewById(R.id.displayTV);
            WeightET.getText().clear();
            HeightET.getText().clear();
            displayTV.setText(" ");
        }
    }
