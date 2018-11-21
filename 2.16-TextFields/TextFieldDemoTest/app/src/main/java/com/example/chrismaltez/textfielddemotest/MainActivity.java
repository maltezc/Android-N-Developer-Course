package com.example.chrismaltez.textfielddemotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;

import java.net.PasswordAuthentication;

public class MainActivity extends AppCompatActivity {



    public void clickFunction (View view) {

        EditText userNameText = (EditText) findViewById(R.id.userNameText);
        EditText PWeditText = (EditText) findViewById(R.id.PWeditText);

        Log.i("Username", userNameText.getText().toString());
        Log.i("Password", PWeditText.getText().toString());

        Toast.makeText(MainActivity.this, "hi there " + userNameText.getText().toString(), Toast.LENGTH_SHORT).show();

        ImageView varCarImage = (ImageView) findViewById(R.id.CarImage);
        varCarImage.setImageResource(R.drawable.cars2);


    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
