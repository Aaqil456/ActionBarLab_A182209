package com.example.labtoolbar_a182209;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.menu_notification:
                Toast.makeText(MainActivity.this, "notification", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_settings:
                Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_sync:
                Toast.makeText(MainActivity.this, "sync", Toast.LENGTH_SHORT).show();
                break;

                    
        }
        return super.onOptionsItemSelected(item);
    }
}