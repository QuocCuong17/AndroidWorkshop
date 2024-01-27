package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.workshop.model.Cat;
import com.example.workshop.model.CatAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecycleView extends AppCompatActivity implements CatAdapter.CatItemListener{
    private RecyclerView recyclerView;
    private CatAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        recyclerView = findViewById(R.id.rview);
        adapter =  new CatAdapter(getList());
        adapter.setCatItemListener(this);
        GridLayoutManager manager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
    private List<Cat> getList(){
        List<Cat> list =  new ArrayList<>();
        list.add(new Cat(R.drawable.img,"Meo con 1"));
        list.add(new Cat(R.drawable.img_1,"Meo con 2"));
        list.add(new Cat(R.drawable.img_2,"Meo con 3"));
        list.add(new Cat(R.drawable.img_3,"Meo con 4"));
        list.add(new Cat(R.drawable.img_4,"Meo con 5"));
        list.add(new Cat(R.drawable.img_5,"Meo con 6"));

        return list;
    }

    @Override
    public void onItemClick(View view, int position) {
        Cat c = getList().get(position);
        Toast.makeText(this, c.getName(), Toast.LENGTH_SHORT).show();
    }
}