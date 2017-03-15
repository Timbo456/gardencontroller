package net.androidbootcamp.gardencontroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {
    String[] Metrics = { "Temperature", "Humidity", "CO2", "pH", "Run Time" };
    ImageView = pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        GridView grid = (GridView)findViewById(R.id.gridview);
        //left off here. Using MainActivity.java in Endagered Species app to model. 

    }
}
