package com.catielynn.android.rummy500scorepad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.catielynn.android.rummy500scorepad.R;

public class MainActivity extends AppCompatActivity {
    int scorePlayerA = 0;
    int scorePlayerB = 0;
    int scorePlayerC = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonForTwo = (Button)findViewById(R.id.two_player_button);
        buttonForTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Enter2PlayersNames.class));
            }
        });

        Button buttonForThree = (Button)findViewById(R.id.three_player_button);
        buttonForThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Enter3PlayersNames.class));
            }
        });

        Button buttonForFour = (Button)findViewById(R.id.four_player_button);
        buttonForFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Enter4PlayersNames.class));
            }
        });
    }

}
