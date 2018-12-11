package com.example.chrismaltez.braintrainer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView timerTextView;
    TextView scoreText;
    Boolean counterIsActive = false;
    TextView questionText;
    GridLayout gridLayout;
    TextView resultText;
    Button topLeft;
    Button topRight;
    Button bottomLeft;
    Button bottomRight;
    CountDownTimer countDownTimer;
    Button controllerButton;


    Random rand = new Random();
    int firstInt = rand.nextInt(50) + 1;
    int secondInt = rand.nextInt(50) + 1;
    //50 is the maximum and the 1 is our minimum.

    public void resetGame() {
        scoreText.setText("0/21");
        timerTextView.setText("0:10");
        countDownTimer.cancel();
        counterIsActive = false;

    }

    //             first question pops up
    public void generateQuestion() {
        questionText = (TextView) findViewById(R.id.questionText);

        String operatorSwitch;
        int answer;
        int evaluation = 0;
        Random operatorChoice = new Random();
        int operator = operatorChoice.nextInt(4);

        switch (operator){

            case 0: operatorSwitch= "+";
                evaluation = firstInt+secondInt;
                break;
            case 1: operatorSwitch= "-";
                evaluation = firstInt-secondInt;
                break;
            case 2: operatorSwitch= "*";
                evaluation = firstInt*secondInt;
                break;
            case 3: operatorSwitch= "/";
                evaluation = firstInt/secondInt;
                break;
            default: operatorSwitch= "";
        }
        questionText.setText(firstInt + " " + operatorSwitch+ " " + secondInt);
        answer = evaluation;
    };

    public String choiceClicked(View view) {
        String choice;
        choice = view.getTag().toString();
        Log.i("choice clicked", choice);
        return choice;
    };

    public void evaluate(String choice, int answer) {
        String usersChoice = choiceClicked();

    }



//    public void updateScore() {
//        scoreText = (TextView)findViewById(R.id.scoreText);
//        int choice = choiceClicked();
//
//        int score = 0;
//
//        if(choice.equals(answer)) {
//            Toast.makeText(answer, "You are Correct", Toast.LENGTH_SHORT).show();
//            score++;
//
//
//
//        }
//    }

    // start timer
    public void updateTimer(int secondsLeft) {
        int minutes = (int) secondsLeft / 60;
        int seconds = secondsLeft - minutes * 60;

        String secondString = Integer.toString(seconds);

        if (seconds <= 9) {
            secondString = "0" + secondString;
        }
        timerTextView.setText(Integer.toString(minutes) + ":" + secondString);
    }


    public void startButton(View view) {

        if (counterIsActive == false) {

            counterIsActive = true;

            timerTextView.setVisibility(TextView.VISIBLE);
            scoreText.setVisibility(View.VISIBLE);
            questionText.setVisibility(View.VISIBLE);
            resultText.setVisibility(View.VISIBLE);
            topLeft.setVisibility(View.VISIBLE);
            topRight.setVisibility(View.VISIBLE);
            bottomRight.setVisibility(View.VISIBLE);
            bottomLeft.setVisibility(View.VISIBLE);


            generateQuestion();



            // Answer gets evaluated

            // score goes up if correct

            // repeat until maxScore is answered

            // or repeat until time runs out



            countDownTimer = new CountDownTimer(10000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    // countdown is counting down every second
                    updateTimer((int) millisUntilFinished / 1000);
                    Log.i("Seconds left", String.valueOf(millisUntilFinished / 1000));
                }

                @Override
                public void onFinish() {
                    resetGame();
                    // counter is finished! (after 10 seconds)
                    Log.i("Done", "Countdown Timer finished");
                }
            }.start();

        } else {
            resetGame();
        }
    }

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            // go page
            // while on go page, everything is invisible except go button
            counterIsActive = false;

            timerTextView = (TextView) findViewById(R.id.timerTextView);
            scoreText = (TextView) findViewById(R.id.scoreText);
            questionText = (TextView) findViewById(R.id.questionText);
            resultText = (TextView) findViewById(R.id.resultText);
            topLeft = (Button) findViewById(R.id.topLeft);
            topRight = (Button) findViewById(R.id.topRight);
            bottomLeft = (Button) findViewById(R.id.bottomLeft);
            bottomRight = (Button) findViewById(R.id.bottomRight);

            timerTextView.setVisibility(TextView.INVISIBLE);
            scoreText.setVisibility(View.INVISIBLE);
            questionText.setVisibility(View.INVISIBLE);
            resultText.setVisibility(View.INVISIBLE);
            topLeft.setVisibility(View.INVISIBLE);
            topRight.setVisibility(View.INVISIBLE);
            bottomRight.setVisibility(View.INVISIBLE);
            bottomLeft.setVisibility(View.INVISIBLE);


            public void randomInts() {
                for (topLeft, topRight, bottomLeft, bottomRight) {
                    evaluation
                }
            }








        }

}

