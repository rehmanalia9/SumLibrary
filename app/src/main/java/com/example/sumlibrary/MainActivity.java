package com.example.sumlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.example.appsumlibrary.Sum;

public class MainActivity extends AppCompatActivity {

    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       result=Sum.ADD(4,5);

        Toast.makeText(this, ""+result, Toast.LENGTH_SHORT).show();

    }
}