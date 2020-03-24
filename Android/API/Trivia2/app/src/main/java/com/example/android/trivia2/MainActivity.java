package com.example.android.trivia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.android.trivia2.data.AnswerListAsyncResponse;
import com.example.android.trivia2.data.QuestionBank;
import com.example.android.trivia2.model.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private TextView textElement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textElement = findViewById(R.id.text);

        ArrayList<User> users = new QuestionBank().getQuestions(new AnswerListAsyncResponse() {
            @Override
            public void processFinished(ArrayList<User> userArrayList) {
                Log.d("INSIDE", "processFinished " + userArrayList);
                textElement.setText(userArrayList.get(0).getName());

            }
        });

    }

    public void click(View view) {
        ArrayList<User> users = new QuestionBank().getQuestions(new AnswerListAsyncResponse() {
            @Override
            public void processFinished(ArrayList<User> userArrayList) {
                Log.d("INSIDE", "processFinished " + userArrayList);
                textElement.setText(userArrayList.get(0).getName());

            }
        });
    }
}