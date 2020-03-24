package com.example.android.birdsbees.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android.birdsbees.R;

public class RegisterView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_view);
    }

    public void openFirstSurvey(View view) {
        Intent intent = new Intent(this, SurveyFirstView.class);
        startActivity(intent);
    }
}
