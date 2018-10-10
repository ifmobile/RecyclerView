package com.example.professor.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView lista = (RecyclerView) findViewById(R.id.lista);

        lista.setLayoutManager(new LinearLayoutManager(this));

        lista.setAdapter(new ItemAdapter(this));

        DividerItemDecoration sep = new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL);

        lista.addItemDecoration(sep);
    }
}
