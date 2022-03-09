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

public class MainActivity9 extends AppCompatActivity {

    TextView t1,t2;
    TextView ques;
    RadioButton r1,r2;
    String[] question,solution;
    ImageView left,right;
    Button submit;
    int index=0;
    int correct=0,incorrect=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        t1=findViewById(R.id.textView12);
        t2=findViewById(R.id.textView13);
        ques=findViewById(R.id.textView14);
        r1=findViewById(R.id.radioButton7);
        r2=findViewById(R.id.radioButton8);
        left=findViewById(R.id.imageView4);
        right=findViewById(R.id.imageView5);
        submit=findViewById(R.id.button8);

        question=getResources().getStringArray(R.array.tf);
        solution=getResources().getStringArray(R.array.solution);

        ques.setText(question[index]);
        t1.setText(String.valueOf(index+1)+"/");
        t2.setText(String.valueOf(question.length));
        r1.setText("True");
        r2.setText("False");

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0) {
                    Toast.makeText(MainActivity9.this,"NO MORE:",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index--;
                    ques.setText(question[index]);
                    t1.setText(String.valueOf(index+1)+"/");
                    r1.setText("True");
                    r2.setText("False");

                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==question.length-1)
                {
                    Intent in=new Intent(MainActivity9.this,MainActivity10.class);
                    in.putExtra("Correct",correct);
                    in.putExtra("Incorrect",incorrect);
                    startActivity(in);
                }
                else
                {
                    index++;
                    ques.setText(question[index]);
                    t1.setText(String.valueOf(index+1)+"/");
                    r1.setText("True");
                    r2.setText("False");

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
                    else
                    {
                        Toast.makeText(MainActivity9.this,"Kindly Select An Option:",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}