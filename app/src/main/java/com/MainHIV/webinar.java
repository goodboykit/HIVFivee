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

public class webinar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_webinar);
    }


    public void onDiagnosisOverviewClick(View view) {
        Intent intent = new Intent(webinar.this, content.class);
        startActivity(intent);
        finish();
    }


    public void onCoursesButtonClick(View view) {
        Intent intent = new Intent(webinar.this, webinar.class);
        startActivity(intent);
        finish();
    }

    public void onTrackerButtonClick(View view) {
        Intent intent = new Intent(webinar.this, tracker.class);
        startActivity(intent);
        finish();
    }

    public void onDoctorButtonClick(View view) {
        Intent intent = new Intent(webinar.this, homepage.class);
        startActivity(intent);
        finish();
    }
}