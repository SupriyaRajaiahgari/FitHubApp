package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPasswordActivity extends AppCompatActivity {

    private EditText emailEditText;
    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        emailEditText = findViewById(R.id.EmailET);
        resetButton = findViewById(R.id.ResetBTN);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();

                // Validate email format here (optional)

                // For demonstration purposes, show a toast message
                // Replace this with your actual password reset logic
                if (!email.isEmpty()) {
                    Toast.makeText(ForgotPasswordActivity.this, "Password reset link sent to " + email, Toast.LENGTH_SHORT).show();
                    // Example: Send password reset email or navigate to password reset activity
                    Intent intent = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
                    startActivity(intent);
                } else {
                    // Empty email, show error message
                    Toast.makeText(ForgotPasswordActivity.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}