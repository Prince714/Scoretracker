package com.example.prince_score;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     SwitchCompat switchCompat;

    TextView t1_view, t2_view;
    Button t1_inc,t1_dec,t2_inc,t2_dec;

    RadioGroup radioGroup;
    RadioButton radioButton;
    int team1 =0;
    int team2 =0;
    String te1,te2;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.scorettracker_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
                Toast.makeText(MainActivity.this,"Name: Prince Modi,IOT1009", Toast.LENGTH_SHORT);
                return true;

            case R.id.item2:
                Intent intent= new Intent(MainActivity.this,setting.class);
                startActivity(intent);

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
          setTheme(R.style.Theme_Dark);
      } else{
          setTheme(R.style.Theme_Light);
      }



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchCompat = findViewById(R.id.bt_swi);

        t1_view= findViewById(R.id.t1);
        t2_view =findViewById(R.id.t2);
        t1_inc = findViewById(R.id.t1_inc);
        t1_dec= findViewById(R.id.t1_dec);
        t2_inc=findViewById(R.id.t2_inc);
        t2_dec = findViewById(R.id.t2_dec);

        radioGroup = findViewById(R.id.radio_grp);

       switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
            if (isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
           }
       });




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
