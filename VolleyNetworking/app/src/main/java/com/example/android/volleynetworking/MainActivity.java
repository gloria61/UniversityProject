package com.example.android.volleynetworking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.volleynetworking.R;
import com.example.android.volleynetworking.UserModel;
import com.example.android.volleynetworking.AnswerListAsyncResponse;
import com.example.android.volleynetworking.UserController;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText Uname;
    private EditText Pword;
    private Button Log;
    private ArrayList<UserModel> users;
    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uname = (EditText)findViewById(R.id.Username);
        Pword = (EditText)findViewById(R.id.Password);
        Log = (Button) findViewById(R.id.Login);
        text = findViewById(R.id.textView);

        Log.setOnClickListener(this);
        users = new UserController().getUsers(new AnswerListAsyncResponse() {
            @Override
            public void processFinished(ArrayList<UserModel> userArrayList) {
                android.util.Log.d("INSIDE", "processFinished " + userArrayList);
            }
        });

        String RegexUser = "^[a-zA-Z0-9._-]{3,}$"; //Username must have atleast 3 characters no space, characters including A-Z 1-9
        String RegexPassword = "^[a?=.*[a-z]{5,}$"; //Password must have atleast 5 Characters
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

        String inputName = String.valueOf(Uname.getText());
        String inputPassword = String.valueOf(Pword.getText());

        boolean flag = false;
        for(int i = 0; i < users.size(); i++){

            if(users.get(i).getName().equals(inputName)){
                flag = true;
                //found a user with the same name, let's check password now
                if(users.get(i).getPassword().equals(inputPassword)){
                    openHome();
                }

            }
        }
        if(flag){
            text.setText("incorrect password");
        }
        else{
            text.setText("incorrect name");
        }


    }

    public void openHome(){

        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}
