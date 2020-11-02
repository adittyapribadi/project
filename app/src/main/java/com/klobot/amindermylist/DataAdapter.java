package com.klobot.amindermylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

public class DataAdapter extends BaseAdapter {


    Context context;
    String[] nama;
    String[] asal;
    int[] nim;
    LayoutInflater inflater;
    public DataAdapter(Context contextnya, String[] namanya, String[] asalnya, int[] nimnya){
        this.context = contextnya;
        this.nama = namanya;
        this.asal = asalnya;
        this.nim = nimnya;
        this.inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return nama.length;
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
        convertView = inflater.inflate(R.layout.custom_list,null);
        TextView textNama = convertView.findViewById(R.id.tv_nama);
        TextView textAsal = convertView.findViewById(R.id.tv_asal);
        TextView textNim = convertView.findViewById(R.id.tv_nim);

        textNama.setText(nama[position]);
        textAsal.setText(asal[position]);
        textNim.setText(String.valueOf(nim[position]));

        return convertView;
    }
}

