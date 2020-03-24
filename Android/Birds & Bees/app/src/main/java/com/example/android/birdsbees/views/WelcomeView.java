package com.example.android.birdsbees.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android.birdsbees.R;

public class WelcomeView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_view);
    }

    public void openRegistration(View view) {
        Intent intent = new Intent(this, RegisterView.class);
        startActivity(intent);
    }

    public void openLogin(View view) {
        Intent intent = new Intent(this, LoginView.class);
        startActivity(intent);
    }
}
