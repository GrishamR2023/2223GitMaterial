package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    //1. create global variables
    private Button third;
    private EditText thirdInformation;
    private TextView thirdLBL;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);   //this connects the xml to the java

        //2. connect variables to widgets

        third = findViewById(R.id.thirdBTN);
        thirdInformation = findViewById(R.id.thirdUI);
        thirdLBL = findViewById(R.id.thirdLBL);

        String valueOfIntent = getIntent().getStringExtra("user input");
        thirdLBL.setText(valueOfIntent);

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(i);
            }
    /*
        1. create java and xml files
        2. extends AppCompatActivity
        3. setup onCreate
        4. setContentView(R.layout.new_xml_file)
        5. add Activity to the Manifest
     */
        });
    }
}