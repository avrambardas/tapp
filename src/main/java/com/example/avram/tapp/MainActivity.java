package com.example.avram.tapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //opens activity_2
    private Button button;

    private Button button_for_duo;

    //TextView showDuoMessage;
    private Button button_for_duo_30;

    TextView showGameLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons that opens activity2
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
                //showDuoMessage.setText("");
            }
        });

        showGameLogo = (TextView) findViewById(R.id.GameLogo);
        showGameLogo.setSelected(true);

        button_for_duo = (Button) findViewById(R.id.duoGame);
        button_for_duo.setOnClickListener(new View.OnClickListener() {
                    @Override
                   public void onClick(View view) {
                        openDuoGame();
                   }
               });

        button_for_duo_30 = findViewById(R.id.duoGame30);
        button_for_duo_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDuoGame30();
            }
        });


        //button_that_moves = (Button) findViewById(R.id.movablebutton);
    }

    public void openActivity2(){
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
        showGameLogo.setText("TAP");
    }


    public void openDuoGame(){
       Intent intent1 = new Intent(this,duoActivity.class);
       intent1.putExtra("which_duo_act","1");
       startActivity(intent1);
    }

    public void openDuoGame30(){
        Intent intent1 = new Intent(this,duoActivity.class);
        intent1.putExtra("which_duo_act","2");
        startActivity(intent1);
    }

}
