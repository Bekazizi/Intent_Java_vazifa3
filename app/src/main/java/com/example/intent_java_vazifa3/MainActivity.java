package com.example.intent_java_vazifa3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.intent_java_vazifa3.user.User;

public class MainActivity extends AppCompatActivity {
    EditText et_user_id;
    EditText et_user_pw;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        Button b_user = findViewById(R.id.b_user);
        et_user_id = findViewById(R.id.et_user_id);
        et_user_pw = findViewById(R.id.et_user_pw);
        b_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity();
            }
        });
    }

    void openDetailActivity(){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("Userid", et_user_id.getText().toString());
        intent.putExtra("Userpw", et_user_pw.getText().toString());
        startActivity(intent);
    }

}