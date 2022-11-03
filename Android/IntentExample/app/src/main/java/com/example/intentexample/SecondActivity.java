package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    //1. create global variables
    private Button second;
    private EditText secondInformation;
    private TextView secondLBL;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);   //this connects the xml to the java

        //2. connect variables to widgets

        second = findViewById(R.id.secondBTN);
        secondInformation = findViewById(R.id.secondUI);
        secondLBL = findViewById(R.id.secondLBL);

        String valueOfIntent = getIntent().getStringExtra("user input");
        String ui =  valueOfIntent+"\t"+secondInformation.getText();
        secondLBL.setText(valueOfIntent);

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(SecondActivity.this, SecondActivity.class);

                i.putExtra("user input",ui);
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