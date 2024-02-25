package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VsHuman extends AppCompatActivity {
    private int turn;
    private int [] gameState = { 2, 2, 2, 2, 2, 2, 2, 2, 2};
    private int [][] winPosition = { {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6} };
    private boolean gameActive;
    private String chose;
    private ImageView p_one, p_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_human);
        p_one = findViewById(R.id.p_one);
        p_two = findViewById(R.id.p_two);
        Intent intent = getIntent();
        chose = intent.getStringExtra("chose");
        if(chose.equals("X")){
            turn = 0;
            p_one.setImageResource(R.drawable.x2);
            p_two.setImageResource(R.drawable.zero2);
        }
        else{
            turn = 1;
            p_one.setImageResource(R.drawable.zero2);
            p_two.setImageResource(R.drawable.x2);
        }

        gameActive = true;

    }
    public void playerTapped(View view){
        ImageView img = (ImageView) view;
        int tappedImage = Integer.parseInt(img.getTag().toString());
        if(gameState[tappedImage] == 2){
            gameState[tappedImage] = turn;
            img.setTranslationY(-1000f);
            if(turn == 0){
                img.setImageResource(R.drawable.x2);
                turn = 1;
                TextView status = findViewById(R.id.txt_status);
                status.setText("O's Turn - Tap to play");
            }
            else{
                img.setImageResource(R.drawable.zero2);
                turn = 0;
                TextView status = findViewById(R.id.txt_status);
                status.setText("X's Turn - Tap to play");
            }
            img.animate().translationYBy(1000f).setDuration(200);
        }
        checkWin();

    }
    public void checkWin(){
        for(int [] winPos: winPosition){
            if(gameState[winPos[0]] == gameState[winPos[1]] && gameState[winPos[2]] == gameState[winPos[1]] && gameState[winPos[0]] != 2){
                String winner ;
                if(gameState[winPos[0]] == 0){
                    winner = "X has won.";
                    TextView status = findViewById(R.id.txt_status);
                    status.setText(winner);
                    for(int i = 0; i<9; i++){
                        gameState[i] = 3;
                    }
                    gameActive = false;
                    TextView restart = findViewById(R.id.txt_restart);
                    restart.setText("Restart");
                    restart.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            gameReset();
                        }
                    });
                }
                else if(gameState[winPos[0]] == 1){
                    winner = "O has won.";
                    TextView status = findViewById(R.id.txt_status);
                    status.setText(winner);
                    for(int i = 0; i<9; i++){
                        gameState[i] = 3;
                    }
                    gameActive = false;
                    TextView restart = findViewById(R.id.txt_restart);
                    restart.setText("Restart");
                    restart.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            gameReset();
                        }
                    });
                }

            }
            if(gameActive){
                int two =0 ;
                for(int i = 0; i < 9; i++){
                    if(gameState[i] == 2){
                        two++;
                    }
                }
                if(two<1){
                    TextView status = findViewById(R.id.txt_status);
                    status.setText("Draw");
                    TextView restart = findViewById(R.id.txt_restart);
                    restart.setText("Restart");
                    restart.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            gameReset();
                        }
                    });
                }
            }

        }
    }

    public void gameReset(){
        gameActive = true;
        if(chose.equals("O")){
            chose = "X";
            turn = 0;
            p_one.setImageResource(R.drawable.x2);
            p_two.setImageResource(R.drawable.zero2);
        }
        else{
            chose = "O";
            turn = 1;
            p_one.setImageResource(R.drawable.zero2);
            p_two.setImageResource(R.drawable.x2);
        }
        for(int i=0; i<9; i++){
            gameState[i] = 2;
        }
        ImageView a1 = findViewById(R.id.a1);
        a1.setImageResource(0);
        ImageView a2 = findViewById(R.id.a2);
        a2.setImageResource(0);
        ImageView a3 = findViewById(R.id.a3);
        a3.setImageResource(0);
        ImageView b1 = findViewById(R.id.b1);
        b1.setImageResource(0);
        ImageView b2 = findViewById(R.id.b2);
        b2.setImageResource(0);
        ImageView b3 = findViewById(R.id.b3);
        b3.setImageResource(0);
        ImageView c1 = findViewById(R.id.c1);
        c1.setImageResource(0);
        ImageView c2 = findViewById(R.id.c2);
        c2.setImageResource(0);
        ImageView c3 = findViewById(R.id.c3);
        c3.setImageResource(0);
        TextView restart = findViewById(R.id.txt_restart);
        restart.setText("");
    }

    public void back(View view){
        finish();
    }
}