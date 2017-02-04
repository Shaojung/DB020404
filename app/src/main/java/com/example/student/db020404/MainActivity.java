package com.example.student.db020404;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String data[] = {"AA","BB", "CCC", "DDDD", "EE", "FF", "GGG", "HH", "III", "JJJ", "KKK"};
    boolean b[] = new boolean[11];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView) findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(MainActivity.this, data, b);
        lv.setAdapter(adapter);
    }
}
