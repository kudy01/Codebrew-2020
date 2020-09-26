package com.example2.codebrewtelehealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class doorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door);
    }
    public void work(View view)
    {
        Intent intent=new Intent(this,doctorActivity.class);
        startActivity(intent);
    }
}