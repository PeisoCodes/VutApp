package com.peisocodes.vutapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    String[] menuText = {
            "Campus News",
            "Academic Calender",
            "Events",
            "Bus Hours",
            "Campus Map",
            "Social Media",
            "Academic Sites",
            "Contact Us",
            "About Us"

    };
    int[] imageId = {
            R.drawable.news,
            R.drawable.acad_cal,
            R.drawable.events,
            R.drawable.bus,
            R.drawable.map,
            R.drawable.social,
            R.drawable.learning,
            R.drawable.contact,
            R.drawable.suggestion

    };
    private final Class [] activities =
            {
                    news.class,
                    calender.class,
                    events.class,
                    bus.class,
                    maps.class,
                    social.class,
                    learning.class,
                    contacts.class,
                    aboutUs.class
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        customGrid adapter = new customGrid(MainActivity.this, menuText,imageId);

        GridView grid;
        grid =(GridView) findViewById(R.id.grid);
        grid.setAdapter((ListAdapter) adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                intent = new Intent(view.getContext(),activities[position]);
                view.getContext().startActivity(intent);
            }
        });

    }

}
