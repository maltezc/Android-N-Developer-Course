package com.example.chrismaltez.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {
        ImageView car1 = (ImageView) findViewById(R.id.car1);
        //ImageView moto1 = (ImageView) findViewById(R.id.moto1);


        car1.animate().scaleX(2.0f).scaleY(2.0f).translationYBy(10f).rotation(3600f).setDuration(2000);

//        car1.animate().scaleX(2.0f).scaleY(2.0f).setDuration(2000);
//        car1.animate().translationYBy(10f).setDuration(2000);
//        car1.animate().rotation(3600f).setDuration(2000);

//        car1.animate().translationXBy(1000f).setDuration(2000);

        //car1.animate().alpha(1f).setDuration(2000); //add an "f" at the end of the number (0-1) to stand as float
        //moto1.animate().alpha(0f).setDuration(2000); //add an "f" at the end of the number (0-1) to stand as float



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView car1 = (ImageView) findViewById(R.id.car1);

        car1.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        /*ImageView car1 = (ImageView) findViewById(R.id.car1);
        car1.setTranslationX(-1000f);
        */

    }
}
