package com.example.navapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class guessTheNum extends Fragment {

    EditText enterNum;
    Button checkNum, generateNum;
    TextView points;
    TextView lives;
    TextView highLow;
    Random randy = new Random();
    int number = randy.nextInt();
    int pointsVar = 0;
    int livesVar = 10;
    String highLowVar = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_guess_the_num,container,false);

        enterNum = rootView.findViewById(R.id.enterNum);
        checkNum = rootView.findViewById(R.id.checkNum);
        points = rootView.findViewById(R.id.points);
        lives = rootView.findViewById(R.id.lives);
        highLow = rootView.findViewById(R.id.highLow);
        generateNum = rootView.findViewById(R.id.generateNum);







        generateNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }

            private void reset() {
                number = randy.nextInt();
                pointsVar = 0;
                livesVar = 10;
                highLowVar = "";
                points.setText("0");
                lives.setText("10");
                enterNum.setText("");
            }
        });






        checkNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkGuess();
            }

            private void checkGuess() {
                if(enterNum.getText().equals(String.valueOf(number))){
                    highLow.setText("You Win!!!");
                    pointsVar = pointsVar+50;
                    pointsVar = livesVar*5+pointsVar;
                }
                else{
                    if(Integer.parseInt(enterNum.getText().toString()) > number){
                        highLow.setText("Higher");
                        livesVar = livesVar-1;
                        lives.setText(String.valueOf(livesVar));
                    }
                    else if(Integer.parseInt(enterNum.getText().toString()) < number){
                        highLow.setText("Lower");
                        livesVar = livesVar-1;
                        lives.setText(String.valueOf(livesVar));
                    }
                }
            }
        });


        return rootView;
}
}