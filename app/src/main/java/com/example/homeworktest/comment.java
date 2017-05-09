package com.example.homeworktest;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Huei-Lian on 2017/5/9.
 */


public class comment extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        ArrayList<String> albumlist = new ArrayList<String>();

        albumlist.add("AAA");
        albumlist.add("BBB");
        albumlist.add("CCC");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                albumlist);

        setListAdapter(adapter);
    }
}