package com.example.chrismaltez.connect3challenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 0 = yellow, 1 = red;
    int activePlayer = 0;

    boolean gameIsActive = true;

    // 2 means unplayed
    int[] gameState = {2,2,2,2,2,2,2,2,2};

    int[][] winningPositions = {{0,1,2}, {3,4,5}, {6,7,8}, // horizontal
                                {0,3,6}, {1,4,7}, {2,5,8}, // vertical
                                {0,4,8},{2,4,6}}; //diagonals



    public void dropIn(View view) {
        ImageView counter = (ImageView) view;

        System.out.println(counter.getTag().toString());

        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        if (gameState[tappedCounter] == 2 && gameIsActive) {

            gameState[tappedCounter] = activePlayer;

            counter.setTranslationY(-1000f);

            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.yellow);
                activePlayer = 1;
            } else {
                counter.setImageResource(R.drawable.red);
                activePlayer = 0;
            }

            counter.animate().translationYBy(1000f).rotation(360).setDuration(300);

            for (int[] winningPosition : winningPositions) {
                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                        gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                        gameState[winningPosition[0]] != 2) {

                    // someone has won

                    gameIsActive = false;

                    String winner = "Red";

                    if (gameState[winningPosition[0]] == 0) {
                        winner = "yellow";
                    }

                    TextView winnerMessage = (TextView) findViewById(R.id.winnerMessage);
                    winnerMessage.setText(winner + " has won!");
                    LinearLayout layout = (LinearLayout) findViewById(R.id.playAgainLayout);
                    layout.bringToFront();
                    layout.setVisibility(View.VISIBLE);

                } else {

                    boolean gameIsOver = true;

                    for (int counterState : gameState) {
                        if (counterState == 2) gameIsOver = false;

                    }

                    if (gameIsOver) {
                        TextView winnerMessage = (TextView) findViewById(R.id.winnerMessage);
                        winnerMessage.setText("Its a draw!");
                        LinearLayout layout = (LinearLayout) findViewById(R.id.playAgainLayout);
                        layout.bringToFront();
                        layout.setVisibility(View.VISIBLE);
                    }
                }
            }

        }

    }
    public void playAgain(View view) {

        gameIsActive = true;
        LinearLayout layout = (LinearLayout)findViewById(R.id.playAgainLayout);
        layout.setVisibility(View.INVISIBLE);

        activePlayer = 0;
        for (int i = 0; i < gameState.length; i++) {
            gameState[i] = 2;
        }

        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);
        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            ((ImageView) gridLayout.getChildAt(i)).setImageResource(0);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
}

//***************My Attempt below *******************

//          ImageView box1 = (ImageView) findViewById(R.id.box1);
//        box1.setImageResource(R.drawable.red);

//    box1.setOnClickListener(new View.OnClickListener) {
//        box1.setImageResource(R.drawable.red);
//    }

// split user turns
// if user 1, use red. --> image switcher

//if user 2, use yellow. --> image switcher

//draw line over winning formation

// assign grid layout cells values

// cats game draw

//        box1 = (ImageView) findViewById(R.id.box1);
//        box2 = (ImageView) findViewById(R.id.box2);
//        box3 = (ImageView) findViewById(R.id.box3);
//        box4 = (ImageView) findViewById(R.id.box4);
//        box6 = (ImageView) findViewById(R.id.box5);
//        box6 = (ImageView) findViewById(R.id.box6);
//        box7 = (ImageView) findViewById(R.id.box7);
//        box8 = (ImageView) findViewById(R.id.box8);
//        box9 = (ImageView) findViewById(R.id.box9);

//        ImageSwitcher sw;
//        sw = (ImageSwitcher) findViewById(R.id.imgsw1);

//        sw.setFactory(new ViewSwitcher.ViewFactory() {
//            @Override
//            public View makeView() {
//                ImageView imageView = new ImageView(getApplicationContext());
//                return imageView;
//            }
//        });

//        box1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                box1.setImageResource(R.drawable.red);
//            }
//        });