package com.example.qaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);

        Toast.makeText(MainActivity2.this,"Select Questions Type:",Toast.LENGTH_SHORT).show();

    }

    public void demo1(View view)
    {
        Intent intent= new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(intent);
    }

    public void demo2(View view) {
        Intent in=new Intent(MainActivity2.this,MainActivity7.class);
        startActivity(in);
    }

    public void demo3(View view) {
        Intent intent=new Intent(MainActivity2.this,MainActivity9.class);
        startActivity(intent);

    }
    public void demo4(View view) {
        Uri uri=Uri.parse("https://developer.android.com/");
        Intent in=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(in);
    }

}