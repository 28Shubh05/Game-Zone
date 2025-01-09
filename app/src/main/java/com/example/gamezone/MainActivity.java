package com.example.gamezone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView info;
    CardView bubble_blast, ludo, snake_ladder, chess,tic_tac_toe, candy_blast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find();

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , About.class);
                startActivity(intent);
            }
        });
        bubble_blast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Bubble_Blast.class);
                startActivity(intent);
            }
        });

        ludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Ludo_King.class);
                startActivity(intent);
            }
        });

        snake_ladder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Snake_and_Ladder.class);
                startActivity(intent);
            }
        });

        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Chess.class);
                startActivity(intent);
            }
        });

        tic_tac_toe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Splash_tic_tac_toe.class);
                startActivity(intent);
            }
        });
    }

    public  void  find(){
        info = findViewById(R.id.info);
        bubble_blast = findViewById(R.id.bubble_blast);
        ludo = findViewById(R.id.ludo);
        snake_ladder = findViewById(R.id.snake_ladder);
        chess = findViewById(R.id.chess);
        tic_tac_toe =findViewById(R.id.tic_tac_toe);
        candy_blast = findViewById(R.id.candy_blast);
    }
}