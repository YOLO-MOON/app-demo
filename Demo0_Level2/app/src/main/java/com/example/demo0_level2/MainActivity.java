package com.example.demo0_level2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;//实例化对象
    private List<String> list;
    private RecycleAdapterDome adapterDome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);//感觉有点像实例化对象，后面可以调用方法
        list = new ArrayList<>();
        for (int i =1; i<11; i++) {
            list.add("现在已经是第"+i+"节课了，醒醒了兄弟"  );
        }
        adapterDome = new RecycleAdapterDome(this,list);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        StaggeredGridLayoutManager stagger = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL); //这两个是官方写好的
        recyclerView.setLayoutManager(stagger);
        recyclerView.setAdapter(adapterDome);
    }
}
