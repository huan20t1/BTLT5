package com.example.phamvanhuan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<MonAn> arraylist;

    public Adapter(Context context, int layout, List<MonAn> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        MonAn matHang = arraylist.get(i);
        TextView textView1 = view.findViewById(R.id.tv_name);
        TextView textView2 = view.findViewById(R.id.tv_thongtin);
        TextView textView3 = view.findViewById(R.id.tv_gia);
        ImageView imageView1 = view.findViewById(R.id.imgHinh);
        textView1.setText(matHang.getTenmon());
        textView2.setText(matHang.getChitiet());
        textView3.setText(matHang.getGia());
        imageView1.setImageResource(matHang.getHinh());

        return view;
    }
}
