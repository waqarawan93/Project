package com.example.waqarahmed.adapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    GridView gv;
    int  abc[] ={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,
            R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        gv=(GridView) findViewById(R.id.gv);
        ArrayAdapter ad= new ArrayAdapter(this, android.R.layout.simple_list_item_1 ,abc);
    }
}
