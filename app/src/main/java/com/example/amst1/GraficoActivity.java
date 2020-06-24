package com.example.amst1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class GraficoActivity extends AppCompatActivity {
    private LineChart lineChart;
    private LineDataSet lineDataSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafico);
        lineChart = (LineChart) findViewById(R.id.lineChart);
        // Creamos un set de datos aleatorios de prueba
        ArrayList<Entry> lineEntries = new ArrayList<Entry>();
        for (int i = 0; i<11; i++){
            float y = (int) (Math.random() * 4) + 1;
            lineEntries.add(new Entry((float) i,(float)y));
        }
        // Se vinculan los datos al dataset
        lineDataSet = new LineDataSet(lineEntries, "Estadisticas Randoms de AMST");
        // Se vincula el dataset con LineData y estas con el gráfico
        LineData lineData = new LineData();
        lineData.addDataSet(lineDataSet);
        lineChart.setData(lineData);
    }
}
