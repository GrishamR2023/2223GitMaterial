package com.example.navapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link madLibGen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class madLibGen extends Fragment {

    EditText enter1, enter2, enter3, enter4, enter5, enter6, enter7, enter8;
    TextView output2;
    Button generate;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_mad_lib_gen,container,false);

        enter1 = rootView.findViewById(R.id.enter1);
        enter2 = rootView.findViewById(R.id.enter2);
        enter3 = rootView.findViewById(R.id.enter3);
        enter4 = rootView.findViewById(R.id.enter4);
        enter5 = rootView.findViewById(R.id.enter5);
        enter6 = rootView.findViewById(R.id.enter6);
        enter7 = rootView.findViewById(R.id.enter7);
        enter8 = rootView.findViewById(R.id.enter8);
        output2 = rootView.findViewById(R.id.output2);
        generate = rootView.findViewById(R.id.generate);
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output2.setText(generate());
            }
        });
     return rootView;
    }

    private String generate() {
        String num1 = String.valueOf(enter1.getText());
        String noun = String.valueOf(enter2.getText());
        String verb = String.valueOf(enter3.getText());
        String adjective = String.valueOf(enter4.getText());
        String number = String.valueOf(enter5.getText());
        String planet = String.valueOf(enter6.getText());
        String buildingName = String.valueOf(enter7.getText());
        String townName = String.valueOf(enter8.getText());

        String madLib = String.format("Once upon a time, there were %s dwarves who lived in a swamp. The %s lived right next to the dwarves and they always %s around the dwarves. The dwarves thought their neighbors were %s... The dwarves decided to put %s frogs in their neighbors pond to show them who's boss! Their neighbors got so mad, they forced the dwarves onto a spaceship and sent them to %s, where they decided to build a replica %s. They also built a town around it, and called it %s. There, they lived happily ever after!",num1,noun,verb,adjective,number,planet,buildingName,townName);
        return madLib;
    }
}