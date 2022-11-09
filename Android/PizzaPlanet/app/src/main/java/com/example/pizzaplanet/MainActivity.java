package com.example.pizzaplanet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton small, medium, large;
    private TextView output;
    private CheckBox anchovies, bacon, jalepenos;
    private Button submit;
    private double total;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radioGroup);
        small=findViewById(R.id.radioButton);
        medium=findViewById(R.id.radioButton2);
        large=findViewById(R.id.radioButton3);

        output=findViewById(R.id.textView4);

        anchovies=findViewById(R.id.checkBox);
        bacon=findViewById(R.id.checkBox2);
        jalepenos=findViewById(R.id.checkBox3);

        submit=findViewById(R.id.button2);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total = 0;
                if (anchovies.isChecked()){
                    total+=10.00;
                    Toast.makeText(MainActivity.this, "Are you serious right meow?", Toast.LENGTH_SHORT).show();
                }
                if (bacon.isChecked()){
                    total+=5.00;
                }
                if (jalepenos.isChecked()){
                    total+=2.50;
                }

                onRadioButtonClicked();
                output.setText(Double.toString(total));
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                 RadioButton rb = (RadioButton) radioGroup.findViewById(id);
            }
        });
    }

    private void onRadioButtonClicked(){
        Log.d("Radio Button Clicked", "triggered");
        int selectedID = radioGroup.getCheckedRadioButtonId();
        if (selectedID==-1){
            Toast.makeText(this, "Choose A Size", Toast.LENGTH_SHORT).show();
        }
        else{
            //if there is a radio button selected, set the object to that button
            RadioButton radioButton = (RadioButton) radioGroup.findViewById(selectedID);
            //if small is selected: total += 5
            if (radioButton.getText().equals("Small")){
                total+=5;
            }
            //medium 6
            if (radioButton.getText().equals("Medium")){
                total+=6;
            }
            //large 7
            if (radioButton.getText().equals("Large")){
                total+=7;
            }
        }
    }

}