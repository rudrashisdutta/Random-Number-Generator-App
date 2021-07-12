package com.android.randomtester;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt;
    Random rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        txt = findViewById(R.id.textView);
        rand = new Random();
    }
    public void random(View v){
        String x = rand.nextInt(500) + "";
        txt.setText(x);
    }
}

/**
 * TODO:
 *      Let the user enter the bound of random number
 *      Change design on the app
 *      Use a customized alertDialog to enter the bound
 **/