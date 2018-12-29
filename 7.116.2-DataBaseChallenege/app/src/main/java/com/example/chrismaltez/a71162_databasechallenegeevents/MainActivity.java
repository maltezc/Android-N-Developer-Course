package com.example.chrismaltez.a71162_databasechallenegeevents;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            SQLiteDatabase myDatabase = this.openOrCreateDatabase("Events", MODE_PRIVATE, null);

            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS events(title VARCHAR, year INT(4))");

            myDatabase.execSQL("INSERT INTO events(title, year) VALUES ('Pearl Harbor', 1942)");

            myDatabase.execSQL("INSERT INTO events(title, year) VALUES ('World War1', 1914)");

            Cursor c = myDatabase.rawQuery("SELECT * FROM events", null);

            int eventIndex = c.getColumnIndex("title");
            int yearIndex = c.getColumnIndex("year");

            c.moveToFirst();

            while (c != null) {
                Log.i("title", c.getString(eventIndex));
                Log.i("year", Integer.toString(c.getInt(yearIndex)));
                c.moveToNext();
            }



        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
