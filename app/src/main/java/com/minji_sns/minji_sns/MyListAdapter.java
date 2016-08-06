package com.minji_sns.minji_sns;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MinjiDGU on 2016-08-04.
 */
public class MyListAdapter extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<ListData> items;

    public MyListAdapter(Context context, int layout, ArrayList<ListData> items) {
        this.context = context;
        this.layout = layout;
        this.items = items;
    }

    @Override
    public int getCount() {
        if(items == null) return 0;
        else return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(view == null){
            view = View.inflate(context, layout, null);
        }

        ListData item = items.get(position);

        TextView mainText = (TextView) view.findViewById(R.id.mainText);
        TextView subText = (TextView) view.findViewById(R.id.subText);
        ImageView img = (ImageView) view.findViewById(R.id.img);

        mainText.setText(item.getMainText());
        subText.setText(item.getSubText());
        img.setImageResource(item.getImgAddress());

        return view;
    }
}
