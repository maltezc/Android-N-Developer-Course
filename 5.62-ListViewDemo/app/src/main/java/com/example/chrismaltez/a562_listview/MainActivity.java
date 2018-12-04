package com.example.chrismaltez.a562_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView myListView = (ListView) findViewById(R.id.myListView);

        final ArrayList<String> myFriends = new ArrayList<>();
        myFriends.add("jordan");
        myFriends.add("kevin");
        myFriends.add("Yukun");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFriends);
        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "hello " + myFriends.get(position), Toast.LENGTH_LONG).show();
            }
        });



//        ListView myListView = (ListView) findViewById(R.id.myListView);
//
//        final ArrayList<String> myFamily = new ArrayList<String>();
//
//        myFamily.add("keivn");
//        myFamily.add("mom");
//        myFamily.add("dad");
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
//
//        myListView.setAdapter(arrayAdapter);
//
//        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.i("Person Tapped:", myFamily.get(position));
//            }
//        });




    }
}
