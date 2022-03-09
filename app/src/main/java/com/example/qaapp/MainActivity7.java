package com.example.qaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    TextView t1,t2;
    TextView ques;
    RadioButton r1,r2,r3,r4;
    String[] question,op1,op2,op3,op4,solution;
    ImageView left,right;
    Button submit;
    int index=0;
    int correct=0,incorrect=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        t1=findViewById(R.id.textView6);
        t2=findViewById(R.id.textView7);
        ques=findViewById(R.id.textView8);
        r1=findViewById(R.id.radioButton);
        r2=findViewById(R.id.radioButton2);
        r3=findViewById(R.id.radioButton3);
        r4=findViewById(R.id.radioButton4);
        left=findViewById(R.id.imageView);
        right=findViewById(R.id.imageView2);
        submit=findViewById(R.id.button5);

        solution=getResources().getStringArray(R.array.sol);
        question=getResources().getStringArray(R.array.mcqs);
        op1=getResources().getStringArray(R.array.one);
        op2=getResources().getStringArray(R.array.two);
        op3=getResources().getStringArray(R.array.three);
        op4=getResources().getStringArray(R.array.four);

        ques.setText(question[index]);
        t1.setText(String.valueOf(index+1)+"/");
        t2.setText(String.valueOf(question.length));
        r1.setText(op1[index]);
        r2.setText(op2[index]);
        r3.setText(op3[index]);
        r4.setText(op4[index]);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0) {
                    Toast.makeText(MainActivity7.this,"NO MCQS:",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index--;
                    ques.setText(question[index]);
                    t1.setText(String.valueOf(index+1)+"/");
                    r1.setText(op1[index]);
                    r2.setText(op2[index]);
                    r3.setText(op3[index]);
                    r4.setText(op4[index]);
                }
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==question.length-1)
                {
                    Intent in=new Intent(MainActivity7.this,MainActivity8.class);
                    in.putExtra("Correct",correct);
                    in.putExtra("Incorrect",incorrect);
                    startActivity(in);
                }
                else
                {
                    index++;
                    ques.setText(question[index]);
                    t1.setText(String.valueOf(index+1)+"/");
                    r1.setText(op1[index]);
                    r2.setText(op2[index]);
                    r3.setText(op3[index]);
                    r4.setText(op4[index]);
                    if(r1.isChecked())
                    {
                        if(r1.getText().equals(solution[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else if(r2.isChecked())
                    {
                        if(r2.getText().equals(solution[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else if(r3.isChecked())
                    {
                        if(r3.getText().equals(solution[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else if(r4.isChecked())
                    {
                        if(r4.getText().equals(solution[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity7.this,"Kindly Select An Option:",Toast.LENGTH_SHORT).show();
                    }
                }
            }


        });
    }
}