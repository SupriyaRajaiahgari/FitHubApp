package com.example.fithubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        // Initialize views
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.LoginBTN);

        // Set onClickListener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Check if username and password are valid (this is just a placeholder)
                if (isValidLogin(username, password)) {
                    // Navigate to CreateProfileActivity upon successful login
                    navigateToCreateProfileActivity();
                } else {
                    // Show a toast message indicating invalid credentials
                    Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    TextView forgotPasswordTV = findViewById(R.id.ForgotPassword);
forgotPasswordTV.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        Intent intent = new Intent(getApplicationContext(), ForgotPasswordActivity.class);
        startActivity(intent);

    }
    });
}



    // Placeholder method to check login credentials (replace with your actual logic)
    private boolean isValidLogin(String username, String password) {
        // Dummy check, replace with your actual login logic
        return username.equals("demo") && password.equals("demo123");
    }

    // Method to navigate to CreateProfileActivity
    private void navigateToCreateProfileActivity() {
        Intent intent = new Intent(LoginActivity.this, CreateProfileActivity.class);
        startActivity(intent);
        finish(); // Optional: Finish the LoginActivity so the user can't go back using the back button
    }

//    public void OnclickLoginBTN(View view) {
//       Intent intent = new Intent(this, CreateProfileActivity.class);
//        startActivity(intent);
//    }


        //Added onClick property



    }




