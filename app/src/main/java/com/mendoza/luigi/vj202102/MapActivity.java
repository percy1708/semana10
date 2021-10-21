package com.mendoza.luigi.vj202102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.mendoza.luigi.vj202102.entities.Repository;
import com.mendoza.luigi.vj202102.services.GitHubService;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MapActivity extends AppCompatActivity {
ImageView c;
TextView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        c=findViewById(R.id.miii);
        Picasso.get()
                .load("https://www.4webs.es/blog/wp-content/uploads/2019/02/urls-que-es.jpg")
                .into(c);






    }}
