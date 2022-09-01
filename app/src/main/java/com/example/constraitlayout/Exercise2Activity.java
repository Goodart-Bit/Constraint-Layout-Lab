package com.example.constraitlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Exercise2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);
    }

    public void changeExercise(View view){
        Intent ex3 = new Intent(this, Exercise3Activity.class);
        startActivity(ex3);
    }
}