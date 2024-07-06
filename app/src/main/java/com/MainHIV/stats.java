package com.MainHIV;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class stats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_stats);
    }

    public void doci(View view) {
        Intent intent = new Intent(stats.this, homepage.class);
        startActivity(intent);
        finish();
    }

    public void course(View view) {
        Intent intent = new Intent(stats.this, webinar.class);
        startActivity(intent);
        finish();
    }

    public void track(View view) {
        Intent intent = new Intent(stats.this, tracker.class);
        startActivity(intent);
        finish();
    }

    public void analy(View view) {
        Intent intent = new Intent(stats.this, tracker.class);
        startActivity(intent);
        finish();
    }


}
