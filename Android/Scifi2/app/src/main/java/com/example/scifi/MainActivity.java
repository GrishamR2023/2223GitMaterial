package com.example.scifi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
                
            }
        });




    }
}