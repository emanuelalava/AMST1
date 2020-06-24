package com.example.amst1;

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

    public void toGrafico(View view){
        Intent i = new Intent(MainActivity.this,GraficoActivity.class);
        startActivity(i);
    }

    public void toVideoView(View view){
        Intent i = new Intent(MainActivity.this,VideoViewActivity.class);
        startActivity(i);
    }

    public void toCalendar(View view){
        Intent i = new Intent(MainActivity.this,Calendarview.class);
        startActivity(i);
    }

//    public void toMaps(View view){
//        Intent i = new Intent(MainActivity.this,XXXXXXXX.class);
//        startActivity(i);
//    }

//    public void toBotonFlotante(View view){
//        Intent i = new Intent(MainActivity.this,XXXXXXX.class);
//        startActivity(i);
//    }
}
