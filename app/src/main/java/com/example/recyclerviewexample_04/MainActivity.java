package com.example.recyclerviewexample_04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Item> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listConstructor();
    }


    public void listConstructor(){
        list.add(new Item("Hotel Estelar","Manizales","#FFF44336",175000));
        list.add(new Item("Hotel Windsor","Barraqnuilla","#f2e98d",220000));
        list.add(new Item("Hotel Hilton","Bogotá","#1e2c53",300000));
        list.add(new Item("Hotel Tequendama","Medellín","#0cab0a", 290000));
        list.add(new Item("Hotel Sophia","Cartagena","#ffe038",245000));
        list.add(new Item("Hotel Casablanca","San Andres","#00feff",265000));
        list.add(new Item("Hotel Decameron","Leticia","#123e07",350000));

        init();
    }

    public void init(){
        ItemAdapter itemAdapter= new ItemAdapter(list,this);
        RecyclerView recyclerView=findViewById(R.id.rvItems);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(itemAdapter);
    }
}