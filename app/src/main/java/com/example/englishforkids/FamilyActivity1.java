package com.example.englishforkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FamilyActivity1 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family1);
        ImageView image = (ImageView) findViewById(R.id.imageView_grandmother);
        image.setImageResource(R.drawable.grandmother);
    }

    public void check(View v) {
        EditText input = (EditText) findViewById(R.id.editText_family);
        String currGuess = input.getText().toString();
        if(currGuess.equals("grandmother") || currGuess.equals("Grandmother")) {
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
        String answer = "The correct answer - grandmother";
        Toast.makeText(getApplicationContext(),
                answer,
                Toast.LENGTH_LONG).show();
    }
}
