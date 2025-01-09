package com.example.gamezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class add_player_tic_tac_toe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player_tic_tac_toe);

        Intent intent = new Intent(this , Tic_tac_toe.class);
        Button button = findViewById(R.id.start_tic_tac_toe);
        EditText user_1 = findViewById(R.id.name_of_player_1);
        EditText user_2 = findViewById(R.id.name_of_player_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = user_1.getText().toString();
                String s2 = user_2.getText().toString();
                if(s1.isEmpty() | s2.isEmpty()){
                    Toast.makeText(add_player_tic_tac_toe.this , "Enter Names of Player" , Toast.LENGTH_LONG).show();
                }
                else {
                    intent.putExtra("user_1", s1);
                    intent.putExtra("user_2", s2);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}