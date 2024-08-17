package com.example.bookswap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView signupText = findViewById(R.id.signupText);
        signupText.setOnClickListener(this::openRegisterActivity);

        Button loginButton = findViewById(R.id.btn_login);
        loginButton.setOnClickListener(v -> {
            // Handle login logic here
            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);
        });
    }

    public void openRegisterActivity(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
