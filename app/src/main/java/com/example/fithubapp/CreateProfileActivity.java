package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CreateProfileActivity extends AppCompatActivity {

    private EditText editTextFirstName, editTextLastName, editTextDateOfBirth, editTextPhoneNumber, editTextFitnessGoal;
    private Spinner spinnerGender;
    private Button saveProfileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextDateOfBirth = findViewById(R.id.editTextDateOfBirth);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        editTextFitnessGoal = findViewById(R.id.editTextFitnessGoal);
        spinnerGender = findViewById(R.id.spinnerGender);
        saveProfileBtn = findViewById(R.id.SignUpBTN);

        saveProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered profile information
                String firstName = editTextFirstName.getText().toString();
                String lastName = editTextLastName.getText().toString();
                String dateOfBirth = editTextDateOfBirth.getText().toString();
                String phoneNumber = editTextPhoneNumber.getText().toString();
                String gender = spinnerGender.getSelectedItem().toString();
                String fitnessGoal = editTextFitnessGoal.getText().toString();

                // Validate profile information (you can add more validation logic here)
                if (firstName.isEmpty() || lastName.isEmpty() || dateOfBirth.isEmpty() || phoneNumber.isEmpty() || gender.isEmpty() || fitnessGoal.isEmpty()) {
                    Toast.makeText(CreateProfileActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Save profile information (you can implement saving logic here)
                    saveProfile(firstName, lastName, dateOfBirth, phoneNumber, gender, fitnessGoal);
                }
            }
        });
    }

    private void saveProfile(String firstName, String lastName, String dateOfBirth, String phoneNumber, String gender, String fitnessGoal) {
        // Dummy implementation - you can replace this with your actual saving logic (e.g., store in database)
        Toast.makeText(CreateProfileActivity.this, "Profile saved successfully", Toast.LENGTH_SHORT).show();
        // Example: Save to database or API call
    }
    //Added onClick Property

    public void OnclickSaveProfileBTN(View view)
    {

        Intent intent = new Intent(this, BMICalculator.class);
        startActivity(intent);


    }


}