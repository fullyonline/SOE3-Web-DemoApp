package com.example.demoapp;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        var sendButton = findViewById(R.id.send);
        sendButton.setOnClickListener(
                view -> Log.i("MainActivity", "Button Send gedrückt"));
    }
}