package com.example.amst1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Solicitar permisos de ubicacion

        int permissionCheck= ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        if (permissionCheck== PackageManager.PERMISSION_DENIED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.ACCESS_FINE_LOCATION)){

            }else{
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);
            }
        }
    }

    public void toGrafico(View view){
        Intent i = new Intent(MainActivity.this,GraficoActivity.class);
        startActivity(i);
    }

    public void toVideoView(View view){
        Intent i = new Intent(MainActivity.this,VideoViewActivity.class);
        startActivity(i);
    }

//    public void toCalendar(View view){
//        Intent i = new Intent(MainActivity.this,XXXXXX.class);
//        startActivity(i);
//    }

    public void toMaps(View view){
        Intent i = new Intent(MainActivity.this,MapaActivity.class);
        startActivity(i);
    }

//    public void toBotonFlotante(View view){
//        Intent i = new Intent(MainActivity.this,XXXXXXX.class);
//        startActivity(i);
//    }
}
