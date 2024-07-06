package com.MainHIV;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class tracker extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnMen2Men, btnWomen2Women, btnWomen2Men;

    private ImageButton btnAnal, btnOral;

    private ImageButton btnProtected, btnUnprotected, btnWithdrawal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tracker);

        btnMen2Men = findViewById(R.id.btnMen2Men);
        btnWomen2Women = findViewById(R.id.btnWomen2Women);
        btnWomen2Men = findViewById(R.id.btnWomen2Men);

        btnAnal = findViewById(R.id.btnAnal);
        btnOral = findViewById(R.id.btnOral);

        btnProtected = findViewById(R.id.btnProtected);
        btnUnprotected = findViewById(R.id.btnUnprotected);
        btnWithdrawal = findViewById(R.id.btnWithdrawal);

        btnMen2Men.setOnClickListener(this);
        btnWomen2Women.setOnClickListener(this);
        btnWomen2Men.setOnClickListener(this);
        btnAnal.setOnClickListener(this);
        btnOral.setOnClickListener(this);
        btnProtected.setOnClickListener(this);
        btnUnprotected.setOnClickListener(this);
        btnWithdrawal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        toggleButtonSelection((ImageButton) v);
    }

    private void toggleButtonSelection(ImageButton button) {
        boolean isSelected = button.getTag() != null && (boolean) button.getTag();
        if (isSelected) {
            button.setBackgroundResource(R.color.white);
            button.setTag(false);
        } else {
            button.setBackgroundResource(R.color.highlight);
            button.setTag(true);
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void doci(View view) {
        Intent intent = new Intent(tracker.this, homepage.class);
        startActivity(intent);
        finish();
    }

    public void course(View view) {
        Intent intent = new Intent(tracker.this, webinar.class);
        startActivity(intent);
        finish();
    }

    public void track(View view) {
        Intent intent = new Intent(tracker.this, tracker.class);
        startActivity(intent);
        finish();
    }


    public void stats(View view) {
        Intent intent = new Intent(tracker.this, stats.class);
        startActivity(intent);
        finish();
    }
}
