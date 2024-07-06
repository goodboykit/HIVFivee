package com.MainHIV;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Anonymous extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_anonymous);
    }

    public void course(View view) {
        Intent intent = new Intent(Anonymous.this, AnonymousContent.class);
        startActivity(intent);
        finish();
    }
    public void track(View view) {
        Intent intent = new Intent(Anonymous.this, tracker.class);
        startActivity(intent);
        finish();
    }


}