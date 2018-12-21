package com.example.avram.tapp;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;



public class Activity2 extends AppCompatActivity {

    //shows how many taps per game
    TextView showValue;
    int counter = 0;

    //shows the best record
    TextView showrecordValue;
    int recordcounter = 0;

    //text that shows the time left
    TextView showTime;

    //for the begining time
    private static final long COUNTDOWN_IN_MILLIS = 30000;
    private CountDownTimer countDownTimer;

    //for the secs left evry time
    private long timeLeftInMillis;

    //the color of the timer
    private ColorStateList textColorDefaultTimer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        showValue = (TextView) findViewById(R.id.counterValue);  //shows the taps

        showrecordValue = (TextView) findViewById(R.id.record); //shows the record

        showTime = (TextView) findViewById(R.id.text_view_countdown); //show the time


        textColorDefaultTimer = showTime.getTextColors();

    }

    int realcounter;
    public void countIN (View view){
        if (counter==0) {
            timeLeftInMillis = COUNTDOWN_IN_MILLIS;
            startCounDownTimer();
         }
        if (timeLeftInMillis > 0){
            counter++;

            realcounter=counter-1;//

            showValue.setText(Integer.toString(realcounter));

            if (counter>recordcounter) //sets the best record
            {
                recordcounter = counter;
            }
        }
    }


    public void resetCount (View view){
        counter = 0;
        showValue.setText("");
        timeLeftInMillis = COUNTDOWN_IN_MILLIS;
        showrecordValue.setText(Integer.toString(recordcounter-1));
        showTime.setText("00:30");
        countDownTimer.cancel();
        showTime.setTextColor(textColorDefaultTimer);

    }

    //used for the timer
    private void startCounDownTimer(){
        countDownTimer = new CountDownTimer(timeLeftInMillis,1) {
            @Override
            public void onTick(long l) {
                timeLeftInMillis = l;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                updateCountDownText();
                showTime.setText("TIME OUT");
            }
        }.start();
    }

    int rundomColor, r=255, g=0, b=0;
    boolean forRed = true;
    boolean forGreen = true;
    boolean forBlue = true;

    //used in startCountDownTimer
    private void updateCountDownText(){
        int minutes = (int) (timeLeftInMillis / 1000 )/ 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;





        if (r>= 246) {
            forRed = false;
        }
        if(r<= 10){
           forRed = true;
        }

        if (g>= 246) {
            forGreen = false;
        }
        if(g <= 10){
            forGreen = true;
        }

        if (b >= 246) {
            forBlue = false;
        }
        if(b <= 10){
            forBlue = true;
        }

        if (!forRed && !forGreen && forBlue) {
            r-=10;
        }
        if (forRed && !forGreen && !forBlue){
            g-=10;
        }
        if (!forRed && forGreen && !forBlue){
            b-=10;
        }

        if (forRed && forGreen && !forBlue) {
            r+=10;
        }
        if (!forRed && forGreen && forBlue){
            g+=10;
        }
        if (forRed && !forGreen && forBlue){
            b+=10;
        }





        rundomColor = Color.argb(255,r,g,b);
        showValue.setTextColor(rundomColor);

        String timeFormatted = String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        showTime.setText(timeFormatted);

        if(timeLeftInMillis < 10000){
            showTime.setTextColor(Color.RED);
        }else{
            showTime.setTextColor(textColorDefaultTimer);
        }
        if(timeLeftInMillis <= 0){
            showValue.setText("score "+Integer.toString(counter-1));
        }
    }


    //cancels the timer so it wont run on background
    @Override
    protected void onDestroy(){
        super.onDestroy();
        if(countDownTimer != null)
            countDownTimer.cancel();
    }
}
