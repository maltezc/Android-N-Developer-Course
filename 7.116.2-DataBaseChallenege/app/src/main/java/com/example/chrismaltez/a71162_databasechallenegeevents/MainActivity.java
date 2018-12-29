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

            SQLiteDatabase myDatabase = this.openOrCreateDatabase("Users", MODE_PRIVATE, null);

//            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS users(name VARCHAR, age INT(3))");

            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS newUsers (name VARCHAR, age INTEGER(3), id INTEGER PRIMARY KEY)");

//             myDatabase.execSQL("INSERT INTO newUsers(name, age) VALUES ('chris', 28)");
//
//            myDatabase.execSQL("INSERT INTO newUsers(name, age) VALUES ('kevin', 32)");
//
//            myDatabase.execSQL("INSERT INTO newUsers(name, age) VALUES ('johnie', 5)");

//            Cursor c = myDatabase.rawQuery("SELECT * FROM users WHERE age < 18", null); // filters for age less than 18
//            Cursor c = myDatabase.rawQuery("SELECT * FROM users WHERE name = 'chris' AND age = 21", null);
//            Cursor c = myDatabase.rawQuery("SELECT * FROM users WHERE name LIKE 'C%'", null); // searches for names taht begin with C
//            Cursor c = myDatabase.rawQuery("SELECT * FROM users WHERE name LIKE '%i%'", null); // any name with an I
//            Cursor c = myDatabase.rawQuery("SELECT * FROM users WHERE name LIKE '%i%' LIMIT 3", null); // limits to first 3 entries

//             myDatabase.execSQL("DELETE FROM newUsers WHERE id = 4"); // cant use limit to delete, better to use specific id number

//            myDatabase.execSQL("UPDATE users SET age = 2 WHERE name = 'johnie'"); // updates age


             Cursor c = myDatabase.rawQuery("SELECT * FROM newUsers", null);

            int nameIndex = c.getColumnIndex("name");
            int ageIndex = c.getColumnIndex("age");
            int idIndex = c.getColumnIndex("id");

            c.moveToFirst();

            while (c != null) {
                Log.i("name", c.getString(nameIndex));
                Log.i("age", Integer.toString(c.getInt(ageIndex)));
                Log.i("id", Integer.toString(c.getInt(idIndex)));
                c.moveToNext();
            }



        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
