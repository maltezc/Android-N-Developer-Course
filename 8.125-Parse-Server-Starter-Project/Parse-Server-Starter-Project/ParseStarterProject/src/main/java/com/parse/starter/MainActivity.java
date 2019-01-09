/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;


public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ParseUser.logOut();

    if (ParseUser.getCurrentUser() != null) { // means user is logged in

      Log.i("currentUser", "user logged in " + ParseUser.getCurrentUser().getUsername());

    } else {

      Log.i("CurrentUser", "User is not logged in");

    }

    /*

    ParseUser.logInInBackground("robpercival", "asdf", new LogInCallback() {
      @Override
      public void done(ParseUser user, ParseException e) {
        if (user != null) {

          Log.i("login", "succesful");

        } else {

          Log.i("login", "failed " + e.toString());
        }
      }
    });

    */


/*
    ParseUser user = new ParseUser();
    user.setUsername("robpercival");
    user.setPassword("myPass");

    user.signUpInBackground(new SignUpCallback() {
      @Override
      public void done(ParseException e) {

        if (e == null) {

          Log.i("Sign Up", "Successful");

        } else {

          Log.i("Sign up", "Failed");

        }
      }

      });
      */


/* how to add points to "score
    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

    query.whereGreaterThan("score", 200);

    query.findInBackground(new FindCallback<ParseObject>() {
      @Override
      public void done(List<ParseObject> objects, ParseException e) {
        if (e == null & objects != null) {

          for (ParseObject object : objects) {

            object.put("score", object.getInt("score") + 50);
            object.saveInBackground();
          }

        }
      }
    });
*/


/*
    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

    query.whereEqualTo("username", "tommy");
    query.setLimit(1);

    query.findInBackground(new FindCallback<ParseObject>() {
      @Override
      public void done(List<ParseObject> objects, ParseException e) {

        if (e == null) {

          Log.i("findInBackground", "Retrieved " + objects.size() + "objects");

          if (objects.size() > 0) {

            for (ParseObject object : objects) {

              Log.i("findInBackground", Integer.toString(object.getInt("score")));
            }
          }
        }

      }
    });
*/

/*
    ParseQuery<ParseObject> query = ParseQuery.getQuery("Tweets");
    query.getInBackground("ewjG6Npqpl", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {
        if (e == null && object != null) {
          object.put("tweet", "here is a revised tweet");
          object.saveInBackground();
          Log.i("ObjectValue", object.getString("username"));
          Log.i("ObjectValue", object.getString("tweet"));
        }
      }
    });
    */

/*
    ParseObject tweet = new ParseObject("Tweets");
    tweet.put("username", "chris");
    tweet.put("tweet","hello world");
    tweet.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if (e == null) {
          Log.i("TweetStatus", "there is a new tweet");
        } else {
          Log.i("TweetStatus", "Tweet failed");
        }
      }
    });
    */

    /*
    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

    query.getInBackground("G8DUx7j7ux", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {
        if (e == null && object != null) {

          object.put("score", 200);
          object.saveInBackground();
          Log.i("ObjectValue", object.getString("username"));
          Log.i("ObjectValue", Integer.toString(object.getInt("score")));
        }
      }
    });
    */

/*
    ParseObject score = new ParseObject("Score");
    score.put("username", "rob");
    score.put("score", 86);
    score.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {

        if (e == null) {
          Log.i("Save in background", "successful");

        } else {

          Log.i("Save in background", "Failed. Error: " + e.toString());

        }


      }
    });
*/

    ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }

}