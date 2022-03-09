package com.example.qaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView i2;
    TextView tv,tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i2=(ImageView) findViewById(R.id.i2);
        tv=(TextView) findViewById(R.id.textView2);
        tw=(TextView) findViewById(R.id.t1);

        @SuppressLint("ResourceType") Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.fade);
        i2.startAnimation(anim);

        @SuppressLint("ResourceType") Animation an= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.moveup);
        tw.startAnimation(an);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(in);
                }
            },4000);

    }
}