package com.MainHIV;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class QrCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_qr_code);
    }

    // Method to handle "Back to Homepage" button click
    public void onBackToHomePageClick(View view) {
        Intent intent = new Intent(this, tracker.class);
        startActivity(intent);
        finish(); // Close the current activity (QrCode activity)
    }

    public void onDiagnosisOverviewClick(View view) {
        Intent intent = new Intent(QrCode.this, content.class);
        startActivity(intent);
        finish();
    }


    public void onCoursesButtonClick(View view) {
        Intent intent = new Intent(QrCode.this, webinar.class);
        startActivity(intent);
        finish();
    }

    public void onTrackerButtonClick(View view) {
        Intent intent = new Intent(QrCode.this, tracker.class);
        startActivity(intent);
        finish();
    }

    public void onDoctorButtonClick(View view) {
        Intent intent = new Intent(QrCode.this, homepage.class);
        startActivity(intent);
        finish();
    }
}