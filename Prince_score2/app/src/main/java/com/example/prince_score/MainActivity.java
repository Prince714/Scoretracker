package com.example.prince_score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    TextView t1_view, t2_view;
    Button t1_inc,t1_dec,t2_inc,t2_dec;

    RadioGroup radioGroup;
    RadioButton radioButton;
    int team1 =0;
    int team2 =0;
    String te1,te2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1_view= findViewById(R.id.t1);
        t2_view =findViewById(R.id.t2);
        t1_inc = findViewById(R.id.t1_inc);
        t1_dec= findViewById(R.id.t1_dec);
        t2_inc=findViewById(R.id.t2_inc);
        t2_dec = findViewById(R.id.t2_dec);

        radioGroup = findViewById(R.id.radio_grp);






        t1_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this,
                            "No point given",
                            Toast.LENGTH_SHORT)
                            .show();
                }
                else {
                    radioButton = findViewById(selectedId);
                    if (selectedId==R.id.radioButton1){
                        team1 = team1+1;
                        te1 = String.valueOf(team1);
                        t1_view.setText(te1);

                    }else if (selectedId==R.id.radioButton2){
                        team1 = team1+2;
                        te1 = String.valueOf(team1);
                        t1_view.setText(te1);
                    }


                }

            }
        });

        t1_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this,
                            "No point given",
                            Toast.LENGTH_SHORT)
                            .show();
                }
                else {
                    radioButton = findViewById(selectedId);
                    if (selectedId==R.id.radioButton1){
                        if (team1<1){
                            Toast.makeText(MainActivity.this, "No decrement", Toast.LENGTH_SHORT).show();
                        }else{
                            team1 = team1-1;
                            te1 = String.valueOf(team1);
                            t1_view.setText(te1);
                        }


                    }else if (selectedId==R.id.radioButton2){
                        if (team1<2){
                            Toast.makeText(MainActivity.this, "No decrement", Toast.LENGTH_SHORT).show();
                        }else{
                            team1 = team1-2;
                            te1 = String.valueOf(team1);
                            t1_view.setText(te1);
                        }

                    }


                }

            }
        });

        t2_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this,
                            "No point given",
                            Toast.LENGTH_SHORT)
                            .show();
                }
                else {
                    radioButton = findViewById(selectedId);
                    if (selectedId==R.id.radioButton1){
                        team2 = team2+1;
                        te2 = String.valueOf(team2);
                        t2_view.setText(te2);

                    }else if (selectedId==R.id.radioButton2){
                        team2 = team2+2;
                        te2 = String.valueOf(team2);
                        t2_view.setText(te2);
                    }


                }

            }
        });

        t2_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this,
                            "No point given",
                            Toast.LENGTH_SHORT)
                            .show();
                }
                else {
                    radioButton = findViewById(selectedId);
                    if (selectedId==R.id.radioButton1){
                        if (team2<1){
                            Toast.makeText(MainActivity.this, "You cannot do decrement", Toast.LENGTH_SHORT).show();
                        }else{
                            team2 = team2-1;
                            te2 = String.valueOf(team2);
                            t2_view.setText(te2);
                        }


                    }else if (selectedId==R.id.radioButton2){
                        if (team2<2){
                            Toast.makeText(MainActivity.this, "You cannot do decrement", Toast.LENGTH_SHORT).show();
                        }else{
                            team2 = team2-2;
                            te2 = String.valueOf(team2);
                            t2_view.setText(te2);
                        }

                    }


                }

            }
        });

    }
}
