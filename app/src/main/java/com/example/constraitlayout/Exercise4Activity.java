package com.example.constraitlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Exercise4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4);
    }

    public void changeExercise(View view){
        Intent ex1 = new Intent(this, Exercise1Activity.class);
        startActivity(ex1);
    }
}