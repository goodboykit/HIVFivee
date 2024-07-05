package com.MainHIV;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {

    private MyDbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signup);

        dbHelper = new MyDbHelper(this);

        EditText etUsername = findViewById(R.id.etUsername);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etMobileNumber = findViewById(R.id.etMobileNumber);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnSignUp = findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String phoneNumber = etMobileNumber.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if (username.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || password.isEmpty()) {
                    Toast.makeText(signup.this, "All fields are required", Toast.LENGTH_SHORT).show();
                } else {
                    long result = addUserToDatabase(username, email, phoneNumber, password);
                    if (result == -1) {
                        Toast.makeText(signup.this, "Account creation failed", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(signup.this, "Account successfully created", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private long addUserToDatabase(String fullName, String email, String phoneNumber, String userPassword) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("fullName", fullName);
        values.put("email", email);
        values.put("phoneNumber", phoneNumber);
        values.put("userPassword", userPassword);
        long result = db.insert("users", null, values);
        db.close();
        return result;
    }
}
