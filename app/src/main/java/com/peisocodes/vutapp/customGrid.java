package com.peisocodes.vutapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class customGrid extends BaseAdapter {

    private Context mContext;
    private final String[] menuText;
    private final int[]ImageId;

    public customGrid(Context c,String[] menuText, int[] ImageId) {
        mContext = c;
        this.ImageId=ImageId;
        this.menuText=menuText;
    }

    @Override
    public int getCount() {
        return menuText.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater = (LayoutInflater)mContext.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null)
        {
            grid=new View(mContext);
            grid=inflater.inflate(R.layout.grid_single,null);

            TextView textView = (TextView)grid.findViewById(R.id.grid_text);
            textView.setText(menuText[position]);

            ImageView imageView =(ImageView)grid.findViewById(R.id.grid_image);
            imageView.setImageResource(ImageId[position]);
        }
        else
        {
            grid=(View)convertView;
        }
        return grid;
    }
}
