package com.example.student.db020404;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by student on 2017/2/4.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    String data[];
    boolean b[];
    public MyAdapter(Context c, String str[], boolean b[])
    {
        this.context = c;
        this.data = str;
        this.b = b;
    }
    @Override
    public int getCount() {
        Log.d("MML", "getCount()");
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        Log.d("MML", "getView(), position:" + position);
        if (convertView == null)
        {
            Log.d("MML", "convertView: null");
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.myitem, null);
            holder = new ViewHolder();
            holder.tv = (TextView)convertView.findViewById(R.id.textView);
            holder.btn = (Button) convertView.findViewById(R.id.button);
            convertView.setTag(holder);
        }
        else
        {
            Log.d("MML", "convertView:" + convertView.toString());
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv.setText(data[position]);
        final String msg = data[position];
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
    static class ViewHolder
    {
        TextView tv;
        Button btn;
    }
}
