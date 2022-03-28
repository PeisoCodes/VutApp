package com.peisocodes.vutapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        Button busButton1 = (Button)findViewById(R.id.bus_button1);
        busButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Please be atleast 5 min before depature", Toast.LENGTH_LONG).show();

                Intent intent;
                intent = new Intent(bus.this,parkVillage.class);
                startActivity(intent);
            }
        });


        Button busButton2 = (Button)findViewById(R.id.bus_button2);
        busButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Please be atleast 5 min before depature", Toast.LENGTH_LONG).show();

                Intent intent;
                intent = new Intent(bus.this,toughBar.class);
                startActivity(intent);
            }
        });

        Button busButton3 = (Button)findViewById(R.id.bus_button3);
        busButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Please be atleast 5 min before depature", Toast.LENGTH_LONG).show();

                Intent intent;
                intent = new Intent(bus.this,emberfield.class);
                startActivity(intent);
            }
        });

        Button busButton4 = (Button)findViewById(R.id.bus_button4);
        busButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Please be atleast 5 min before depature", Toast.LENGTH_LONG).show();

                Intent intent;
                intent = new Intent(bus.this,marchelCourt.class);
                startActivity(intent);
            }
        });

        Button busButton5 = (Button)findViewById(R.id.bus_button5);
        busButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Please be atleast 5 min before depature", Toast.LENGTH_LONG).show();

                Intent intent;
                intent = new Intent(bus.this,granadaCourt.class);
                startActivity(intent);
            }
        });

    }


}
