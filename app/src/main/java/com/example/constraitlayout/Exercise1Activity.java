package com.example.constraitlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Exercise1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);
    }

    public void changeExercise(View view){
        Intent ex2 = new Intent(this, Exercise2Activity.class);
        startActivity(ex2);
    }
}