package com.example.android.trivia2.data;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.android.trivia2.controller.AppController;
import com.example.android.trivia2.model.Question;
import com.example.android.trivia2.model.User;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class QuestionBank {

    ArrayList<Question> questionArrayList = new ArrayList<>();
    ArrayList<User> userArrayList = new ArrayList<>();
    private String url = "https://raw.githubusercontent.com/curiousily/simple-quiz/master/script/statements-data.json";
    private String url2 = "https://my.api.mockaroo.com/users.json?key=2cf79a80";
    private String url3 = "http://172.31.82.138:8080/users";



    public ArrayList<User> getQuestions(final AnswerListAsyncResponse callBack){

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET,
                url2,
                (JSONArray) null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d("Json Stuff", "onResponse:" +response);
                        JSONObject obj = null;
                        for(int i=0; i<response.length(); i++){
                            try {
                                obj = response.getJSONObject(i);
                                String x = obj.getString("name");
                                Log.d("Json Stuff", "onResponse:" +x);

                                User user = new User(obj.getInt("idStudent"), obj.getString("name"),
                                        obj.getString("surname"), obj.getInt("age"), obj.getString("email"),
                                        obj.getString("gender"), obj.getString("sexuality"),
                                        obj.getString("preference"), obj.getString("department"), obj.getString("phoneNumber"),
                                        obj.getString("points"), obj.getString("password"));

                                Log.d("USER", "onResponse: " + user.toString());
                                userArrayList.add(user);

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                        if(callBack != null) callBack.processFinished(userArrayList);

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        );

        AppController.getInstance().addToRequestQueue(jsonArrayRequest);

        return userArrayList;
    }
}
