package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView p1Text = (TextView)findViewById(R.id.player1Text);
        TextView p2Text = (TextView)findViewById(R.id.player2Text);

        Button proof = (Button)findViewById(R.id.conceptProofButton);

        proof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerDisplay(p1Text, p2Text);
            }
        }); // listener that calls next activity method

    }

    public void playerDisplay (TextView player1Text, TextView player2Text)
    {
        Button proofOfConcept = (Button) findViewById(R.id.conceptProofButton);
        proofOfConcept.setOnClickListener(new View.OnClickListener() {
            int pTurn = 1;
            @Override
            public void onClick (View v)
            {
                if (pTurn % 2 == 0)
                {
                    Log.i("info", "Player " + 2 + "'s turn");
                    player1Text.setBackgroundColor(Color.WHITE);
                    player2Text.setBackgroundColor(Color.YELLOW);
                }
                else {
                    Log.i("info", "Player " + 1 + "'s turn");
                    player2Text.setBackgroundColor(Color.WHITE);
                    player1Text.setBackgroundColor(Color.YELLOW);
                }
                pTurn++;
            } // end onCLick
        });
    } // end next button handler


}