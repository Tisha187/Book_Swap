package com.example.bookswap;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    TextView signinText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        signinText = findViewById(R.id.signinText);

        signinText.setOnClickListener(this::openLoginActivity);

        Button registerButton = findViewById(R.id.btn_register);
        registerButton.setOnClickListener(v -> {
            // Handle registration logic here
        });
    }

    public void openLoginActivity(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
