package com.MainHIV;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Doctors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_doctors);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Enable the back button on the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        // Locate the "Book appointment" button
        Button bookAppointmentButton = findViewById(R.id.bookAppointmentButton);

        // Set OnClickListener to handle button click
        bookAppointmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doctors.this, Appointment.class);
                startActivity(intent);
            }
        });
    }

    public void onDiagnosisOverviewClick(View view) {
        Intent intent = new Intent(Doctors.this, content.class);
        startActivity(intent);
        finish();
    }


    public void onCoursesButtonClick(View view) {
        Intent intent = new Intent(Doctors.this, webinar.class);
        startActivity(intent);
        finish();
    }

    public void onTrackerButtonClick(View view) {
        Intent intent = new Intent(Doctors.this, tracker.class);
        startActivity(intent);
        finish();
    }

    public void onDoctorButtonClick(View view) {
        Intent intent = new Intent(Doctors.this, homepage.class);
        startActivity(intent);
        finish();
    }
}


