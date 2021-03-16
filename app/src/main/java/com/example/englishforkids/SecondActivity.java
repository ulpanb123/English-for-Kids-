package com.example.englishforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView text = findViewById(R.id.chooseTest);
        Intent caller = getIntent();
        String username = caller.getStringExtra("username");
        text.setText(getString(R.string.chooseTest) + username + ":");

        ListView listViewTests = (ListView) findViewById(R.id.listView);
        ArrayAdapter<CharSequence> adapterTests = ArrayAdapter.createFromResource(this,
                R.array.testsArray,
                android.R.layout.simple_list_item_1);
        listViewTests.setAdapter(adapterTests);

        listViewTests.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        Intent goActions = new Intent(SecondActivity.this, ActionsActivity1.class);
                        startActivity(goActions);
                        break;
                    case 1:
                        Intent goRoutines = new Intent(SecondActivity.this, RoutinesActivity1.class);
                        startActivity(goRoutines);
                        break;
                    case 2:
                        Intent goClothes = new Intent(SecondActivity.this, ClothesActivity1.class);
                        startActivity(goClothes);
                        break;
                    case 3:
                        Intent goColors = new Intent(SecondActivity.this, ColorsActivity1.class);
                        startActivity(goColors);
                        break;
                    case 4:
                        Intent goNumbers = new Intent(SecondActivity.this, NumbersActivity1.class);
                        startActivity(goNumbers);
                        break;
                    case 5:
                        Intent goFamily = new Intent(SecondActivity.this, FamilyActivity1.class);
                        startActivity(goFamily);
                        break;
                    case 6:
                        Intent goFreeTime = new Intent(SecondActivity.this, FreeTimeActivity1.class);
                        startActivity(goFreeTime);
                        break;
                    case 7:
                        Intent goFeelings = new Intent(SecondActivity.this, FeelingsActivity1.class);
                        startActivity(goFeelings);
                        break;
                }
            }
        });
    }


    public void share(View v) {
        String message = "Hey, I've found a cool app to learn english! Contact me if you want to try it too!";
        Uri destination = Uri.parse("smsto: 5556");
        Intent sms = new Intent(Intent.ACTION_SENDTO, destination);
        sms.putExtra("sms_body", message);
        startActivity(sms);
    }
}
