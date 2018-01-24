package org.ryanstrong.android.basketshot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score;
    int scoreR;
    int free;
    int threes;
    int field;
    int block;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForUs(int score){
        TextView scoreView = (TextView) findViewById(R.id.our_score);
        scoreView.setText(String.valueOf(score));
    }
    public void threePoints(View view){
        score += 3;
        displayForUs(score);
    }
    public void twoPoints(View view){
        score += 2 ;
        displayForUs(score);
    }
    public void point(View view){
        score += 1 ;
        displayForUs(score);
    }
    public void displayForThem(int scoreR){
        TextView scoreView = (TextView) findViewById(R.id.their_score);
        scoreView.setText(String.valueOf(scoreR));
    }
    public void threePointsR(View view){
        scoreR += 3;
        displayForThem(scoreR);
    }
    public void twoPointsR(View view){
        scoreR += 2 ;
        displayForThem(scoreR);
    }
    public void pointR(View view){
        scoreR += 1 ;
        displayForThem(scoreR);
    }
    public void displayThree(int score){
        TextView scoreView = (TextView) findViewById(R.id.three_shot);
        scoreView.setText(String.valueOf(score));
    }
    public void threeShot(View view){
        threes ++;
        displayThree(threes);
    }
    public void displayTwo(int field){
        TextView freeView = (TextView) findViewById(R.id.two_shot);
        freeView.setText(String.valueOf(field));
    }
    public void twoShot(View view){
        field ++ ;
        displayTwo(field);
    }
    public void displayFree(int free){
        TextView freeView = (TextView) findViewById(R.id.free_shot);
        freeView.setText(String.valueOf(free));
    }
    public void freeShot(View view){
        free ++ ;
        displayFree(free);
    }
    public void reset(View view){
        score = 0;
        scoreR = 0;
        free = 0;
        field = 0;
        threes = 0;
        displayFree(free);
        displayTwo(field);
        displayThree(threes);
        displayForUs(score);
        displayForThem(scoreR);
    }
}
