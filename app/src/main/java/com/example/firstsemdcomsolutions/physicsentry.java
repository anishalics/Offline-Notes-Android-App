package com.example.firstsemdcomsolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class physicsentry extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physicsentry);
        getSupportActionBar().setTitle("Physics");
        mediaPlayer = MediaPlayer.create(this,R.raw.loading);
    }
    public void o1(View view){
        mediaPlayer.start();
        Intent intent1 = new Intent(getApplicationContext(),physics.class);
        startActivity(intent1);
    }
    public void o2(View view){
        mediaPlayer.start();
        Intent intent2 = new Intent(getApplicationContext(),physics1.class);
        startActivity(intent2);
    }
    public void o3(View view){
        mediaPlayer.start();
        Intent intent3 = new Intent(getApplicationContext(),physics2.class);
        startActivity(intent3);
    }
    public void o4(View view){
        mediaPlayer.start();
        Intent intent4 = new Intent(getApplicationContext(),Physics3.class);
        startActivity(intent4);
    }
}