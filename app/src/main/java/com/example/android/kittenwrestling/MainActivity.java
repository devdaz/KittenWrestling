package com.example.android.kittenwrestling;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.kittenwrestling.R;


public class MainActivity extends AppCompatActivity {

    int ScorePup = 0;
    int ScoreKit = 0;

    /**
     * Increase the score for Pup by 1 point.
     */
    public void addOneForPup(View v) {
        ScorePup = ScorePup + 1;
        displayForTeamA(ScorePup);
    }

    /**
     * Increase the score for Pup by 2 points.
     */
    public void addTwoForPup(View v) {
        ScorePup = ScorePup + 2;
        displayForTeamA(ScorePup);
    }


    /**
     * Increase the score for Kit by 1 point.
     */
    public void addOneForKit(View v) {
        ScoreKit = ScoreKit + 1;
        displayForTeamB(ScoreKit);
    }

    /**
     * Increase the score for Kit by 2 points.
     */
    public void addTwoForKit(View v) {
        ScoreKit = ScoreKit + 2;
        displayForTeamB(ScoreKit);
    }


    public void resetScore(View v){
        ScorePup = 0;
        ScoreKit = 0;
        displayForTeamA(ScorePup);
        displayForTeamB(ScoreKit);
    }


    /**
     * Displays the given score for Team A or Team B.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}