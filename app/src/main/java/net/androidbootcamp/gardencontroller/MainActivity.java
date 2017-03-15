package net.androidbootcamp.gardencontroller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton button1, button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (ImageButton) findViewById(R.id.imageButton);
        button2= (ImageButton) findViewById(R.id.imageButton2);
        button1.setOnClickListener(bflower);
        button2.setOnClickListener(bcontroller);

    }
    Button.OnClickListener bflower= new ImageButton.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, Dashboard.class));
        }
    };
    Button.OnClickListener bcontroller= new ImageButton.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, Controller.class));
        }
    };



}
