package com.peisocodes.vutapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class social extends AppCompatActivity {

    String[] itemname = {
            "Facebook",
            "Twitter",
            "LinkedIn",
            "Instagram",
            "YouTube",
            "Blogger",
            "Website"
    };

    Integer[] imageid = {
            R.drawable.facebook,
            R.drawable.twitter,
            R.drawable.linkedin,
            R.drawable.instagram,
            R.drawable.youtube,
            R.drawable.blog,
            R.drawable.home
    };

    final String[] UrlBrowser = {
            "https://www.facebook.com/maVUTi/",
            "https://www.twitter.com/VUT_Online",
            "https://www.linkedin.com/school/vaal-university-of-technology/",
            "https://www.instagram.com/vaal_university_of_technology/",
            "https://www.youtube.com/c/VutAcZaVUT",
            "https://www.vut.ac.za/blog/",
            "https://www.vut.ac.za/"
    };

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        final socialList adapter = new socialList(this,itemname,imageid);
        final ListView social_list = (ListView) findViewById(R.id.social_list);
        social_list.setAdapter(adapter);

        social_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(UrlBrowser[position]));
                startActivity(intent);
            }

        });
    }

}
