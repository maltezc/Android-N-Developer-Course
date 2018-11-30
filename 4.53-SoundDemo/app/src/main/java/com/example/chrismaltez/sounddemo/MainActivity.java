package com.example.chrismaltez.sounddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mPlayer;


    public void audioStart(View view) {


        mPlayer.start();
    }

    public void audioPause(View view) {

        mPlayer.stop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayer = MediaPlayer.create(this, R.raw.bellstibetandanielsimon);
    }
}
