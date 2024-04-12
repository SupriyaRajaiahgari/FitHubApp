package com.example.fithubapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateProfileActivity extends AppCompatActivity {

    private EditText editTextFirstName, editTextLastName, editTextEmail, editTextPassword, editTextDateOfBirth, editTextPhoneNumber, editTextFitnessGoal;
    private Button SignUpBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword); // Added this line
        editTextDateOfBirth = findViewById(R.id.editTextDateOfBirth);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        editTextFitnessGoal = findViewById(R.id.editTextFitnessGoal);
        SignUpBTN = findViewById(R.id.SignUpBTN); // Changed variable name to SignUpBTN

        SignUpBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = editTextFirstName.getText().toString();
                String lastName = editTextLastName.getText().toString();
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString(); // Changed variable name to editTextPassword
                String dateOfBirth = editTextDateOfBirth.getText().toString();
                String phoneNumber = editTextPhoneNumber.getText().toString();
                String fitnessGoal = editTextFitnessGoal.getText().toString();
                // Perform validation and registration logic here
                // For example, you can check if the fields are empty and show a toast message
                if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || dateOfBirth.isEmpty() || phoneNumber.isEmpty() || fitnessGoal.isEmpty()) {
                    Toast.makeText(CreateProfileActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Registration logic
                    // You can proceed with registering the user in your database or authentication system
                    // For demonstration purposes, show a toast message
                    Toast.makeText(CreateProfileActivity.this, "Profile Created successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(CreateProfileActivity.this, LoginActivity.class);
                    startActivity(intent);
                }



            }
        });
    }

//    //Added onClick Property
//
//    public void OnclickSignUpBTN(View view)
//    {
//
//        Intent intent = new Intent(this, LoginActivity.class);
//        startActivity(intent);
//    }


}