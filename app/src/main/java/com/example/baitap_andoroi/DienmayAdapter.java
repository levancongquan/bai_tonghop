package com.example.baitap_andoroi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DienmayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Dienmay> dienmayList;

    public DienmayAdapter(Context context, int layout, List<Dienmay> dienmayList) {
        this.context = context;
        this.layout = layout;
        this.dienmayList = dienmayList;
    }

    @Override
    public int getCount() {
        return dienmayList.size();
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

        view = inflater.inflate(layout,null);
        TextView txtten = (TextView) view.findViewById(R.id.txtten);
        TextView txtmota = (TextView) view.findViewById(R.id.txtmota);
        ImageView imghinh = (ImageView) view.findViewById(R.id.ImgHinh);

        Dienmay dienmay = dienmayList.get(i);

        txtten.setText(dienmay.getTen());
        txtmota.setText(dienmay.getMoTa());
        imghinh.setImageResource(dienmay.getHinh());

        return view;
    }
}
