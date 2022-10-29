package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

    }

    public void weightpage(View view) {
        Intent intent= new Intent(this, weight.class);
        startActivity(intent);
    }

    public void temperaturepage(View view) {
        Intent intent= new Intent(this, temperature.class);
        startActivity(intent);
    }

    public void lengthpage(View view) {
        Intent intent= new Intent(this, length.class);
        startActivity(intent);
    }

    public void timepage(View view) {
        Intent intent= new Intent(this, time.class);
        startActivity(intent);
    }
}