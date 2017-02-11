package com.example.student.db020404;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Show");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i;
        StringBuilder sb = new StringBuilder();
        for (i=0;i<data.length;i++)
        {
            if (b[i])
            {
                sb.append(data[i] + ",");
            }
        }
        Toast.makeText(MainActivity.this, sb.toString(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
