package com.example.android.birdsbees.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android.birdsbees.R;

public class SurveyThirdView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_third_view);
    }

    public void openFourthSurvey(View view) {
            Intent intent = new Intent(this, SurveyFourthView.class);
            startActivity(intent);
    }
}
