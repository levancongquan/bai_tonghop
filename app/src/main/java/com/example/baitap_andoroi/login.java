package com.example.baitap_andoroi;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button btnlogin,btnsingin;
    EditText txtuser,txtpass;
    private void Anhxa(){
        txtuser = (EditText) findViewById(R.id.txtuser1);
        txtpass = (EditText) findViewById(R.id.txtpass1);
        btnlogin = (Button) findViewById(R.id.btnlogin1);
       btnsingin =(Button) findViewById(R.id.btnsingin1);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin = (Button) findViewById(R.id.btnlogin1);
        btnsingin = (Button) findViewById(R.id.btnsingin1);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtuser.getText().length() != 0 && txtpass.getText().length() !=0){
                    if (txtuser.getText().toString().equals("quan") && txtpass.getText().toString().equals("11111")){
                        Toast.makeText(login.this,"Dang Nhap Thanh Cong",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(login.this,home.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(login.this,"Sai Mat Khau",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(login.this,"Vui Long Nhap Day Du Thong Tin",Toast.LENGTH_SHORT).show();
                }
            }

        });
        btnsingin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this,singin.class);
                startActivity(i);
            }
        });
    }
}

