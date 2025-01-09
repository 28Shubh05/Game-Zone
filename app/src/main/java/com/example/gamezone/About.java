package com.example.gamezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class About extends AppCompatActivity {
    ImageView back;
    TextView terms,privacy,third_party;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        find();
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , terms_and_services.class);
                startActivity(intent);
            }
        });

        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , Privacy.class);
                startActivity(intent);
            }
        });

        third_party.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , Third_Party.class);
                startActivity(intent);
            }
        });
    }
    public void find(){
        back = findViewById(R.id.back);
        terms = findViewById(R.id.terms);
        privacy = findViewById(R.id.privacy);
        third_party = findViewById(R.id.third_party);
    }

    public void back(View view) {
        Intent intent = new Intent(getApplicationContext() , MainActivity.class);
        startActivity(intent);
    }
}