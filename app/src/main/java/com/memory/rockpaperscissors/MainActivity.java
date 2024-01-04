package com.memory.rockpaperscissors;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView rock, paper, scissors, result, ai;
    TextView myScore, aiScore;
    int score_ai, score_me;

    private Random randomGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissors = findViewById(R.id.scissors);

        myScore = findViewById(R.id.my_score);
        aiScore = findViewById(R.id.ai_score);

        ai = findViewById(R.id.ai);
        result = findViewById(R.id.result);

        ArrayList<Integer> imageViews = new ArrayList<>();

        imageViews.add(R.drawable.paper);
        imageViews.add(R.drawable.rock);
        imageViews.add(R.drawable.scissors);
        imageViews.add(R.drawable.rock);
        imageViews.add(R.drawable.scissors);
        imageViews.add(R.drawable.paper);
        imageViews.add(R.drawable.paper);
        imageViews.add(R.drawable.rock);
        imageViews.add(R.drawable.scissors);


        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomGenerator = new Random();
                int randomIndex = randomGenerator.nextInt(imageViews.size());
                int randomImage = imageViews.get(randomIndex);
                ai.setImageResource(randomImage);
                result.setImageResource(R.drawable.rock);

                if (imageViews.get(randomIndex).equals(R.drawable.rock)) {
                    Toast.makeText(MainActivity.this, "Durrang", Toast.LENGTH_SHORT).show();
                }
                else if (imageViews.get(randomIndex).equals(R.drawable.paper)) {
                    Toast.makeText(MainActivity.this, "Yutqazdingiz", Toast.LENGTH_SHORT).show();
                    score_ai += 1;
                    aiScore.setText(String.valueOf(score_ai));
                }
                else if (imageViews.get(randomIndex).equals(R.drawable.scissors)) {
                    Toast.makeText(MainActivity.this, "Yutdingiz", Toast.LENGTH_SHORT).show();
                    score_me += 1;
                    myScore.setText(String.valueOf(score_me));
                }

            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomGenerator = new Random();
                int randomIndex = randomGenerator.nextInt(imageViews.size());
                int randomImage = imageViews.get(randomIndex);
                ai.setImageResource(randomImage);
                result.setImageResource(R.drawable.paper);

                if (imageViews.get(randomIndex).equals(R.drawable.paper)) {
                    Toast.makeText(MainActivity.this, "Durrang", Toast.LENGTH_SHORT).show();
                }
                else if (imageViews.get(randomIndex).equals(R.drawable.scissors)) {
                    Toast.makeText(MainActivity.this, "Yutqazdingiz", Toast.LENGTH_SHORT).show();
                    score_ai += 1;
                    aiScore.setText(String.valueOf(score_ai));
                }
                else if (imageViews.get(randomIndex).equals(R.drawable.rock)) {
                    Toast.makeText(MainActivity.this, "Yutdingiz", Toast.LENGTH_SHORT).show();
                    score_me += 1;
                    myScore.setText(String.valueOf(score_me));
                }
            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomGenerator = new Random();
                int randomIndex = randomGenerator.nextInt(imageViews.size());
                int randomImage = imageViews.get(randomIndex);
                ai.setImageResource(randomImage);
                result.setImageResource(R.drawable.scissors);

                if (imageViews.get(randomIndex).equals(R.drawable.scissors)) {
                    Toast.makeText(MainActivity.this, "Durrang", Toast.LENGTH_SHORT).show();
                }
                else if (imageViews.get(randomIndex).equals(R.drawable.rock)) {
                    Toast.makeText(MainActivity.this, "Yutqazdingiz", Toast.LENGTH_SHORT).show();
                    score_ai += 1;
                    aiScore.setText(String.valueOf(score_ai));
                }
                else if (imageViews.get(randomIndex).equals(R.drawable.paper)) {
                    Toast.makeText(MainActivity.this, "Yutdingiz", Toast.LENGTH_SHORT).show();
                    score_me += 1;
                    myScore.setText(String.valueOf(score_me));
                }
            }
        });


    }


    }

