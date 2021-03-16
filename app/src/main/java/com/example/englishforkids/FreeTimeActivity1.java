package com.example.englishforkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FreeTimeActivity1 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freetime1);
        ImageView image = (ImageView) findViewById(R.id.imageView_readabook);
        image.setImageResource(R.drawable.readabook);
    }

    public void check(View v) {
        EditText input = (EditText) findViewById(R.id.editText_freetime);
        String currGuess = input.getText().toString();
        if(currGuess.equals("read a book") || currGuess.equals("Read a book")) {
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
        String answer = "The correct answer - read a book";
        Toast.makeText(getApplicationContext(),
                answer,
                Toast.LENGTH_LONG).show();
    }
}
