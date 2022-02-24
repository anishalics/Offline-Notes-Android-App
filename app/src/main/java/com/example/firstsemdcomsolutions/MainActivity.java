package com.example.firstsemdcomsolutions;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ListView listView;
    String[] arr = {"Physics","Chemistry","Mathematics","Computer Fundamentals","C Programming","English","Nepali","Engineering Drawing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        listView = findViewById(R.id.listView);
        mediaPlayer = MediaPlayer.create(this,R.raw.loading);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(ad);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "You clicked on item "+(position+1), Toast.LENGTH_SHORT).show();
                //Using intent to communicate with another activity
                if (position==0){
                    mediaPlayer.start();
                    Intent intent1 = new Intent(getApplicationContext(),physicsentry.class);
                    startActivity(intent1);
                }
                else if(position==1){
                    mediaPlayer.start();
                    Intent intent2 = new Intent(getApplicationContext(),chemistry.class);
                    startActivity(intent2);
                }
                else if (position==2){
                    mediaPlayer.start();
                    Intent intent3 = new Intent(getApplicationContext(),mathematics.class);
                    startActivity(intent3);
                }
                else if (position==3){
                    mediaPlayer.start();
                    Intent intent4 = new Intent(getApplicationContext(),computerfundamentals.class);
                    startActivity(intent4);
                }
                else if (position==4){
                    mediaPlayer.start();
                    Intent intent5 = new Intent(getApplicationContext(),CProgramming.class);
                    startActivity(intent5);
                }
                else if (position==5){
                    mediaPlayer.start();
                    Intent intent6 = new Intent(getApplicationContext(),english.class);
                    startActivity(intent6);
                }
                else if (position==6){
                    mediaPlayer.start();
                    Intent intent7 = new Intent(getApplicationContext(),nepali.class);
                    startActivity(intent7);
                }
                else if (position==7){
                    mediaPlayer.start();
                    Intent intent8 = new Intent(getApplicationContext(),engineeringdrawing.class);
                    startActivity(intent8);
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("Info");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getTitle().equals("Info")){
            mediaPlayer.start();
            Intent intent9 = new Intent(getApplicationContext(),info.class);
            startActivity(intent9);
        }
        return super.onOptionsItemSelected(item);
    }
}