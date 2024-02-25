package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class VsComputer extends AppCompatActivity {
    private int turn, fturn;
    private int [] gameState = { 2, 2, 2, 2, 2, 2, 2, 2, 2};
    private int [][] winPosition = { {4, 0, 8}, {4, 2, 6}, {6, 7, 8}, {0, 3, 6}, {4, 1, 7}, {2, 5, 8}, {0, 1, 2}, {4, 3, 5} };
    private boolean gameActive;
    private boolean cturn, turnlock;
    private String chose;
    private ImageView p_one, p_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_computer);
        cturn = true;
        p_one = findViewById(R.id.p_one);
        p_two = findViewById(R.id.p_two);
        Intent intent = getIntent();
        chose = intent.getStringExtra("chose");
        if(chose.equals("X")){

            p_one.setImageResource(R.drawable.x2);
            p_two.setImageResource(R.drawable.zero2);
        }
        else{

            p_one.setImageResource(R.drawable.zero2);
            p_two.setImageResource(R.drawable.x2);

        }
        turn = 0;
        fturn = 0;
        gameActive = true;
    }
    public void computerTurn(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean wlo = true;
                while (wlo){
                    for(int [] comT: winPosition){
                        if(gameState[comT[0]] == gameState[comT[1]] && gameState[comT[2]] == 2 && gameState[comT[0]] == 1){
                            gameState[comT[2]] = turn;
                            if(comT[2] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[0]] == gameState[comT[2]] && gameState[comT[1]] == 2 && gameState[comT[0]] == 1){
                            gameState[comT[1]] = turn;
                            if(comT[1] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[1]] == gameState[comT[2]] && gameState[comT[0]] == 2 && gameState[comT[1]] == 1){
                            gameState[comT[0]] = turn;
                            if(comT[0] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[0]] == gameState[comT[1]] && gameState[comT[2]] == 2 && gameState[comT[0]] == 0){
                            gameState[comT[2]] = turn;
                            if(comT[2] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[0]] == gameState[comT[2]] && gameState[comT[1]] == 2 && gameState[comT[0]] == 0){
                            gameState[comT[1]] = turn;
                            if(comT[1] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[1]] == gameState[comT[2]] && gameState[comT[0]] == 2 && gameState[comT[1]] == 0){
                            gameState[comT[0]] = turn;
                            if(comT[0] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[0]] == 1 && gameState[comT[1]] == 2){
                            gameState[comT[1]] = turn;
                            if(comT[1] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[0]] == 1 && gameState[comT[2]] == 2){
                            gameState[comT[2]] = turn;
                            if(comT[2] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[1]] == 1 && gameState[comT[0]] == 2){
                            gameState[comT[0]] = turn;
                            if(comT[0] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[1]] == 1 && gameState[comT[2]] == 2){
                            gameState[comT[2]] = turn;
                            if(comT[2] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                img.setImageResource(R.drawable.zero2);
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[2]] == 1 && gameState[comT[0]] == 2){
                            gameState[comT[0]] = turn;
                            if(comT[0] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[2]] == 1 && gameState[comT[1]] == 2){
                            gameState[comT[1]] = turn;
                            if(comT[1] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[0]] == 2){
                            gameState[comT[0]] = turn;
                            if(comT[0] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[0] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[1]] == 2){
                            gameState[comT[1]] = turn;
                            if(comT[1] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[1] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                    for(int [] comT: winPosition){
                        if(gameState[comT[2]] == 2){
                            gameState[comT[2]] = turn;
                            if(comT[2] == 0){
                                ImageView img = findViewById(R.id.a1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 1){
                                ImageView img = findViewById(R.id.a2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 2){
                                ImageView img = findViewById(R.id.a3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 3){
                                ImageView img = findViewById(R.id.b1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 4){
                                ImageView img = findViewById(R.id.b2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 5){
                                ImageView img = findViewById(R.id.b3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 6){
                                ImageView img = findViewById(R.id.c1);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 7){
                                ImageView img = findViewById(R.id.c2);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            else if(comT[2] == 8){
                                ImageView img = findViewById(R.id.c3);
                                img.setTranslationY(-1000f);
                                if(chose.equals("X")){
                                    img.setImageResource(R.drawable.zero2);
                                }
                                else {
                                    img.setImageResource(R.drawable.x2);
                                }
                                img.animate().translationYBy(1000f).setDuration(200);
                            }
                            turn = 0;
                            if(chose.equals("X")){
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("X's Turn - Tap to play");
                            }
                            else {
                                TextView status = findViewById(R.id.txt_status);
                                status.setText("O's Turn - Tap to play");
                            }
                            wlo = false;
                            break;
                        }
                    }
                    if(wlo == false){
                        break;
                    }
                }
                cturn = false;
                checkWin();
            }
        }, 500);

    }
    public void playerTapped(View view){
        if(turn == 0) {
            ImageView img = (ImageView) view;
            int tappedImage = Integer.parseInt(img.getTag().toString());
            if (gameState[tappedImage] == 2) {
                gameState[tappedImage] = turn;
                img.setTranslationY(-1000f);
                if (turn == 0) {
                    if(chose.equals("X")){
                        img.setImageResource(R.drawable.x2);
                        TextView status = findViewById(R.id.txt_status);
                        status.setText("O's Turn - Tap to play");
                    }
                    else {
                        img.setImageResource(R.drawable.zero2);
                        TextView status = findViewById(R.id.txt_status);
                        status.setText("X's Turn - Tap to play");
                    }

                    turn = 1;
                    cturn = true;

                }
//
                img.animate().translationYBy(1000f).setDuration(200);
            }
            checkWin();
            if (cturn == true) {
                computerTurn();
            }

        }
    }
    public void checkWin(){
        for(int [] winPos: winPosition){
            if(gameState[winPos[0]] == gameState[winPos[1]] && gameState[winPos[2]] == gameState[winPos[1]] && gameState[winPos[0]] != 2){
                String winner ;
                if(gameState[winPos[0]] == 0){
                    winner = "You won.";
                    TextView status = findViewById(R.id.txt_status);
                    status.setText(winner);
                    for(int i = 0; i<9; i++){
                        gameState[i] = 3;
                    }
                    gameActive = false;
                    cturn = false;
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
                    winner = "Computer won.";
                    TextView status = findViewById(R.id.txt_status);
                    status.setText(winner);
                    for(int i = 0; i<9; i++){
                        gameState[i] = 3;
                    }
                    gameActive = false;
                    cturn = false;
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
                    cturn = false;
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
        cturn = true;
        gameActive = true;
        if(fturn == 0){
            turn = 1;
            fturn = 1;
        }
        else {
            turn = 0;
            fturn = 0;
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
        Handler handler = new Handler();
        if(fturn == 1){
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    computerTurn();

                }
            }, 500);
        }

    }

    public void back(View view){
        finish();
    }
}