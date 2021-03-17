package com.example.scorekeeperflagfootball;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

    /**
     * Add two to Red team score and display it.
     */
    public void teamRedAddTwo(View view) {
        scoreRedTeam = scoreRedTeam + 2;
        displayRedScore(scoreRedTeam);
    }

    /**
     * Add One to Red team score and display it.
     */
    public void teamRedAddOne(View view) {
        scoreRedTeam = scoreRedTeam + 1;
        displayRedScore(scoreRedTeam);
    }

    /**
     * Add three to Red team score as Field Goal and display it.
     */
    public void teamRedAddFg(View view) {
        scoreRedTeam = scoreRedTeam + 3;
        displayRedScore(scoreRedTeam);
    }

    /**
     * Add two to Red team score as Safety Goal and display it.
     */
    public void teamRedAddSg(View view) {
        scoreRedTeam = scoreRedTeam + 2;
        displayRedScore(scoreRedTeam);
    }

    //A display method for Red team
    public void displayRedScore(int score) {
        TextView scoreView = findViewById(R.id.red_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add one to Yellow team score and display it.
     */
    public void teamYellowAddOne(View view) {
        scoreYellowTeam = scoreYellowTeam + 1;
        displayYellowScore(scoreYellowTeam);
    }

    /**
     * Add 2 to Yellow team score and display it.
     */
    public void teamYellowAddTwo(View view) {
        scoreYellowTeam = scoreYellowTeam + 2;
        displayYellowScore(scoreYellowTeam);
    }

    /**
     * Add three to Yellow team score and display it.
     */
    public void teamYellowAddFg(View view) {
        scoreYellowTeam = scoreYellowTeam + 3;
        displayYellowScore(scoreYellowTeam);
    }

    /**
     * Add two to Yellow team score as safety goal
     */
    public void teamYellowAddSg(View view) {
        scoreYellowTeam = scoreYellowTeam + 2;
        displayYellowScore(scoreYellowTeam);
    }

    /**
     * Add six to Yellow team score and display it.
     */
    public void teamYellowAddSix(View view) {
        scoreYellowTeam = scoreYellowTeam + 6;
        displayYellowScore(scoreYellowTeam);
    }

    /**
     * Reset all score to Zero and display it.
     */
    public void ResetAllScore(View view) {
        scoreRedTeam = 0;
        scoreYellowTeam = 0;
        displayYellowScore(scoreYellowTeam);
        displayRedScore(scoreRedTeam);
    }

    /**
     * Display score for Yellow team and display it.
     */
    //A display score for Yellow team
    public void displayYellowScore(int score) {
        TextView scoreView = findViewById(R.id.yellow_score);
        scoreView.setText(String.valueOf(score));
    }
}