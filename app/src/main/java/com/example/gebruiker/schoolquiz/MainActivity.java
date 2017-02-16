package com.example.gebruiker.schoolquiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.example.gebruiker.schoolquiz.R.id.antwoordt1;
import static com.example.gebruiker.schoolquiz.R.id.antwoordt2;
import static com.example.gebruiker.schoolquiz.R.id.antwoordt3;
import static com.example.gebruiker.schoolquiz.R.id.btn1_1;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.nakijkbutton).setEnabled(false);


    }

    //eerste vraag

    public void Button1_1(View view) {
        findViewById(R.id.btn1_2).setEnabled(false);
        findViewById(R.id.btn1_3).setEnabled(false);


    }

    public void Button1_2(View view) {
        findViewById(R.id.btn1_1).setEnabled(false);
        findViewById(R.id.btn1_3).setEnabled(false);


    }

    public void Button1_3(View view) {
        findViewById(R.id.btn1_1).setEnabled(false);
        findViewById(R.id.btn1_2).setEnabled(false);


    }

    //tweede vraag

    public void Button2_1(View view) {
        findViewById(R.id.btn2_2).setEnabled(false);
        findViewById(R.id.btn2_3).setEnabled(false);


    }

    public void Button2_2(View view) {
        findViewById(R.id.btn2_1).setEnabled(false);
        findViewById(R.id.btn2_3).setEnabled(false);


    }

    public void Button2_3(View view) {
        findViewById(R.id.btn2_1).setEnabled(false);
        findViewById(R.id.btn2_2).setEnabled(false);


    }

    //derde vraag

    public void Button3_1(View view) {
        findViewById(R.id.btn3_2).setEnabled(false);
        findViewById(R.id.nakijkbutton).setEnabled(true);


    }

    public void Button3_2(View view) {
        findViewById(R.id.btn3_1).setEnabled(false);
        findViewById(R.id.nakijkbutton).setEnabled(true);


    }

    //nakijkknop

    public void nakijkbtn(View view) {
        TextView answer1 = (TextView) findViewById(antwoordt1);
        answer1.setVisibility(View.VISIBLE);

        TextView answer2 = (TextView) findViewById(antwoordt2);
        answer2.setVisibility(View.VISIBLE);

        TextView answer3 = (TextView) findViewById(antwoordt3);
        answer3.setVisibility(View.VISIBLE);

    }
    //resetknop

    public void resetbtn(View view) {
        findViewById(R.id.btn1_1).setEnabled(true);
        findViewById(R.id.btn1_2).setEnabled(true);
        findViewById(R.id.btn1_3).setEnabled(true);

        findViewById(R.id.btn2_1).setEnabled(true);
        findViewById(R.id.btn2_2).setEnabled(true);
        findViewById(R.id.btn2_3).setEnabled(true);

        findViewById(R.id.btn3_1).setEnabled(true);
        findViewById(R.id.btn3_2).setEnabled(true);

        TextView answer1 = (TextView) findViewById(antwoordt1);
        answer1.setVisibility(View.GONE);

        TextView answer2 = (TextView) findViewById(antwoordt2);
        answer2.setVisibility(View.GONE);

        TextView answer3 = (TextView) findViewById(antwoordt3);
        answer3.setVisibility(View.GONE);

        findViewById(R.id.nakijkbutton).setEnabled(false);


    }


}
