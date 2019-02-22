package com.example.m2hw_individual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void registerMe(View view){
    Intent startNewActivity = new Intent(this, registerNext.class);
    startActivity(startNewActivity);
    }
}
