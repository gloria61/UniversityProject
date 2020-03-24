package com.example.android.birdsbees.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android.birdsbees.R;

public class HomeView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_view);
    }

    public void openSettings(View view) {
        Intent intent = new Intent(this, SettingsView.class);
        startActivity(intent);
    }

    public void openChats(View view) {
        Intent intent = new Intent(this, AllChatsView.class);
        startActivity(intent);
    }
}
