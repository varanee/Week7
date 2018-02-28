package com.micky.it.week7;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context mContext;
    String[] strName;

    public CustomAdapter(Context context, String[] strName) {
        mContext = context;
        this.strName = strName;
    }


    @Override
    public int getCount() {
        return strName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null)
            view = mInflater.inflate(R.layout.listview_row, parent, false);
        TextView textView = (TextView) view.findViewById(R.id.textView1);
        textView.setText(strName[position]);
        return view;
    }


}