package com.peisocodes.vutapp;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class  learningList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[]Item_Name;

    public learningList(Activity context,String[]Item_Name){
        super(context, R.layout.learning_list,Item_Name);

        this.context = context;
        this.Item_Name=Item_Name;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.learning_list, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView);

        txtTitle.setText(Item_Name[position]);
        extratxt.setText("Connect to " + Item_Name[position]);

        return rowView;
    }

}