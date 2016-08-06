package com.minji_sns.minji_sns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample);

        ArrayList<ListData> items = new ArrayList<>();
        for(int i=0; i<10;i++)
            items.add(new ListData("메인텍스트 입니다. "+ i, i+ "명이 듣고있습니다.", R.drawable.dco_b_logo));

        listView = (ListView) findViewById(R.id.listview);
        MyListAdapter adapter = new MyListAdapter(MainActivity.this, R.layout.sample_item, items);
        listView.setAdapter(adapter);
    }
}
