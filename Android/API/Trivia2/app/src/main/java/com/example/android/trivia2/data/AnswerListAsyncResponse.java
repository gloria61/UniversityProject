package com.example.android.trivia2.data;

import com.example.android.trivia2.model.User;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void processFinished(ArrayList<User> userArrayList);
}
