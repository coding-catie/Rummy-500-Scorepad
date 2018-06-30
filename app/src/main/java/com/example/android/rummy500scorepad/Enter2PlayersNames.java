package com.example.android.rummy500scorepad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Enter2PlayersNames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter2_players_names);

        /**
         * Button takes user to game for 2 players.
         */
        Button button_game_2 = (Button)findViewById(R.id.next_button_game_2);

        button_game_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Enter2PlayersNames.this, Game2Players.class));
            }
        });
    }
    
}
