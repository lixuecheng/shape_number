package com.joyoung.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        String[] itemnum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "", "0", ""};
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 12; i++) {
            list.add(itemnum[i]);
        }
        GridView gridView = findViewById(R.id.gridview);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.item, list);
        gridView.setAdapter(arrayAdapter);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
