package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tictactoe.R;

public class MainActivity extends AppCompatActivity {
    private int player = 1;
    Button btn;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        textView2 = (TextView) findViewById(R.id.textView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player = switchPlayer(player);
                textView2.setText(Integer.toString(player));
            }
        });
    }
    public static int switchPlayer(int player)
    {
        if(player == 1)
            player = 2;
        else
            player = 1;
        return player;
    }//end methodxde
}
