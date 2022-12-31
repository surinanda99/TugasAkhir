package com.example.crimcone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class listmenu extends AppCompatActivity {

    RecyclerView recEskrim;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<eskrim> listEskrim;

    void dataDummy(){
        listEskrim= new ArrayList<>();
        listEskrim.add(new eskrim("rainbow","Eskrim berbagai rasa",40000,R.drawable.eskrim7));
        listEskrim.add(new eskrim("oreo","Eskrim dengan topping oreo yang melimpah",45000,R.drawable.eskrim2));
        listEskrim.add(new eskrim("strawberry","Eskrim Strawberry lembut",55000,R.drawable.eskrim3));
        listEskrim.add(new eskrim("coklat","Eskrim coklat Manis",25000,R.drawable.eskrim4));
        listEskrim.add(new eskrim("choco crunch", "Eskrim dengan rasa choco", 36000,R.drawable.eskrim5));
        listEskrim.add(new eskrim("Vanilla", "Eskrim dengan rasa Vanila", 36000,R.drawable.eskrim6));
    }
    void data(){
        recEskrim = findViewById(R.id.recMenu);
        adapter = new adapter(this, listEskrim);
        layoutManager = new LinearLayoutManager(this);
        recEskrim.setLayoutManager(layoutManager);
        recEskrim.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmenu);

        getSupportActionBar().setTitle("List Menu");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dataDummy();data();
    }
}