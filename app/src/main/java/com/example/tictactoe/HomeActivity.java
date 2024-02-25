package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {
    private Button btn_vs_h, btn_vs_c;
    private String chose;
    private ImageView x, o;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        chose = "X";
        x = findViewById(R.id.x);
        o = findViewById(R.id.o);

    }
    public void vsHuman(View view){

        Intent intent = new Intent(getApplicationContext(), VsHuman.class);
        intent.putExtra("chose", chose);
        startActivity(intent);
    }
    public void vsComputer(View view){
        Intent intent = new Intent(getApplicationContext(), VsComputer.class);
        intent.putExtra("chose", chose);
        startActivity(intent);
    }
    public void choseO(View view){
        chose = "O";
        o.setImageResource(R.drawable.zero2);
        x.setImageResource(R.drawable.x3);

    }
    public void choseX(View view){
        chose = "X";
        o.setImageResource(R.drawable.zero3);
        x.setImageResource(R.drawable.x2);
    }
}