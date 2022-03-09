package com.example.qaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    Button end,Try;
    TextView correct,wrong;
    int s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        end=findViewById(R.id.button7);
        Try=findViewById(R.id.button6);
        correct=findViewById(R.id.textView9);
        wrong=findViewById(R.id.textView10);

        Intent in=getIntent();
        s1=in.getIntExtra("Correct",0);
        correct.setText("CORRECT ANSWERS = "+s1);

        s2=in.getIntExtra("Incorrect",0);
        wrong.setText("INCORRECT ANSWERS = "+s2);

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity8.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        Try.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity8.this,MainActivity7.class);
                startActivity(intent);
            }
        });
    }
}