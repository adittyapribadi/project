package com.klobot.amindermylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void pindahKeListPria(View v){
        Intent intent = new Intent(MainActivity.this, ListActivity.class);
        startActivity(intent);
    }
    public void pindahKeListWanita(View v){
        Intent intent = new Intent(MainActivity.this, CustomListActivity.class);
        startActivity(intent);
    }
}