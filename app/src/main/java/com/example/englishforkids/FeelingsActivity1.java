package com.example.englishforkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FeelingsActivity1 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feelings1);
        ImageView image = (ImageView) findViewById(R.id.imageView_hungry);
        image.setImageResource(R.drawable.hungry);
    }

    public void check(View v) {
        EditText input = (EditText) findViewById(R.id.editText_feeling);
        String currGuess = input.getText().toString();
        if(currGuess.equals("hungry") || currGuess.equals("Hungry")) {
            MediaPlayer correctSound = MediaPlayer.create(this, R.raw.correct);
            correctSound.start();
            String message = "Congratulations! You guessed right!";
            Toast.makeText(getApplicationContext(),
                    message,
                    Toast.LENGTH_LONG).show();
        } else {
            MediaPlayer wrongSound = MediaPlayer.create(this, R.raw.wrong);
            wrongSound.start();
            String message = "You are wrong! Please try again";
            Toast.makeText(getApplicationContext(),
                    message,
                    Toast.LENGTH_LONG).show();
        }
    }

    public void showAnswer(View v) {
        String answer = "The correct answer - hungry";
        Toast.makeText(getApplicationContext(),
                answer,
                Toast.LENGTH_LONG).show();
    }
}