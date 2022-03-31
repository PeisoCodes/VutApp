package com.peisocodes.vutapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class learning extends AppCompatActivity {

    String[] learning_itemname= {
            "ITS(Enabler)",
            "VUT Research",
            "Moodle",
            "Netacad",
            "Blackboard"
    };

    final String[] UrlLinks = {
            "https://ienablerprod.vut.ac.za/pls/prodi41/w99pkg.mi_login",
            "https://www.vut-research.ac.za/",
            "https://moodlevut.vut.ac.za/",
            "https://www.netacad.com/",
            "https://vut.blackboard.com/"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);


        final learningList adapter = new learningList(this,learning_itemname);
        final ListView learning_list = (ListView) findViewById(R.id.learning_list);
        learning_list.setAdapter(adapter);

        learning_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(UrlLinks[position]));
                startActivity(intent);
            }
        });
    }
}