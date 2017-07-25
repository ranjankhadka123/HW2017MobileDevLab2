package com.example.rkhadka.hw2017mobiledevlab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button blueButton;
    private Button greenButton;
    private TextView lab2_view;
    private LinearLayout back_layout;
    private boolean check = true;
    private boolean check2 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lab2_view = (TextView) findViewById(R.id.lab2_view);
        back_layout = (LinearLayout) findViewById(R.id.background_color);
        blueButton = (Button) findViewById(R.id.blue_button_id);
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                lab2_view.setText("now we feel blue");
                back_layout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
                if(check) {
                    Toast.makeText(MainActivity.this, "now we feel blue", Toast.LENGTH_SHORT).show();
                    check = false;
                }
                check2 = true;

            }
        });
        greenButton = (Button) findViewById(R.id.green_button_id);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lab2_view.setText("now we feel green");
                back_layout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                if(check2) {
                    Toast.makeText(MainActivity.this, "now we feel green", Toast.LENGTH_SHORT).show();
                    check2 = false;
                }
                check = true;
            }
        });
    }


}

