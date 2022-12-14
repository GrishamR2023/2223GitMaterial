package com.example.a4funcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDiv, buttonAdd, buttonEquals, buttonClear, buttonSub;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        output = findViewById(R.id.output);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonClear = findViewById(R.id.buttonClear);
        buttonSub = findViewById(R.id.buttonSub);









        setContentView(R.layout.activity_main);
    }
}