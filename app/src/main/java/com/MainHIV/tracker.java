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

public class tracker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tracker);

    }

    public void doci(View view) {
        Intent intent = new Intent(tracker.this, homepage.class);
        startActivity(intent);
        finish();
    }

    public void course(View view) {
        Intent intent = new Intent(tracker.this, content.class);
        startActivity(intent);
        finish();
    }

    public void track(View view) {
        Intent intent = new Intent(tracker.this, tracker.class);
        startActivity(intent);
        finish();
    }

    public void analy(View view) {
        Intent intent = new Intent(tracker.this, tracker.class);
        startActivity(intent);
        finish();
    }


}