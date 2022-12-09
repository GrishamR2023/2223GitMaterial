package com.example.navapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;
import java.util.Random;

public class sciFiGen extends Fragment {

    EditText firstTXT, lastTXT, cityTXT, schoolTXT, broTXT, sisTXT;
    Button generatorBTN;
    TextView output;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Second Thing: connect global variables to widget

        View rootView = inflater.inflate(R.layout.fragment_sci_fi_gen,container,false);

        firstTXT= rootView.findViewById(R.id.firstTXT);
        lastTXT= rootView.findViewById(R.id.lastTXT);
        cityTXT= rootView.findViewById(R.id.cityTXT);
        schoolTXT= rootView.findViewById(R.id.schoolTXT);
        broTXT= rootView.findViewById(R.id.broTXT);
        sisTXT= rootView.findViewById(R.id.sisTXT);
        output= rootView.findViewById(R.id.output);
        generatorBTN = rootView.findViewById(R.id.generator);
        generatorBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generate();
            }
        });
        return rootView;
    }
    private void generate() {
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


        String sciFiFirst = first.substring(0, rF) + last.substring(rL);
        String sciFiLast = city.substring(0, rC) + school.substring(rS);
        String sciFiHome = brother.substring(0, rB) + sister.substring(rSi);
        output.setText(String.format("Welcome! %s %s from %s", sciFiFirst, sciFiLast, sciFiHome));
    }
}


