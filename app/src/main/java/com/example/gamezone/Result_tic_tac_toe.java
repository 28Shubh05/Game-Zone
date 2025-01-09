package com.example.gamezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result_tic_tac_toe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_tic_tac_toe);

        TextView result = findViewById(R.id.result_tic_tac_toe);
        Button restart = findViewById(R.id.play_again_tic_tac_toe);
        Button home = findViewById(R.id.back_button_tic_tac_toe);

        String res = getIntent().getStringExtra("result");
        result.setText(res);

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result_tic_tac_toe.this , add_player_tic_tac_toe.class);
                startActivity(intent);
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result_tic_tac_toe.this , MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}