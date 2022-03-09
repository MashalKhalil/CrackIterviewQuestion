package com.example.qaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);

        Toast.makeText(MainActivity3.this,"Select level for Questions",Toast.LENGTH_SHORT).show();
    }

    public void click1(View view) {
        Intent intent=new Intent(MainActivity3.this,MainActivity4.class);
        startActivity(intent);
    }

    public void click2(View view) {
        Intent in=new Intent(MainActivity3.this,MainActivity5.class);
        startActivity(in);
    }

    public void click3(View view) {
        Intent b=new Intent(MainActivity3.this,MainActivity6.class);
        startActivity(b);
    }

    public void click4(View view) {
        Intent a=new Intent(MainActivity3.this,MainActivity2.class);
        startActivity(a);

    }
}