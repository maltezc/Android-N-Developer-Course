

package com.example.chrismaltez.a333_higherorlower;
import android.view.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;



public class MainActivity extends AppCompatActivity {

    int randomNumber;



    public void makeToast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view) {
        EditText guessEditText = (EditText) findViewById(R.id.guessEditTest);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        System.out.println(randomNumber);


        if (randomNumber > guessInt) {
            makeToast("Higher");
        } else if (randomNumber < guessInt) {
            makeToast("Lower!");
        } else if (randomNumber == guessInt) {
            makeToast("That's Right! Lets go again!");

            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        };


//        Toast.makeText(this, guessEditText.getText().toString(), Toast.LENGTH_SHORT).show();




    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random(); // launches code when app is started and doesnt change
        randomNumber = rand.nextInt(20) + 1;

    }
}

//        final int min = 0;
//        final int max = 10;
//        final int random = new Random().nextInt((max - min) + 1) + min;