package com.example.englishforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    NumberPicker pick_ages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeLang = (Button) findViewById(R.id.button_changeLang);
        changeLang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        R.string.toastMessage_language,
                        Toast.LENGTH_LONG).show();
            }
        });
        pick_ages = (NumberPicker) findViewById(R.id.numberPicker);
        String[] agesArray = {"6", "7", "8", "9", "10", "11", "12"};
        pick_ages.setDisplayedValues(agesArray);
        pick_ages.setMinValue(0);
        pick_ages.setMaxValue(agesArray.length - 1);
    }

    public void start(View v) {
        Button enter_button = (Button) findViewById(R.id.button_enter);
        EditText username_entered = findViewById(R.id.editTextTextPersonName);
        String username = username_entered.getText().toString();
        Intent goSecond = new Intent();
        goSecond.setClass(this, SecondActivity.class);
        goSecond.putExtra("username", username);
        startActivity(goSecond);
    }

}