package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0;
    int scoreB = 0;

    /*
     * Functions for team A
     * */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View v){
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    public void addTwoForTeamA(View v){
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public void addOneForTeamA(View v){
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    /*
     * Functions for team B
     * */
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View v){
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void addTwoForTeamB(View v){
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void addOneForTeamB(View v){
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    /*
     * This is the Reset Button function
     * */
    public void resetButton(View v){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}