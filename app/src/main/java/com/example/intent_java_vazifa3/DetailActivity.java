package com.example.intent_java_vazifa3;


import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class DetailActivity extends AppCompatActivity {
    public final String TAG =  DetailActivity.class.toString();
    TextView tv_user_home_id;
    TextView tv_user_home_pw;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
    }
    void initViews(){
        tv_user_home_id = findViewById(R.id.tv_user_home_id);
        tv_user_home_pw = findViewById(R.id.tv_user_home_pw);

        String Userid = getIntent().getStringExtra("Userid");
        Log.d(TAG, Userid);

        String Userpw = getIntent().getStringExtra("Userpw");
        Log.d(TAG, Userpw);

        tv_user_home_id.setText(Userid);
        tv_user_home_pw.setText(Userpw);
    }


}
