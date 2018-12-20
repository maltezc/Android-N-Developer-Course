package com.example.chrismaltez.downloadingimages;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    ImageView downloadedImg;

    public void downloadImage(View view) throws ExecutionException, InterruptedException {

//        https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwiq2eyazqXfAhWwHzQIHSjsCK8QjRx6BAgBEAU&url=https%3A%2F%2Fbringatrailer.com%2Flisting%2F2005-lotus-elise-30%2F&psig=AOvVaw2ev3ntznoS3XpiH0-UuVug&ust=1545092881597569
        String carlink = "https://upload.wikimedia.org/wikipedia/en/a/aa/Bart_Simpson_200px.png";

        ImageDownloader task = new ImageDownloader();
        Bitmap myImage;

        myImage = task.execute(carlink).get();
        downloadedImg.setImageBitmap(myImage);

        Log.i("button", "Ive been tapped");

}
 


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        downloadedImg = (ImageView)findViewById(R.id.imageView);
    }

    public class ImageDownloader extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... urls) {
            try {
                URL url = new URL(urls[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.connect();

                InputStream inputStream = connection.getInputStream();

                Bitmap myBitmap = BitmapFactory.decodeStream(inputStream);

                return myBitmap;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        };
    }
}
