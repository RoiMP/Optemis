package com.opopona.optemis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void camera(View view){
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }

    public void search(View view){
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }


    public void maps(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }


    public void ajustes(View view){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void fav(View view){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);

    }

}
