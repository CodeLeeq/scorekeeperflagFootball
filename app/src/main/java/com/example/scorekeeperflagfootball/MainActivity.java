package com.example.scorekeeperflagfootball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreRedTeam = 0;
    int scoreYellowTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//Red buttons methods


    //Add six to the initial score and display it.
    public void teamRedAddSix(View view) {
        scoreRedTeam = scoreRedTeam + 6;
        displayRedScore(scoreRedTeam);
    }

    public void teamRedAddTwo(View view) {
        scoreRedTeam = scoreRedTeam + 2;
        displayRedScore(scoreRedTeam);
    }

    public void teamRedAddOne(View view) {
        scoreRedTeam = scoreRedTeam + 1;
        displayRedScore(scoreRedTeam);
    }

    public void teamRedAddFg(View view) {
        scoreRedTeam = scoreRedTeam + 3;
        displayRedScore(scoreRedTeam);
    }

    public void teamRedAddSg(View view) {
        scoreRedTeam = scoreRedTeam + 2;
        displayRedScore(scoreRedTeam);

    }

    //A display score for Red team
    public void displayRedScore(int score) {
        TextView scoreView = findViewById(R.id.red_score);
        scoreView.setText(String.valueOf(score));
    }

    public void teamYellowAddOne(View view) {
    }

    public void teamYellowAddTwo(View view) {
    }

    public void teamYellowAddFg(View view) {
    }

    public void teamYellowAddSg(View view) {
    }

    public void teamYellowAddSix(View view) {
    }

    public void ResetAllScore(View view) {
    }
}