package com.example.android.volleynetworking;

import com.example.android.volleynetworking.UserModel;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void processFinished(ArrayList<UserModel> userArrayList);
}
