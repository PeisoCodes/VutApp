package com.peisocodes.vutapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class socialList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[]Item_Name;
    private final Integer[] imageid;

    public socialList(Activity context,String[]Item_Name,Integer[] imageid){
        super(context,R.layout.social_list,Item_Name);

        this.context = context;
        this.Item_Name=Item_Name;
        this.imageid=imageid;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.social_list, null, true);

        TextView txtTitle =(TextView)rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.icon);
        TextView extratxt =(TextView)rowView.findViewById(R.id.textView);

        txtTitle.setText(Item_Name[position]);
        imageView.setImageResource(imageid[position]);
        extratxt.setText("Connect with us on "+Item_Name[position]);

        return rowView;
    }
}
