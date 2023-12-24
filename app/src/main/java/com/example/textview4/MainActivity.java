package com.example.textview4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tV;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tV = findViewById(R.id.tV);
    }


    public void click(View view) {
        counter ++;
        if (counter%7 == 0)
        {
            tV.setText("BOOM !");
            tV.setTextColor(Color.RED);
        }
        else
        {
            tV.setText("This is a click number: "+counter);
            tV.setTextColor(Color.GREEN);
        }
    }
}