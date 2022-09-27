package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


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

    private void playerDisplay ()
    {
        Button proofOfConcept = (Button) findViewById(R.id.conceptProofButton);
        proofOfConcept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                Log.i("info", "Player _'s turn");
            } // end onCLick
        });
    } // end next button handler


}