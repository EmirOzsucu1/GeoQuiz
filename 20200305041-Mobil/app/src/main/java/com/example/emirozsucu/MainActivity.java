package com.example.emirozsucu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    public Button btnstr;

    public Button btnabt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        btnabt = findViewById(R.id.aboutbutton);
        btnabt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(MainActivity.this, aboutactivty.class);
                startActivity(btn);
            }
        });
        btnstr = findViewById(R.id.buttonstart);
        btnstr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent str = new Intent(MainActivity.this, quizactivity.class);
                startActivity(str);
            }
        });
    }
}