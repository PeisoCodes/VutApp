package com.peisocodes.vutapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class bus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        Toast.makeText(getApplicationContext(), "Please be at least 10 Minutes before depature.", Toast.LENGTH_LONG).show();
    }

}
