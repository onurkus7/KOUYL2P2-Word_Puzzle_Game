package com.example.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_hak;
    Button btn_bas;
    Button btn_tablo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_hak=findViewById(R.id.btn_hakkinda);

        btn_hak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hakkinda=new Intent(MainActivity.this,Hakkinda.class);
                startActivity(hakkinda);
            }
        });

        btn_bas=findViewById(R.id.btn_basla);
        btn_bas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basla=new Intent(MainActivity.this,BaslaKontrolActivity.class);
                startActivity(basla);
            }
        });
        btn_tablo=findViewById(R.id.btn_tablo_listele);
        btn_tablo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listele=new Intent(MainActivity.this,TabloListele.class);
                startActivity(listele);
            }
        });
    }
}
