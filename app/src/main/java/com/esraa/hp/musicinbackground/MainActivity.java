package com.esraa.hp.musicinbackground;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button start,stop;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.start);
        stop=findViewById(R.id.stop);

        intent=new Intent(MainActivity.this,MyService.class);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startService(intent);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);
            }
        });


    }
}
