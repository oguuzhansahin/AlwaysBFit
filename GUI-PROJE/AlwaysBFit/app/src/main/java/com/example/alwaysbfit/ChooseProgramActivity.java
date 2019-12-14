package com.example.alwaysbfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChooseProgramActivity extends AppCompatActivity {

    TextView welcoming;
    Button lose_weights;
    Button gain_muscles;
    Button cardio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_program);

        lose_weights = findViewById(R.id.lose_weights_button);
        gain_muscles = findViewById(R.id.gain_muscles_button);
        cardio       = findViewById(R.id.cardio_button);
        welcoming    = findViewById(R.id.welcoming);

        Intent intent = getIntent();

        String username = "Welcome    " + intent.getStringExtra("name");
        welcoming.setText(username);


        lose_weights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        gain_muscles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        cardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


    }
}