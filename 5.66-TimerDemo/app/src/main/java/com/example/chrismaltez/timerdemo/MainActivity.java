package com.example.chrismaltez.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Countdown Timer
        new CountDownTimer(10000, 1000) {

            public void onTick(long millisecondsUntilDone) {

                // countdown is counting down every second

                Log.i("Seconds left", String.valueOf(millisecondsUntilDone / 1000));
            }

            public void onFinish() {
                // counter is finished! (after 10 seconds)
                Log.i("Done", "Countdown Timer finished");

            }
        }.start();



        /*
        // Timer event happens every second
        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                // insert code to be run every second

                Log.i("Runnable has run!", "a second must have passed...");

                handler.postDelayed(this,1000);
            }
        };
        handler.post(run);
        */
    }
}
