package com.example.chrismaltez.a564_timestables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // SeekBar
        SeekBar numberRange = (SeekBar) findViewById(R.id.numberRange);

        numberRange.setMax(20);
        numberRange.setMin(1);

        numberRange.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//            Log.i("SeekBar Value", Integer.toString(progress));
                Toast.makeText(MainActivity.this, Integer.toString(progress), Toast.LENGTH_SHORT).show();


                // create list view
                ListView myListView = (ListView) findViewById(R.id.myListView);

                // create array of arrays
                ArrayList<String> numbers = new ArrayList<String>();

                for (int i=0;i<13; i++) {
                    Integer newNumbers;
                    String stringNums;
                    if (progress != 1) {
                        newNumbers = i * progress;
                        stringNums = Integer.toString(newNumbers);
                        numbers.add(stringNums);

                    } else {
                        numbers.add(Integer.toString(i));
                    }
                }

                // display arrays
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, numbers);
                myListView.setAdapter(arrayAdapter);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });







    }
}
