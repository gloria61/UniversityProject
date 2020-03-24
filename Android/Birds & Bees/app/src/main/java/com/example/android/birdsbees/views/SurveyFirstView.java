package com.example.android.birdsbees.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android.birdsbees.R;

public class SurveyFirstView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_first_view);
    }

    public void openSecondSurvey(View view) {
        Intent intent = new Intent(this, SurveySecondView.class);
        startActivity(intent);
    }

}
