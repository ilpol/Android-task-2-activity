package com.example.hw2activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SingleTop extends AppCompatActivity {

    int counter = 0;
    public static final String COUNTER = "com.example.myfirstapp.COUNTER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);

        final TextView counterTextView = (TextView)findViewById(R.id.textViewSingleTop);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            Intent mIntent = getIntent();
            int counterGot = mIntent.getIntExtra(COUNTER, 0);
            counter = counterGot;
        }

         counterTextView.setText(String.valueOf(counter) + " SingleTop");
    }


    public void startStandart(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(COUNTER, counter+ 1);
        startActivity(intent);
    }

    public void startSingleTop(View view) {
        Intent intent = new Intent(this, SingleTop.class);
        intent.putExtra(COUNTER, counter+ 1);
        startActivity(intent);
    }

    public void startSingleTask(View view) {
        Intent intent = new Intent(this, SingleTask.class);
        intent.putExtra(COUNTER, counter+ 1);
        startActivity(intent);
    }

    public void startSingleInstance(View view) {
        Intent intent = new Intent(this, SingleInstance.class);
        intent.putExtra(COUNTER, counter+ 1);
        startActivity(intent);
    }
}