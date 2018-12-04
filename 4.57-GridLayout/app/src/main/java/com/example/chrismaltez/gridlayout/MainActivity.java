package com.example.chrismaltez.gridlayout;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void audioStart(View view) {

            int id = view.getId();
            String ourId = "";

            ourId = view.getResources().getResourceEntryName(id);

            int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.chrismaltez.gridlayout");

            MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
            mplayer.start();

            Log.i("button tapped", ourId);
            Log.i("button tapped", Integer.toString(resourceId));
        }

}
