package com.MainHIV;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class privacy extends AppCompatActivity {
    CheckBox termsCheckbox, privacyCheckbox, dataCheckbox;
    Button nextButton;
    ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_privacy);

        termsCheckbox = findViewById(R.id.termsCheckbox);
        privacyCheckbox = findViewById(R.id.privacyCheckbox);
        dataCheckbox = findViewById(R.id.dataCheckbox);
        nextButton = findViewById(R.id.nextButton);
        backButton = findViewById(R.id.backButton);



        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (termsCheckbox.isChecked() && privacyCheckbox.isChecked() && dataCheckbox.isChecked()) {
                    Intent intent = new Intent(privacy.this, login.class);
                    startActivity(intent);
                } else {
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

      


    }
}