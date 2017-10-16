package com.example.android.soccerscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // Global Game Data Team B
    int goalTeamB = 0;
    int redCardTeamB = 0;
    int yellowCardTeamB = 0;
    int substTeamB = 0;
    // Global Game Data Team A
    private int goalTeamA = 0;
    private int redCardTeamA = 0;
    private int yellowCardTeamA = 0;
    private int substTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Methods for Team A

    public void addGoalTeamA(View view) {
        goalTeamA = goalTeamA + 1;
        displayGoalForTeamA(goalTeamA);
    }

    public void addRedCardTeamA(View view) {
        redCardTeamA = redCardTeamA + 1;
        displayRedCardA(redCardTeamA);
    }

    public void addYellowCardTeamA(View view) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowCardA(yellowCardTeamA);
    }

    public void addSubstTeamA(View view) {
        substTeamA = substTeamA + 1;
        displaySubsA(substTeamA);
    }

    public void displayGoalForTeamA(int goal) {
        TextView scoreView = (TextView) findViewById(R.id.text_goalTeamA);
        scoreView.setText(String.valueOf(goal));
    }

    public void displayYellowCardA(int yellow) {
        TextView yellowView = (TextView) findViewById(R.id.yellowCardA);
        yellowView.setText(String.valueOf(yellow));
    }

    public void displayRedCardA(int red) {
        TextView redView = (TextView) findViewById(R.id.redCardA);
        redView.setText(String.valueOf(red));
    }

    public void displaySubsA(int subs) {
        TextView subsView = (TextView) findViewById(R.id.subsA);
        subsView.setText(String.valueOf(subs));
    }

    // Methods for Team B

    public void addGoalTeamB(View view) {
        goalTeamB = goalTeamB + 1;
        displayGoalForTeamB(goalTeamB);
    }

    public void addRedCardTeamB(View view) {
        redCardTeamB = redCardTeamB + 1;
        displayRedcardB(redCardTeamB);
    }

    public void addYellowCardTeamB(View view) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowcardB(yellowCardTeamB);
    }

    public void addSubstTeamB(View view) {
        substTeamB = substTeamB + 1;
        displaySubsB(substTeamB);
    }


    public void displayGoalForTeamB(int goal) {
        TextView scoreView = (TextView) findViewById(R.id.text_goalTeamB);
        scoreView.setText(String.valueOf(goal));
    }

    public void displayYellowcardB(int yellow) {
        TextView yellowView = (TextView) findViewById(R.id.yellowCardB);
        yellowView.setText(String.valueOf(yellow));
    }

    public void displayRedcardB(int red) {
        TextView redView = (TextView) findViewById(R.id.redCardB);
        redView.setText(String.valueOf(red));
    }

    public void displaySubsB(int subs) {
        TextView subsView = (TextView) findViewById(R.id.subsB);
        subsView.setText(String.valueOf(subs));
    }

    public void resetAllData(View view) {

        // Reset Game Data Team A
        goalTeamA = 0;
        redCardTeamA = 0;
        yellowCardTeamA = 0;
        substTeamA = 0;
        displayGoalForTeamA(goalTeamA);
        displayYellowCardA(yellowCardTeamA);
        displayRedCardA(redCardTeamA);
        displaySubsA(substTeamA);

        // Reset Game Data Team B
        goalTeamB = 0;
        redCardTeamB = 0;
        yellowCardTeamB = 0;
        substTeamB = 0;
        displayGoalForTeamB(goalTeamB);
        displayYellowcardB(yellowCardTeamB);
        displayRedcardB(redCardTeamB);
        displaySubsB(substTeamB);
    }

}
