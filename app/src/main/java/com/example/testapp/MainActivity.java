package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView someText = (TextView) findViewById(R.id.text);
        someText.setText(someText.getText() +
                "\nVERSION_CODE " + String.valueOf(BuildConfig.VERSION_CODE) +
                "\nVERSION_NAME " + String.valueOf(BuildConfig.VERSION_NAME));
    }
}