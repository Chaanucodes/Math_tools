package com.faulty.findsquare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import static java.lang.Math.pow;

public class CalculationSquare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_square);

        final ImageView imageView = findViewById(R.id.imageView);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        final EditText editValues = findViewById(R.id.editValues);
        final TextView textSquare = findViewById(R.id.textAutoChangeSqr);
        final TextView textCube = findViewById(R.id.textAutoChangeCube);
        final TextView textSqrRt = findViewById(R.id.textAutoChangeSqrRt);
        final TextView textCubRt = findViewById(R.id.textAutoChangeCubeRt);

        editValues.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    long numberSquare = Long.parseLong(editValues.getText().toString());
                    String squared = String.format("%,d",squareIt(numberSquare));
                    textSquare.setText(squared);

                    long numberCube = Long.parseLong(editValues.getText().toString());
                    String cubed = String.format("%,d",cubeIt(numberCube));
                    textCube.setText(cubed);

                    double sqrRt = Math.sqrt(Long.parseLong(editValues.getText().toString()));
                    String sqRted = String.format("%.5f",sqrRt);
                    textSqrRt.setText(sqRted);

                    double cubeRt = Math.pow(Long.parseLong(editValues.getText().toString()),0.333333);
                    String cubeRted = String.format("%.5f",cubeRt);
                    textCubRt.setText(cubeRted);
                }catch(NumberFormatException e){e.printStackTrace();}
            }
        });

    }
    private long squareIt(long num){
        return num*num;
    }
    private long cubeIt(long num){
        return num*num*num;
    }
}
