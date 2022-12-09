package com.example.a6_navdrawertest.ui.dice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.a6_navdrawertest.R;

import java.util.Random;

public class DiceFragment extends Fragment {
    private ImageView dice;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //this line connects the Java to XML
        //View obj = inflater.inflate(layoutFile,where it is ran, not attached to root);
        View rootView = inflater.inflate(R.layout.fragment_dice,container,false);

        //connect the widgets
        //findViewById is a method from the View class -> activities don't need a view obj
        //  fragments do because they aren't activities
        dice = rootView.findViewById(R.id.diceIMG);
        //setOnClick
        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });

        return rootView;
    }

    //press the dice to roll the dice
    private void rollDice(){
        //generate a random#
        Random rng = new Random();
        int randomNumber = rng.nextInt(6);
        //set the image to that number die
        //switch based on the variable
        switch(randomNumber){
            case 0:
                dice.setImageResource(R.drawable.dice1);
                break;
            case 1:
                dice.setImageResource(R.drawable.dice2);
                break;
            case 2:
                dice.setImageResource(R.drawable.dice3);
                break;
            case 3:
                dice.setImageResource(R.drawable.dice4);
                break;
            case 4:
                dice.setImageResource(R.drawable.dice5);
                break;
            case 5:
                dice.setImageResource(R.drawable.dice6);
                break;
        }
    }


}