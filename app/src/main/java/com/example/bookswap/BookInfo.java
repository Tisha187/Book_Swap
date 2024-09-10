package com.example.bookswap;

import android.content.Context;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BookInfo extends AppCompatActivity {

    private RecyclerView rec;
    private BookInfoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_book_info);

        rec = findViewById(R.id.bookinfo_recyclerview);

        rec.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        List<Info> popularbooks= dataqueue();
        //Adapter

        adapter = new BookInfoAdapter(this,popularbooks);

        rec.setAdapter(adapter);



    }

    private List<Info> dataqueue(){
        List<Info> feed = new ArrayList<>();

        feed.add(new Info("author3","https://th.bing.com/th/id/OIP.LxHEJG96q_5slYQQ5ynmkwHaEc?w=274&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.LxHEJG96q_5slYQQ5ynmkwHaEc?w=274&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
        feed.add(new Info("author1","https://th.bing.com/th/id/OIP.WFXv7M9CPuUWxE88ib4-zgHaGX?w=190&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.WFXv7M9CPuUWxE88ib4-zgHaGX?w=190&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
        feed.add(new Info("author2","https://th.bing.com/th/id/OIP.BxengUBP0jPzfJgIFkJZkQHaNK?w=115&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.BxengUBP0jPzfJgIFkJZkQHaNK?w=115&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));

        return feed;
    }
}