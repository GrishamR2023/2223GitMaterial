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
    TextView points, lives, highLow;


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

        Random randy = new Random();
        final int[] number = {randy.nextInt()};
        final int[] pointsVar = {0};
        final int[] livesVar = {10};
        final String[] highLow = {""};




        generateNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }

            private void reset() {
                number[0] = randy.nextInt();
                pointsVar[0] = 0;
                livesVar[0] = 10;
                highLow[0] = "";
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
            }
        });


        return rootView;
}
}