package com.example.labtoolbar_a182209;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        //add back button on toolbar

//        ActionBar myActionBar=getSupportActionBar();
//        myActionBar.setDisplayHomeAsUpEnabled(true);
    }
}