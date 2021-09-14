package com.example.a_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnNext = findViewById(R.id.button_next);
        btnNext.setOnClickListener(v -> {
            btnNextClick(btnNext);
        });

    }

    public void btnNextClick(View view){
        Intent intent;
        intent = new Intent(this, TextActivity.class);
        startActivity(intent);
    }
}