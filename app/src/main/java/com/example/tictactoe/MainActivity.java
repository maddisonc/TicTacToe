package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView p1Text = (TextView)findViewById(R.id.player1Text);
    TextView p2Text = (TextView)findViewById(R.id.player2Text);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button proof = (Button)findViewById(R.id.conceptProofButton);

        proof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerDisplay();
            }
        }); // listener that calls next activity method

    }

    public void playerDisplay ()
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
                    //p2Text.setBackgroundColor(Color.RED);
                    //p1Text.setBackgroundColor(Color.WHITE);
                }
                else {
                    Log.i("info", "Player " + 1 + "'s turn");
                    //p1Text.setBackgroundColor(Color.RED);
                    //p2Text.setBackgroundColor(Color.WHITE);
                }
                pTurn++;
            } // end onCLick
        });
    } // end next button handler


}