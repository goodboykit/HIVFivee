package com.MainHIV;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_content);

        // Initialize VideoView and set the video path
        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.vid;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        // Start the video
        videoView.start();
    }

    public void click(View view) {
        Intent intent = new Intent(content.this, tracker.class);
        startActivity(intent);
        finish();
    }
}
