package com.example.android.volleynetworking;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.android.volleynetworking.UserModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class UserController {

    ArrayList<UserModel> userArrayList = new ArrayList<>();
    private String url = "http://172.31.82.138:8080/users";



    public ArrayList<UserModel> getUsers(final AnswerListAsyncResponse callBack){

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET,
                url,
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


                                UserModel user = new UserModel(obj.getLong("idStudent"), obj.getString("name"),
                                        obj.getString("surname"), obj.getInt("age"), obj.getString("email"),
                                        obj.getInt("gender"), obj.getInt("sexuality"),
                                        obj.getInt("preference"), obj.getString("department"), obj.getInt("phoneNumber"),
                                        obj.getDouble("points"), obj.getString("password"));

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
