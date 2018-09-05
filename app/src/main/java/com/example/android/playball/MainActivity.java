package com.example.android.playball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;
    int inningTotal = 0;
    int outsTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneTeamA(View View){
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void addTwoTeamA(View View){
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }
    public void addThreeTeamA(View View){
        teamAScore = teamAScore +3;
        displayForTeamA(teamAScore);
    }

    public void addFourTeamA(View View){
        teamAScore = teamAScore + 4;
        displayForTeamA(teamAScore);
    }

    public void addOneTeamB(View View){
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    public void addTwoTeamB(View View){
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void addThreeTeamB(View View){
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    public void addFourTeamB(View View){
        teamBScore = teamBScore + 4;
        displayForTeamB(teamBScore);
    }
    public void minus(View View){
        if (inningTotal == 1){
                return;
        }
        inningTotal = inningTotal - 1;
        displayForInning(inningTotal);
    }

    public void plus(View View){
        inningTotal = inningTotal +1;
        displayForInning(inningTotal);
    }

    public void plusOuts(View View){
        if (outsTotal == 3) {
            return;
        }
        outsTotal = outsTotal +1;
        displayOutsTotal(outsTotal);
    }

    public void minusOuts(View View){
        if (outsTotal == 0){
            return;
        }
        outsTotal = outsTotal -1;
        displayOutsTotal(outsTotal);
    }

    public void reset(View View){
        inningTotal = 1;
        teamAScore = 0;
        teamBScore = 0;
        outsTotal = 0;
        displayForInning(inningTotal);
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
        displayOutsTotal(outsTotal);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForInning(int number) {
        TextView inningTotalView = (TextView) findViewById(R.id.inning_total_view);
        inningTotalView.setText(String.valueOf(number));
    }
    public void displayOutsTotal(int number) {
        TextView numberView = (TextView) findViewById(R.id.outs_total);
        numberView.setText(String.valueOf(number));
    }
}
