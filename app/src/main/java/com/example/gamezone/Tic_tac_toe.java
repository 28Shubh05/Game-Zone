package com.example.gamezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.gamezone.databinding.ActivityMainBinding;
import com.example.gamezone.databinding.ActivityTicTacToeBinding;

import java.util.ArrayList;
import java.util.List;

public class Tic_tac_toe extends AppCompatActivity {
    ActivityTicTacToeBinding binding;
    private final List<int []> combinationsList = new ArrayList<>();
    private int[] boxPosition = {0,0,0,0,0,0,0,0,0};
    private int playerTurn = 1;
    private int totalSelectionBoxes = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTicTacToeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        combinationsList.add(new int[] {0,1,2});
        combinationsList.add(new int[] {3,4,5});
        combinationsList.add(new int[] {6,7,8});
        combinationsList.add(new int[] {0,3,6});
        combinationsList.add(new int[] {1,4,7});
        combinationsList.add(new int[] {2,5,8});
        combinationsList.add(new int[] {2,4,6});
        combinationsList.add(new int[] {0,4,8});

        String getPlayerOneName = getIntent().getStringExtra("user_1");
        String getPlayerTwoName = getIntent().getStringExtra("user_2");

        binding.playername1.setText(getPlayerOneName);
        binding.playername2.setText(getPlayerTwoName);

        changePlayerTurn(1);

        binding.image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(0)){
                    performAction((ImageView) v , 0);
                }
            }
        });

        binding.image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(1)){
                    performAction((ImageView) v , 1);
                }
            }
        });

        binding.image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(2)){
                    performAction((ImageView) v , 2);
                }
            }
        });

        binding.image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(3)){
                    performAction((ImageView) v , 3);
                }
            }
        });

        binding.image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(4)){
                    performAction((ImageView) v , 4);
                }
            }
        });

        binding.image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(5)){
                    performAction((ImageView) v , 5);
                }
            }
        });

        binding.image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(6)){
                    performAction((ImageView) v , 6);
                }
            }
        });

        binding.image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(7)){
                    performAction((ImageView) v , 7);
                }
            }
        });

        binding.image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(8)){
                    performAction((ImageView) v , 8);
                }
            }
        });

    }

    private void performAction(ImageView imageView , int selectedBoxPosition){
        boxPosition[selectedBoxPosition] = playerTurn;
        if(playerTurn == 1){
            imageView.setImageResource(R.drawable.cross);
            if(checkResults()){
                Intent intent = new Intent(Tic_tac_toe.this , Result_tic_tac_toe.class);
                intent.putExtra("result" , binding.playername1.getText().toString() + " is the winner.");
                startActivity(intent);
                finish();
            }
            else if(totalSelectionBoxes == 9){
                Intent intent = new Intent(Tic_tac_toe.this , Result_tic_tac_toe.class);
                intent.putExtra("result" , "Match Draw");
                startActivity(intent);
                finish();
            }
            else{
                changePlayerTurn(2);
                totalSelectionBoxes++;
            }
        }
        else{
            imageView.setImageResource(R.drawable.circle);
            if(checkResults()){
                Intent intent = new Intent(Tic_tac_toe.this , Result_tic_tac_toe.class);
                intent.putExtra("result" , binding.playername2.getText().toString() + " is the winner.");
                startActivity(intent);
                finish();
            }
            else if(totalSelectionBoxes == 9){
                Intent intent = new Intent(Tic_tac_toe.this , Result_tic_tac_toe.class);
                intent.putExtra("result" , "Match Draw");
                startActivity(intent);
                finish();
            }
            else{
                changePlayerTurn(1);
                totalSelectionBoxes++;
            }
        }
    }

    private void changePlayerTurn(int currentPlayerTurn){
        playerTurn = currentPlayerTurn;
        if(playerTurn == 1){
            binding.player1layout.setBackgroundResource(R.drawable.black_border);
            binding.player2layout.setBackgroundResource(R.drawable.white_box);
        }

        else{
            binding.player2layout.setBackgroundResource(R.drawable.black_border);
            binding.player1layout.setBackgroundResource(R.drawable.white_box);
        }
    }

    private boolean checkResults(){
        boolean response = false;
        for (int i = 0; i<combinationsList.size();i++){
            final int[] combination = combinationsList.get(i);
            if(boxPosition[combination[0]] == playerTurn && boxPosition[combination[1]] == playerTurn && boxPosition[combination[2]] == playerTurn){
                response = true;
            }
        }
        return response;
    }

    private boolean isBoxSelectable(int boxPos){
        boolean response = false;
        if(boxPosition[boxPos] == 0){
            response = true;
        }
        return response;
    }

    public void restartMatch(){
        boxPosition = new int[] {0,0,0,0,0,0,0,0,0};
        playerTurn = 1;
        totalSelectionBoxes = 1;
        binding.image1.setImageResource(R.drawable.white_box);
        binding.image2.setImageResource(R.drawable.white_box);
        binding.image3.setImageResource(R.drawable.white_box);
        binding.image4.setImageResource(R.drawable.white_box);
        binding.image5.setImageResource(R.drawable.white_box);
        binding.image6.setImageResource(R.drawable.white_box);
        binding.image7.setImageResource(R.drawable.white_box);
        binding.image8.setImageResource(R.drawable.white_box);
        binding.image9.setImageResource(R.drawable.white_box);
    }
}