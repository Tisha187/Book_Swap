package com.example.bookswap;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

public class CreateProfileActivity extends AppCompatActivity {

//    private static final String API_URL =  "https://f680-119-160-199-91.ngrok-free.app/create_profile";
    private static final int REQUEST_LOCATION_PERMISSION = 1;
    private static final int REQUEST_IMAGE_PICK = 101;

    private EditText etFirstName, etLastName, etEmail, etPhone, etBio;
    private ImageView imageView;
    private Button btnSubmit;
    private Bitmap selectedImageBitmap;
    private double latitude, longitude;

    private FusedLocationProviderClient fusedLocationClient;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        etFirstName = findViewById(R.id.et_first_name);
        etLastName = findViewById(R.id.et_last_name);
        etEmail = findViewById(R.id.et_email);
        etPhone = findViewById(R.id.et_phone);
        etBio = findViewById(R.id.et_bio);
        btnSubmit = findViewById(R.id.btn_submit);

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);



    }

}