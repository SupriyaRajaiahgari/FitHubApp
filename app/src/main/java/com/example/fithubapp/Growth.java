package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Growth extends AppCompatActivity {

    private EditText editTextWorkoutHours, editTextDays, editTextCalories;
    private Button calculateBtn, redirectToBMIBtn;
    private TextView totalTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_growth);

        editTextWorkoutHours = findViewById(R.id.editTextWorkoutHours);
        editTextDays = findViewById(R.id.editTextdays);
        editTextCalories = findViewById(R.id.editTextcalories);
        calculateBtn = findViewById(R.id.CalculateBTN);
        redirectToBMIBtn = findViewById(R.id.RedirectToBMI);
        totalTV = findViewById(R.id.TotalTV);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTotal();
            }
        });

        redirectToBMIBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectToBMI();
            }
        });
    }

    private void calculateTotal() {
        String workoutHoursStr = editTextWorkoutHours.getText().toString();
        String daysStr = editTextDays.getText().toString();
        String caloriesStr = editTextCalories.getText().toString();

        if (!workoutHoursStr.isEmpty() && !daysStr.isEmpty() && !caloriesStr.isEmpty()) {
            int workoutHours = Integer.parseInt(workoutHoursStr);
            int days = Integer.parseInt(daysStr);
            int calories = Integer.parseInt(caloriesStr);

            // Perform your calculation here
            int total = workoutHours * days * calories;
            totalTV.setText("Total: " + total);
        } else {
            totalTV.setText("Please fill in all fields");
        }
    }

    private void redirectToBMI() {
        // Redirect to BMICalculatorActivity
        Intent intent = new Intent(Growth.this, BMICalculator.class);
        startActivity(intent);
        // finish(); // Optional: Close the current activity to prevent going back with back button
    }

}

