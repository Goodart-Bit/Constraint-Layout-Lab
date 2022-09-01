package com.example.constraitlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Exercise3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);
    }

    public void changeExercise(View view){
        Intent ex4 = new Intent(this, Exercise4Activity.class);
        startActivity(ex4);
    }
}