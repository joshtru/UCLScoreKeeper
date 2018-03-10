package com.example.android.uclscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int HomeGoal = 0;
    int HomeFoul = 0;
    int HomeShot = 0;

    int AwayGoal = 0;
    int AwayFoul = 0;
    int AwayShot = 0;

    public void HomeGoalButton(View view){
        HomeGoal += 1;
        displayHomeGoal(HomeGoal);
    }
    public void HomeFoulButton(View view){
        HomeFoul += 1;
        displayHomeFoul(HomeFoul);
    }
    public void HomeShotButton(View view){
        HomeShot += 1;
        displayHomeShot(HomeShot);
    }


    public void AwayGoalButton(View view){
        AwayGoal += 1;
        displayAwayGoal(AwayGoal);
    }
    public void AwayFoulButton(View view){
        AwayFoul += 1;
        displayAwayFoul(AwayFoul);
    }
    public void AwayShotButton(View view){
        AwayShot += 1;
        displayAwayShot(AwayShot);
    }

    public void Reset(View view){
        HomeGoal = 0;
        HomeFoul = 0;
        HomeShot = 0;

        AwayGoal = 0;
        AwayFoul = 0;
        AwayShot = 0;
        displayHomeGoal(HomeGoal);
        displayHomeFoul(HomeFoul);
        displayHomeShot(HomeShot);

        displayAwayGoal(AwayGoal);
        displayAwayFoul(AwayFoul);
        displayAwayShot(AwayShot);
    }


    public void displayHomeGoal(int score) {
        TextView scoreView = findViewById(R.id.HomeGoalText);
        scoreView.setText(String.valueOf(score));
    }
    public void displayHomeFoul(int score) {
        TextView scoreView = findViewById(R.id.HomeFoulText);
        scoreView.setText(String.valueOf(score));
    }
    public void displayHomeShot(int score) {
        TextView scoreView = findViewById(R.id.HomeShotText);
        scoreView.setText(String.valueOf(score));
    }


    public void displayAwayGoal(int score) {
        TextView scoreView = findViewById(R.id.AwayGoalText);
        scoreView.setText(String.valueOf(score));
    }
    public void displayAwayFoul(int score) {
        TextView scoreView = findViewById(R.id.AwayFoulText);
        scoreView.setText(String.valueOf(score));
    }
    public void displayAwayShot(int score) {
        TextView scoreView = findViewById(R.id.AwayShotText);
        scoreView.setText(String.valueOf(score));
    }
}
