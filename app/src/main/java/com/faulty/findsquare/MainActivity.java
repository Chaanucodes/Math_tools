package com.faulty.findsquare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToCalc(View view){
        Intent goToCal = new Intent(this,CalculationSquare.class);
        startActivity(goToCal);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
