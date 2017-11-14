package com.example.user.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R .layout.activity_main);

    }
    public void findViews(View view) {
        EditText secret = (EditText) findViewById(R.id.secret);
        EditText info = (EditText) findViewById(R.id.info);
        EditText number = (EditText) findViewById(R.id.number);
        EditText send = (EditText) findViewById(R.id.send);
        setContentView(R.layout.activity_main);
        int x = Integer.parseInt(number.getText().toString() );
                Random random = new Random();
        int y = random.nextInt(100) + 1;

     }
    }





