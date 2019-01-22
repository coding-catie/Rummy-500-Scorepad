package com.catielynn.android.rummy500scorepadapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Enter2PlayersNames extends AppCompatActivity {

    private EditText mPlayerAName;
    private EditText mPlayerBName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter2_players_names);

        //bind edittext to variable
        mPlayerAName = (EditText) findViewById(R.id.player_a_name);
        mPlayerBName = (EditText) findViewById(R.id.player_b_name);

        /*Button takes user to game for 2 players.
         */
        Button button_game_2 = (Button)findViewById(R.id.next_button_game_2);
        button_game_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get value of edit text,  then create intent,  then add String as extra
                String editTextPlayerA = mPlayerAName.getText().toString();
                String editTextPlayerB = mPlayerBName.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Game2Players.class);

                //put String as extra.  Need a key first to call later,  then the actual string
                intent.putExtra("I want Player A Name", editTextPlayerA);
                intent.putExtra("I want Player B Name", editTextPlayerB);
                startActivity(intent);
            }
        });
        }
    }
