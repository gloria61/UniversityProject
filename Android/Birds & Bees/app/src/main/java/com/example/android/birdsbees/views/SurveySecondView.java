package com.example.android.birdsbees.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android.birdsbees.R;

public class SurveySecondView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_second_view);
    }

    public void openThirdSurvey(View view) {
        Intent intent = new Intent(this, SurveyThirdView.class);
        startActivity(intent);
    }
}
