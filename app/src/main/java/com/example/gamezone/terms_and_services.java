package com.example.gamezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class terms_and_services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_services);
    }

    public void back_to_about(View view) {
        Intent intent = new Intent(getApplicationContext() , About.class);
        startActivity(intent);
    }
}