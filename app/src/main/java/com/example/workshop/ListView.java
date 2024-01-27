package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.List;

public class ListView extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
//        listView=findViewById(R.id.lview);
        initListView();
    }

    private void initListView() {

        String [] list = getResources().getStringArray(R.array.tech);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.itemlisttv,list);
//        listView.setAdapter(adapter);


    }


}