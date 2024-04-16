
package com.example.fithubapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class CreateProfileActivity extends AppCompatActivity {

    private EditText editTextFirstName, editTextLastName, editTextEmail, editTextPassword, editTextDateOfBirth, editTextPhoneNumber, editTextFitnessGoal;
    private Button signUpButton;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextDateOfBirth = findViewById(R.id.editTextDateOfBirth);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        editTextFitnessGoal = findViewById(R.id.editTextFitnessGoal);
        signUpButton = findViewById(R.id.SignUpBTN);

        mAuth = FirebaseAuth.getInstance();

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = editTextFirstName.getText().toString();
                String lastName = editTextLastName.getText().toString();
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();
                String dateOfBirth = editTextDateOfBirth.getText().toString();
                String phoneNumber = editTextPhoneNumber.getText().toString();
                String fitnessGoal = editTextFitnessGoal.getText().toString();

                if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || dateOfBirth.isEmpty() || phoneNumber.isEmpty() || fitnessGoal.isEmpty()) {
                    Toast.makeText(CreateProfileActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else if (!isValidPhoneNumber(phoneNumber)) {
                    Toast.makeText(CreateProfileActivity.this, "Please enter a valid phone number", Toast.LENGTH_SHORT).show();
                } else if (!isValidPassword(password)) {
                    Toast.makeText(CreateProfileActivity.this, "Password should contain at least one uppercase letter, one digit, and one special character", Toast.LENGTH_SHORT).show();
                } else {
                    // Create user in Firebase Authentication
                    mAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(CreateProfileActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign up success, update UI with the signed-in user's information
                                        Toast.makeText(CreateProfileActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();
                                        // Proceed to BMI Calculator or other activity
                                        startActivity(new Intent(CreateProfileActivity.this, LoginActivity.class));
                                        finish(); // Finish the current activity
                                    } else {
                                        // If sign up fails, display a message to the user.
                                        Toast.makeText(CreateProfileActivity.this, "Registration failed", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        // Check if the phone number contains only digits and has a length of 10
        return phoneNumber.matches("\\d{10}");
    }

    private boolean isValidPassword(String password) {
        // Check if the password contains at least one uppercase letter, one digit, and one special character
        return password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    }
}