package com.example.scifi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //First Thing: Connect the widgets to an object
    EditText firstTXT, lastTXT, cityTXT, schoolTXT, broTXT, sisTXT;
    Button generatorBTN;
    TextView output;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Second Thing: connect global variables to widget
        firstTXT = findViewById(R.id.firstTXT);
        lastTXT = findViewById(R.id.lastTXT);
        cityTXT = findViewById(R.id.cityTXT);
        schoolTXT = findViewById(R.id.schoolTXT);
        broTXT = findViewById(R.id.broTXT);
        sisTXT = findViewById(R.id.sisTXT);
        output = findViewById(R.id.output);
        generatorBTN = findViewById(R.id.generator);

        generatorBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generate();
            }
        });
    }
    private void generate(){
        String first = String.valueOf(firstTXT.getText());
        String last = String.valueOf(lastTXT.getText());
        String city = String.valueOf(cityTXT.getText());
        String school = String.valueOf(schoolTXT.getText());
        String brother = String.valueOf(broTXT.getText());
        String sister = String.valueOf(sisTXT.getText());

        //generate the bounds for each portion of the variable
        Random randy = new Random();
        int rF = randy.nextInt(first.length());
        int rL = randy.nextInt(last.length());
        int rC = randy.nextInt(city.length());
        int rS = randy.nextInt(school.length());
        int rB = randy.nextInt(brother.length());
        int rSi = randy.nextInt(sister.length());


        String sciFiFirst = first.substring(0,rF) + last.substring(rL);
        String sciFiLast =  city.substring(0,rC) + school.substring(rS);
        String sciFiHome = brother.substring(0,rB) + sister.substring(rSi);
        output.setText(String.format("Welcome! %s %s from %s",sciFiFirst,sciFiLast,sciFiHome));



    }
}