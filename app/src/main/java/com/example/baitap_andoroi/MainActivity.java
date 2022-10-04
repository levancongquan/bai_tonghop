package com.example.baitap_andoroi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvdienmay;
    ArrayList<Dienmay>  arraydienmay ;
    DienmayAdapter adapter;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Anhxa();
    adapter = new DienmayAdapter(this,R.layout.dong_dienmay,arraydienmay);
    lvdienmay.setAdapter(adapter);
    lvdienmay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(MainActivity.this, chitiet.class);
            Dienmay dienmay = arraydienmay.get(i);
            intent.putExtra("ten",dienmay.getTen());
            intent.putExtra("mota",dienmay.getMoTa());
            intent.putExtra("hinh",dienmay.getHinh());
            startActivity(intent);



        }
    });
    lvdienmay.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
        @Override
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

            AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
            b.setTitle("lê văn công quân");
            b.setMessage("Bạn có đồng ý xóa món hàng này không ?");
            b.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    arraydienmay.remove(i);
                    adapter.notifyDataSetChanged();
                }
            });
            b.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            });
            AlertDialog al = b.create();
            al.show();
            return false;

        }
    });
    button = (Button) findViewById(R.id.btthoat);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this,home.class);
            startActivity(i);

        }
    });


    }


    private void Anhxa() {
        lvdienmay =(ListView) findViewById(R.id.listview_Dienmay);
        arraydienmay = new ArrayList<>();
        arraydienmay.add(new Dienmay("Quạt","quạt asia công suất 1500w",R.drawable.img));
        arraydienmay.add(new Dienmay("Máy Giặt","máy giặt panasonic",R.drawable.img_1));
        arraydienmay.add(new Dienmay("Tủ Lạnh","tủ lạnh LG",R.drawable.img_2));
        arraydienmay.add(new Dienmay("Bếp Điện","bếp điện công suất 7000w",R.drawable.bacgrou));
    }




    public static class MainActivity2 extends AppCompatActivity {
        TextView textview;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);



        }
    }

}
