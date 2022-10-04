package com.example.baitap_andoroi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class singin extends AppCompatActivity {
    Button btnlogin1,btnsingin1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);
        btnlogin1 = (Button) findViewById(R.id.btlogin1);
        btnsingin1 = (Button) findViewById(R.id.btdangky1);
        btnlogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(singin.this,login.class);
                startActivity(i);
            }
        });
        btnsingin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(singin.this,Profile.class);
                startActivity(i);
            }
        });
    }
}