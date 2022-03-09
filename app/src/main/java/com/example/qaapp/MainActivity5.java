package com.example.qaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity  {

    TextView t1,t2;
    ImageView left,answer,right;
    TextView tq,ta;
    String [] simple_quest,simple_ans;
    int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView3);
        left=findViewById(R.id.imageButton8);
        answer=findViewById(R.id.imageButton6);
        right=findViewById(R.id.imageButton9);
        tq=findViewById(R.id.textView4);
        ta=findViewById(R.id.textView5);
        simple_quest= getResources().getStringArray(R.array.ques1);
        simple_ans=getResources().getStringArray(R.array.ans1);

        tq.setText(simple_quest[index]);
        ta.setText("Press A Button for the Answer:");
        t1.setText(String.valueOf(index+1)+"/");
        t2.setText(String.valueOf(simple_quest.length));

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0) {
                    Toast.makeText(MainActivity5.this, "NO Questions:", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index--;
                    tq.setText(simple_quest[index]);
                    ta.setText("Press \"A\" Button for the Answer:");
                    t1.setText(String.valueOf(index + 1) + "/");
                }
                }
        });
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ta.setText(simple_ans[index]);
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index== simple_quest.length-1) {
                    Toast.makeText(MainActivity5.this,"No More Questions:",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index++;
                    tq.setText(simple_quest[index]);
                    ta.setText("Press \"A\" Button for the Answer:");
                    t1.setText(String.valueOf(index + 1) + "/");
                }
            }
        });
    }
}