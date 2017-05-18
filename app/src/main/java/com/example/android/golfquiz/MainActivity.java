package com.example.android.golfquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {
        int numberCorrect = 0;
        boolean isJack = ((RadioButton) findViewById(R.id.jack_nicklaus)).isChecked();
        boolean isAlbatross = ((RadioButton) findViewById(R.id.albatross)).isChecked();
        boolean isFourteen = ((RadioButton) findViewById(R.id.fourteen)).isChecked();
        boolean isScotland = ((RadioButton) findViewById(R.id.scotland)).isChecked();
        boolean isMasters = ((RadioButton) findViewById(R.id.masters)).isChecked();

        if (isJack) {
            numberCorrect += 1;
        }
        if (isAlbatross) {
            numberCorrect += 1;
        }
        if (isFourteen) {
            numberCorrect += 1;
        }
        if (isScotland) {
            numberCorrect += 1;
        }
        if (isMasters) {
            numberCorrect += 1;
        }

        displayScore(numberCorrect);
    }

    public void displayScore(int numberCorrect) {
        Toast.makeText(this, "Score: " + numberCorrect + "/5", Toast.LENGTH_LONG).show();
    }

}
