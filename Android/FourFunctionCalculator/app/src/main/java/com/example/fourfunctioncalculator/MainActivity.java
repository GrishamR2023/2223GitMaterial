package com.example.fourfunctioncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //set global variables

    private EditText number1TXT, number2TXT;
    private Button addBTN, subBTN, multBTN, divBTN;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link java objects to widgets

        number1TXT =  findViewById(R.id.number1TXT);
        number2TXT =  findViewById(R.id.number2TXT);
        addBTN =  findViewById(R.id.addBTN);
        subBTN =  findViewById(R.id.minusBTN);
        multBTN =  findViewById(R.id.multBTN);
        divBTN =  findViewById(R.id.divBTN);
        output =  findViewById(R.id.output);


        //setOnClickListener
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(String.valueOf(number1TXT.getText()));
                //number value = ConvertToInt(ConvertToString(getTextFromEditable)));
                double num2 = Double.parseDouble(String.valueOf(number2TXT.getText()));
                double answer = num1+num2;
                output.setText(String.valueOf(answer));
            }
        });


        subBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(String.valueOf(number1TXT.getText()));
                //number value = ConvertToInt(ConvertToString(getTextFromEditable)));
                double num2 = Double.parseDouble(String.valueOf(number2TXT.getText()));
                double answer = num1-num2;
                output.setText(String.valueOf(answer));
            }
        });

        multBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(String.valueOf(number1TXT.getText()));
                //number value = ConvertToInt(ConvertToString(getTextFromEditable)));
                double num2 = Double.parseDouble(String.valueOf(number2TXT.getText()));
                double answer = num1*num2;
                output.setText(String.valueOf(answer));
            }
        });

        divBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(String.valueOf(number1TXT.getText()));
                //number value = ConvertToInt/Double(ConvertToString(getTextFromEditable)));
                double num2 = Double.parseDouble(String.valueOf(number2TXT.getText()));
                double answer = num1/num2;
                output.setText(String.valueOf(answer));
            }
        });


    }

    //additional functions

}