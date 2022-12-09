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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link sciFiGen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class sciFiGen extends Fragment {

    EditText firstTXT, lastTXT, cityTXT, schoolTXT, broTXT, sisTXT;
    Button generatorBTN;
    TextView output;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public sciFiGen() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment sciFiGen.
     */
    // TODO: Rename and change types and number of parameters
    public static sciFiGen newInstance(String param1, String param2) {
        sciFiGen fragment = new sciFiGen();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Second Thing: connect global variables to widget
        EditText firstTXT;
        EditText lastTXT;
        EditText cityTXT;
        EditText schoolTXT;
        EditText broTXT;
        EditText sisTXT;
        TextView output;
        Button generatorBTN;

        firstTXT= requireView().findViewById(R.id.textView);
        lastTXT= requireView().findViewById(R.id.lastTXT);
        cityTXT= requireView().findViewById(R.id.cityTXT);
        schoolTXT= requireView().findViewById(R.id.schoolTXT);
        broTXT= requireView().findViewById(R.id.broTXT);
        sisTXT= requireView().findViewById(R.id.sisTXT);
        output= requireView().findViewById(R.id.output);
        generatorBTN = requireView().findViewById(R.id.generator);
        generatorBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generate();
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

        });
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }
        return null;
    }}


