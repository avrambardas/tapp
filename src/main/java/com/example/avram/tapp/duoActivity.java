package com.example.avram.tapp;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class duoActivity extends AppCompatActivity {

    TextView showButton;

    Button startButton;

    TextView showPointsForDuo;


    TextView showFromWhichButtonOpenedTheAct;
    Intent intent = getIntent();

    //all buttons
    Button buttonL1C1,buttonL1C2,buttonL1C3,buttonL1C4,buttonL1C5;

    Button buttonL2C1,buttonL2C2,buttonL2C3,buttonL2C4,buttonL2C5;

    Button buttonL3C1,buttonL3C2,buttonL3C3,buttonL3C4,buttonL3C5;

    Button buttonL4C1,buttonL4C2,buttonL4C3,buttonL4C4,buttonL4C5;

    Button buttonL5C1,buttonL5C2,buttonL5C3,buttonL5C4,buttonL5C5;

    Button buttonL6C1,buttonL6C2,buttonL6C3,buttonL6C4,buttonL6C5;

    String value;

    //for the begining time
    private static final long COUNTDOWN_IN_MILLIS_FOR_DUO = 300000;
    private static final long COUNTDOWN_IN_MILLIS_FOR_DUO_30 = 30000;
    private CountDownTimer countDownTimerForDuo;

    //for the secs left every time
    private long timeLeftInMillisForDuo;

    private ColorStateList textColorDefaultTimer;

    private boolean timerIsRunning = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duo);
        //(TextView)
        showButton =  findViewById(R.id.whichButton);
        //(Button)
        startButton =  findViewById(R.id.duoGameStartButton);

        showPointsForDuo = findViewById(R.id.pointCounterForDuo);

        showFromWhichButtonOpenedTheAct = findViewById(R.id.textViewforwhichactivity);

        if (getIntent().getExtras() != null){
            value = getIntent().getStringExtra("which_duo_act");
            //showFromWhichButtonOpenedTheAct.setText(value);
        }
        if (value.equals("1")){
            showFromWhichButtonOpenedTheAct.setText("duo");
            showButton.setText("00:00:00");
        }else{
            showFromWhichButtonOpenedTheAct.setText("30'");
            showButton.setText("00:30");
        }

        textColorDefaultTimer = showButton.getTextColors();



        //connects all buttons with their ids
        buttonL1C1 =  findViewById(R.id.L1C1);

        buttonL1C2 =  findViewById(R.id.L1C2);
        buttonL1C3 =  findViewById(R.id.L1C3);
        buttonL1C4 =  findViewById(R.id.L1C4);
        buttonL1C5 =  findViewById(R.id.L1C5);

        buttonL2C1 =  findViewById(R.id.L2C1);
        buttonL2C2 =  findViewById(R.id.L2C2);
        buttonL2C3 =  findViewById(R.id.L2C3);
        buttonL2C4 =  findViewById(R.id.L2C4);
        buttonL2C5 =  findViewById(R.id.L2C5);

        buttonL3C1 =  findViewById(R.id.L3C1);
        buttonL3C2 =  findViewById(R.id.L3C2);
        buttonL3C3 =  findViewById(R.id.L3C3);
        buttonL3C4 =  findViewById(R.id.L3C4);
        buttonL3C5 =  findViewById(R.id.L3C5);

        buttonL4C1 =  findViewById(R.id.L4C1);
        buttonL4C2 =  findViewById(R.id.L4C2);
        buttonL4C3 =  findViewById(R.id.L4C3);
        buttonL4C4 =  findViewById(R.id.L4C4);
        buttonL4C5 =  findViewById(R.id.L4C5);

        buttonL5C1 =  findViewById(R.id.L5C1);
        buttonL5C2 =  findViewById(R.id.L5C2);
        buttonL5C3 =  findViewById(R.id.L5C3);
        buttonL5C4 =  findViewById(R.id.L5C4);
        buttonL5C5 =  findViewById(R.id.L5C5);

        buttonL6C1 =  findViewById(R.id.L6C1);
        buttonL6C2 =  findViewById(R.id.L6C2);
        buttonL6C3 =  findViewById(R.id.L6C3);
        buttonL6C4 =  findViewById(R.id.L6C4);
        buttonL6C5 =  findViewById(R.id.L6C5);

    }

    int counterForDuo = 0;
    int realcounterForDuo = 0;
    int rundomColor;
    int rnumber;
    public void startDuo(View view){

        //selects the timer for the right activity
        if (counterForDuo==0) {
            if(value.equals("1")) {
                timeLeftInMillisForDuo = COUNTDOWN_IN_MILLIS_FOR_DUO;
                startCounDownTimerForDuo();
            }else {
                timeLeftInMillisForDuo = COUNTDOWN_IN_MILLIS_FOR_DUO_30;
                startCounDownTimer30();
            }
        }



        Random rand = new Random();
        rnumber = rand.nextInt(29);
        rundomColor = Color.argb(255,rand.nextInt(180)+50,rand.nextInt(180)+50,rand.nextInt(180)+50);

        //showButton.setText(Integer.toString(rnumber));
        if (rnumber<10) {
            if (rnumber == 0) {
                buttonL1C1.setVisibility(View.VISIBLE);
                buttonL1C1.setBackgroundColor(rundomColor);
            } else if (rnumber == 1) {
                buttonL1C2.setVisibility(View.VISIBLE);
                buttonL1C2.setBackgroundColor(rundomColor);
            } else if (rnumber == 2) {
                buttonL1C3.setVisibility(View.VISIBLE);
                buttonL1C3.setBackgroundColor(rundomColor);
            } else if (rnumber == 3) {
                buttonL1C4.setVisibility(View.VISIBLE);
                buttonL1C4.setBackgroundColor(rundomColor);
            } else if (rnumber == 4) {
                buttonL1C5.setVisibility(View.VISIBLE);
                buttonL1C5.setBackgroundColor(rundomColor);
            } else if (rnumber == 5) {
                buttonL2C1.setVisibility(View.VISIBLE);
                buttonL2C1.setBackgroundColor(rundomColor);
            } else if (rnumber == 6) {
                buttonL2C2.setVisibility(View.VISIBLE);
                buttonL2C2.setBackgroundColor(rundomColor);
            } else if (rnumber == 7) {
                buttonL2C3.setVisibility(View.VISIBLE);
                buttonL2C3.setBackgroundColor(rundomColor);
            } else if (rnumber == 8) {
                buttonL2C4.setVisibility(View.VISIBLE);
                buttonL2C4.setBackgroundColor(rundomColor);
            } else  {
                buttonL2C5.setVisibility(View.VISIBLE);
                buttonL2C5.setBackgroundColor(rundomColor);
            }
        }
        else if(rnumber<20) {
            if (rnumber == 10) {
                buttonL3C1.setVisibility(View.VISIBLE);
                buttonL3C1.setBackgroundColor(rundomColor);
            } else if (rnumber == 11) {
                buttonL3C2.setVisibility(View.VISIBLE);
                buttonL3C2.setBackgroundColor(rundomColor);
            } else if (rnumber == 12) {
                buttonL3C3.setVisibility(View.VISIBLE);
                buttonL3C3.setBackgroundColor(rundomColor);
            } else if (rnumber == 13) {
                buttonL3C4.setVisibility(View.VISIBLE);
                buttonL3C4.setBackgroundColor(rundomColor);
            } else if (rnumber == 14) {
                buttonL3C5.setVisibility(View.VISIBLE);
                buttonL3C5.setBackgroundColor(rundomColor);
            } else if (rnumber == 15) {
                buttonL4C1.setVisibility(View.VISIBLE);
                buttonL4C1.setBackgroundColor(rundomColor);
            } else if (rnumber == 16) {
                buttonL4C2.setVisibility(View.VISIBLE);
                buttonL4C2.setBackgroundColor(rundomColor);
            } else if (rnumber == 17) {
                buttonL4C3.setVisibility(View.VISIBLE);
                buttonL4C3.setBackgroundColor(rundomColor);
            } else if (rnumber == 18) {
                buttonL4C4.setVisibility(View.VISIBLE);
                buttonL4C4.setBackgroundColor(rundomColor);
            } else  {
                buttonL4C5.setVisibility(View.VISIBLE);
                buttonL4C5.setBackgroundColor(rundomColor);
            }
        }
        else {
            if (rnumber == 20) {
                buttonL5C1.setVisibility(View.VISIBLE);
                buttonL5C1.setBackgroundColor(rundomColor);
            } else if (rnumber == 21) {
                buttonL5C2.setVisibility(View.VISIBLE);
                buttonL5C2.setBackgroundColor(rundomColor);
            } else if (rnumber == 22) {
                buttonL5C3.setVisibility(View.VISIBLE);
                buttonL5C3.setBackgroundColor(rundomColor);
            } else if (rnumber == 23) {
                buttonL5C4.setVisibility(View.VISIBLE);
                buttonL5C4.setBackgroundColor(rundomColor);
            } else if (rnumber == 24) {
                buttonL5C5.setVisibility(View.VISIBLE);
                buttonL5C5.setBackgroundColor(rundomColor);
            } else if (rnumber == 25) {
                buttonL6C1.setVisibility(View.VISIBLE);
                buttonL6C1.setBackgroundColor(rundomColor);
            } else if (rnumber == 26) {
                buttonL6C2.setVisibility(View.VISIBLE);
                buttonL6C2.setBackgroundColor(rundomColor);
            } else if (rnumber == 27) {
                buttonL6C3.setVisibility(View.VISIBLE);
                buttonL6C3.setBackgroundColor(rundomColor);
            } else if (rnumber == 28) {
                buttonL6C4.setVisibility(View.VISIBLE);
                buttonL6C4.setBackgroundColor(rundomColor);
            } else  {
                buttonL6C5.setVisibility(View.VISIBLE);
                buttonL6C5.setBackgroundColor(rundomColor);
            }
        }
        startButton.setVisibility(View.INVISIBLE);
    }





    //used in case of the rundom button is the same as the previous one
    int rnumber2;

    public void duoTapClicked(View view) {

        if (timeLeftInMillisForDuo > 0) {
            realcounterForDuo += 1;//
            showPointsForDuo.setText(Integer.toString(realcounterForDuo));
        }


        if (rnumber < 10) {
            if (rnumber == 0) {
                buttonL1C1.setVisibility(View.INVISIBLE);
            } else if (rnumber == 1) {
                buttonL1C2.setVisibility(View.INVISIBLE);
            } else if (rnumber == 2) {
                buttonL1C3.setVisibility(View.INVISIBLE);
            } else if (rnumber == 3) {
                buttonL1C4.setVisibility(View.INVISIBLE);
            } else if (rnumber == 4) {
                buttonL1C5.setVisibility(View.INVISIBLE);
            } else if (rnumber == 5) {
                buttonL2C1.setVisibility(View.INVISIBLE);
            } else if (rnumber == 6) {
                buttonL2C2.setVisibility(View.INVISIBLE);
            } else if (rnumber == 7) {
                buttonL2C3.setVisibility(View.INVISIBLE);
            } else if (rnumber == 8) {
                buttonL2C4.setVisibility(View.INVISIBLE);
            } else {
                buttonL2C5.setVisibility(View.INVISIBLE);
            }
        } else if (rnumber < 20) {
            if (rnumber == 10) {
                buttonL3C1.setVisibility(View.INVISIBLE);
            } else if (rnumber == 11) {
                buttonL3C2.setVisibility(View.INVISIBLE);
            } else if (rnumber == 12) {
                buttonL3C3.setVisibility(View.INVISIBLE);
            } else if (rnumber == 13) {
                buttonL3C4.setVisibility(View.INVISIBLE);
            } else if (rnumber == 14) {
                buttonL3C5.setVisibility(View.INVISIBLE);
            } else if (rnumber == 15) {
                buttonL4C1.setVisibility(View.INVISIBLE);
            } else if (rnumber == 16) {
                buttonL4C2.setVisibility(View.INVISIBLE);
            } else if (rnumber == 17) {
                buttonL4C3.setVisibility(View.INVISIBLE);
            } else if (rnumber == 18) {
                buttonL4C4.setVisibility(View.INVISIBLE);
            } else {
                buttonL4C5.setVisibility(View.INVISIBLE);
            }
        } else {
            if (rnumber == 20) {
                buttonL5C1.setVisibility(View.INVISIBLE);
            } else if (rnumber == 21) {
                buttonL5C2.setVisibility(View.INVISIBLE);
            } else if (rnumber == 22) {
                buttonL5C3.setVisibility(View.INVISIBLE);
            } else if (rnumber == 23) {
                buttonL5C4.setVisibility(View.INVISIBLE);
            } else if (rnumber == 24) {
                buttonL5C5.setVisibility(View.INVISIBLE);
            } else if (rnumber == 25) {
                buttonL6C1.setVisibility(View.INVISIBLE);
            } else if (rnumber == 26) {
                buttonL6C2.setVisibility(View.INVISIBLE);
            } else if (rnumber == 27) {
                buttonL6C3.setVisibility(View.INVISIBLE);
            } else if (rnumber == 28) {
                buttonL6C4.setVisibility(View.INVISIBLE);
            } else {
                buttonL6C5.setVisibility(View.INVISIBLE);
            }
        }


        if (realcounterForDuo < 10 && value.equals("1")&& timerIsRunning  || value.equals("2") && timeLeftInMillisForDuo>0) {
            rnumber2 = rnumber;
            Random rand = new Random();
            while (rnumber2 == rnumber) {
                rnumber = rand.nextInt(29);
            }

            rundomColor = Color.argb(255, rand.nextInt(180) + 50, rand.nextInt(180) + 50, rand.nextInt(180) + 50);

            if (rnumber < 10) {
                if (rnumber == 0) {
                    buttonL1C1.setVisibility(View.VISIBLE);
                    buttonL1C1.setBackgroundColor(rundomColor);
                } else if (rnumber == 1) {
                    buttonL1C2.setVisibility(View.VISIBLE);
                    buttonL1C2.setBackgroundColor(rundomColor);
                } else if (rnumber == 2) {
                    buttonL1C3.setVisibility(View.VISIBLE);
                    buttonL1C3.setBackgroundColor(rundomColor);
                } else if (rnumber == 3) {
                    buttonL1C4.setVisibility(View.VISIBLE);
                    buttonL1C4.setBackgroundColor(rundomColor);
                } else if (rnumber == 4) {
                    buttonL1C5.setVisibility(View.VISIBLE);
                    buttonL1C5.setBackgroundColor(rundomColor);
                } else if (rnumber == 5) {
                    buttonL2C1.setVisibility(View.VISIBLE);
                    buttonL2C1.setBackgroundColor(rundomColor);
                } else if (rnumber == 6) {
                    buttonL2C2.setVisibility(View.VISIBLE);
                    buttonL2C2.setBackgroundColor(rundomColor);
                } else if (rnumber == 7) {
                    buttonL2C3.setVisibility(View.VISIBLE);
                    buttonL2C3.setBackgroundColor(rundomColor);
                } else if (rnumber == 8) {
                    buttonL2C4.setVisibility(View.VISIBLE);
                    buttonL2C4.setBackgroundColor(rundomColor);
                } else {
                    buttonL2C5.setVisibility(View.VISIBLE);
                    buttonL2C5.setBackgroundColor(rundomColor);
                }
            } else if (rnumber < 20) {
                if (rnumber == 10) {
                    buttonL3C1.setVisibility(View.VISIBLE);
                    buttonL3C1.setBackgroundColor(rundomColor);
                } else if (rnumber == 11) {
                    buttonL3C2.setVisibility(View.VISIBLE);
                    buttonL3C2.setBackgroundColor(rundomColor);
                } else if (rnumber == 12) {
                    buttonL3C3.setVisibility(View.VISIBLE);
                    buttonL3C3.setBackgroundColor(rundomColor);
                } else if (rnumber == 13) {
                    buttonL3C4.setVisibility(View.VISIBLE);
                    buttonL3C4.setBackgroundColor(rundomColor);
                } else if (rnumber == 14) {
                    buttonL3C5.setVisibility(View.VISIBLE);
                    buttonL3C5.setBackgroundColor(rundomColor);
                } else if (rnumber == 15) {
                    buttonL4C1.setVisibility(View.VISIBLE);
                    buttonL4C1.setBackgroundColor(rundomColor);
                } else if (rnumber == 16) {
                    buttonL4C2.setVisibility(View.VISIBLE);
                    buttonL4C2.setBackgroundColor(rundomColor);
                } else if (rnumber == 17) {
                    buttonL4C3.setVisibility(View.VISIBLE);
                    buttonL4C3.setBackgroundColor(rundomColor);
                } else if (rnumber == 18) {
                    buttonL4C4.setVisibility(View.VISIBLE);
                    buttonL4C4.setBackgroundColor(rundomColor);
                } else {
                    buttonL4C5.setVisibility(View.VISIBLE);
                    buttonL4C5.setBackgroundColor(rundomColor);
                }
            } else {
                if (rnumber == 20) {
                    buttonL5C1.setVisibility(View.VISIBLE);
                    buttonL5C1.setBackgroundColor(rundomColor);
                } else if (rnumber == 21) {
                    buttonL5C2.setVisibility(View.VISIBLE);
                    buttonL5C2.setBackgroundColor(rundomColor);
                } else if (rnumber == 22) {
                    buttonL5C3.setVisibility(View.VISIBLE);
                    buttonL5C3.setBackgroundColor(rundomColor);
                } else if (rnumber == 23) {
                    buttonL5C4.setVisibility(View.VISIBLE);
                    buttonL5C4.setBackgroundColor(rundomColor);
                } else if (rnumber == 24) {
                    buttonL5C5.setVisibility(View.VISIBLE);
                    buttonL5C5.setBackgroundColor(rundomColor);
                } else if (rnumber == 25) {
                    buttonL6C1.setVisibility(View.VISIBLE);
                    buttonL6C1.setBackgroundColor(rundomColor);
                } else if (rnumber == 26) {
                    buttonL6C2.setVisibility(View.VISIBLE);
                    buttonL6C2.setBackgroundColor(rundomColor);
                } else if (rnumber == 27) {
                    buttonL6C3.setVisibility(View.VISIBLE);
                    buttonL6C3.setBackgroundColor(rundomColor);
                } else if (rnumber == 28) {
                    buttonL6C4.setVisibility(View.VISIBLE);
                    buttonL6C4.setBackgroundColor(rundomColor);
                } else {
                    buttonL6C5.setVisibility(View.VISIBLE);
                    buttonL6C5.setBackgroundColor(rundomColor);
                }
            }
        }
    }


    private void startCounDownTimerForDuo(){
        countDownTimerForDuo = new CountDownTimer(timeLeftInMillisForDuo,1) {
            @Override
            public void onTick(long l) {
                timeLeftInMillisForDuo = l;
                updateCountDownText();
                if(realcounterForDuo == 10){
                    countDownTimerForDuo.cancel();
                }
            }

            @Override
            public void onFinish() {
                updateCountDownText();
                showButton.setText("TIME OUT");
                timerIsRunning = false;
                showButton.setTextColor(Color.RED);
                makeButtonsInvisible(rnumber);
            }
        }.start();
    }




    private void updateCountDownText() {
        int minutes = (int) (4-(timeLeftInMillisForDuo / 1000) / 60);
        int seconds = (int) (59-(timeLeftInMillisForDuo / 1000) % 60);
        int msec = (int) (100-((timeLeftInMillisForDuo/10)%100));

        String timeFormatted = String.format(Locale.getDefault(), "%02d:%02d:%02d", minutes, seconds,msec);
        showButton.setText(timeFormatted);
    }






    //used for the timer
    private void startCounDownTimer30(){
        countDownTimerForDuo = new CountDownTimer(timeLeftInMillisForDuo,1000) {
            @Override
            public void onTick(long l) {
                timeLeftInMillisForDuo = l;
                if(timeLeftInMillisForDuo < 10000){
                    showButton.setTextColor(Color.RED);
                }else{
                    showButton.setTextColor(textColorDefaultTimer);
                }

                updateCountDownText30();
            }

            @Override
            public void onFinish() {
                timeLeftInMillisForDuo = 0;
                updateCountDownText30();
                showButton.setText("TIME OUT");
                makeButtonsInvisible(rnumber);
            }
        }.start();
    }



    //used in startCountDownTimer
    private void updateCountDownText30(){
        int minutes = (int) (timeLeftInMillisForDuo / 1000 )/ 60;
        int seconds = (int) (timeLeftInMillisForDuo / 1000) % 60;




        String timeFormatted = String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        showButton.setText(timeFormatted);

        if(timeLeftInMillisForDuo < 10000){
            showButton.setTextColor(Color.RED);
        }else{
            showButton.setTextColor(textColorDefaultTimer);
        }
        if(timeLeftInMillisForDuo <= 0){
            showPointsForDuo.setText("score "+Integer.toString(realcounterForDuo-1));
        }
    }


    //cancels the timer so it wont run on background
    @Override
    protected void onDestroy(){
        super.onDestroy();
        if(countDownTimerForDuo != null)
            countDownTimerForDuo.cancel();
    }



    private void makeButtonsInvisible(int button){
        if (button < 10) {
            if (button == 0) {
                buttonL1C1.setVisibility(View.INVISIBLE);
            } else if (button == 1) {
                buttonL1C2.setVisibility(View.INVISIBLE);
            } else if (button == 2) {
                buttonL1C3.setVisibility(View.INVISIBLE);
            } else if (button == 3) {
                buttonL1C4.setVisibility(View.INVISIBLE);
            } else if (button == 4) {
                buttonL1C5.setVisibility(View.INVISIBLE);
            } else if (button == 5) {
                buttonL2C1.setVisibility(View.INVISIBLE);
            } else if (button == 6) {
                buttonL2C2.setVisibility(View.INVISIBLE);
            } else if (button == 7) {
                buttonL2C3.setVisibility(View.INVISIBLE);
            } else if (button == 8) {
                buttonL2C4.setVisibility(View.INVISIBLE);
            } else {
                buttonL2C5.setVisibility(View.INVISIBLE);
            }
        } else if (button < 20) {
            if (button == 10) {
                buttonL3C1.setVisibility(View.INVISIBLE);
            } else if (button == 11) {
                buttonL3C2.setVisibility(View.INVISIBLE);
            } else if (button == 12) {
                buttonL3C3.setVisibility(View.INVISIBLE);
            } else if (button == 13) {
                buttonL3C4.setVisibility(View.INVISIBLE);
            } else if (button == 14) {
                buttonL3C5.setVisibility(View.INVISIBLE);
            } else if (button == 15) {
                buttonL4C1.setVisibility(View.INVISIBLE);
            } else if (button == 16) {
                buttonL4C2.setVisibility(View.INVISIBLE);
            } else if (button == 17) {
                buttonL4C3.setVisibility(View.INVISIBLE);
            } else if (button == 18) {
                buttonL4C4.setVisibility(View.INVISIBLE);
            } else {
                buttonL4C5.setVisibility(View.INVISIBLE);
            }
        } else {
            if (button == 20) {
                buttonL5C1.setVisibility(View.INVISIBLE);
            } else if (button == 21) {
                buttonL5C2.setVisibility(View.INVISIBLE);
            } else if (button == 22) {
                buttonL5C3.setVisibility(View.INVISIBLE);
            } else if (button == 23) {
                buttonL5C4.setVisibility(View.INVISIBLE);
            } else if (button == 24) {
                buttonL5C5.setVisibility(View.INVISIBLE);
            } else if (button == 25) {
                buttonL6C1.setVisibility(View.INVISIBLE);
            } else if (button == 26) {
                buttonL6C2.setVisibility(View.INVISIBLE);
            } else if (button == 27) {
                buttonL6C3.setVisibility(View.INVISIBLE);
            } else if (button == 28) {
                buttonL6C4.setVisibility(View.INVISIBLE);
            } else {
                buttonL6C5.setVisibility(View.INVISIBLE);
            }
        }
    }
}
