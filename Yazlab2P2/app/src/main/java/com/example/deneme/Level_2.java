package com.example.deneme;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;

public class Level_2 extends AppCompatActivity {


    Button btn_harf_o;
    Button btn_harf_y;
    Button btn_harf_k;
    Button btn_harf_u;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_o_x,pos_o_y;
    float pos_y_x,pos_y_y;
    float pos_k_x,pos_k_y;
    float pos_u_x,pos_u_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView oyku_o,oyku_y,oyku_k,oyku_u,koy_k,koy_y,yuk_y,yuk_k;
    int puan=0;
    int i=0,j=0,k=0;
    String [] cevaplar=new String[3];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_2.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_2);

        chronometer = findViewById(R.id.chronometer_2);
        chronometer.start();

        new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                puan -= 10;
                puan_txt.setText("" + puan);
            }
        }.start();

        puan_txt=findViewById(R.id.txt_2_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_2_basilan_harfler);
        cevaplar[0]="ÖYKÜ";
        cevaplar[1]="KÖY";
        cevaplar[2]="YÜK";

        oyku_o=findViewById(R.id.txt_oyku_o);
        oyku_y=findViewById(R.id.txt_oyku_y);
        oyku_k=findViewById(R.id.txt_oyku_k);
        oyku_u=findViewById(R.id.txt_oyku_u);
        koy_k=findViewById(R.id.txt_koy_k);
        koy_y=findViewById(R.id.txt_koy_y);
        yuk_y=findViewById(R.id.txt_yuk_y);
        yuk_k=findViewById(R.id.txt_yuk_k);

        btn_harf_o=findViewById(R.id.btn_2_o);
        btn_harf_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn_dizi.add(btn_harf_o);
                harfler_dizi.add("Ö");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_y=findViewById(R.id.btn_2_y);
        btn_harf_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_y);
                harfler_dizi.add("Y");
                harfler_txt.setText(harfler_dizi.toString());


            }
        });

        btn_harf_k=findViewById(R.id.btn_2_k);
        btn_harf_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_k);
                harfler_dizi.add("K");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_u=findViewById(R.id.btn_2_u);
        btn_harf_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_u);
                harfler_dizi.add("Ü");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_2_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_o_x=btn_harf_o.getX();
                pos_o_y=btn_harf_o.getY();

                pos_y_x=btn_harf_y.getX();
                pos_y_y=btn_harf_y.getY();

                pos_k_x=btn_harf_k.getX();
                pos_k_y=btn_harf_k.getY();

                pos_u_x=btn_harf_u.getX();
                pos_u_y=btn_harf_u.getY();

                btn_harf_o.setX(pos_y_x);
                btn_harf_o.setY(pos_y_y);

                btn_harf_y.setX(pos_k_x);
                btn_harf_y.setY(pos_k_y);

                btn_harf_k.setX(pos_u_x);
                btn_harf_k.setY(pos_u_y);

                btn_harf_u.setX(pos_o_x);
                btn_harf_u.setY(pos_o_y);

            }
        });

        btn_sil=findViewById(R.id.btn_2_sil);
        btn_sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(btn_dizi.isEmpty())){
                    btn_dizi.remove(btn_dizi.size()-1);
                    harfler_dizi.remove(harfler_dizi.size()-1);
                    harfler_txt.setText(harfler_dizi.toString());
                }
            }
        });

        btn_kontrol=findViewById(R.id.btn_2_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<3){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_y) == 0 && btn_dizi.indexOf(btn_harf_u) == 1 && btn_dizi.indexOf(btn_harf_k) == 2) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            yuk_y.setText("Y");
                            oyku_u.setText("Ü");
                            yuk_k.setText("K");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_k) == 0 && btn_dizi.indexOf(btn_harf_o) == 1 && btn_dizi.indexOf(btn_harf_y) == 2) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            koy_k.setText("K");
                            oyku_o.setText("Ö");
                            koy_y.setText("Y");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==4) {
                    if (btn_dizi.indexOf(btn_harf_o) == 0 && btn_dizi.indexOf(btn_harf_y) == 1 && btn_dizi.indexOf(btn_harf_k) == 2 && btn_dizi.indexOf(btn_harf_u) == 3) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            oyku_o.setText("Ö");
                            oyku_y.setText("Y");
                            oyku_k.setText("K");
                            oyku_u.setText("Ü");
                        }
                    }else{
                        puan-=harfler_dizi.size()*100;
                    }
                }else {
                    puan-=harfler_dizi.size()*100;
                }
                puan_txt.setText(""+puan);
                harfler_dizi.clear();
                btn_dizi.clear();

                if (cevaplar[0]==""&&cevaplar[1]==""&&cevaplar[2]==""){
                    String seviye="Level 2";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_1"))){
                        Intent level_iki_bir=new Intent(Level_2.this,Level_2_1.class);
                        next_level_dizi.add(level_iki_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_2"))){
                        Intent level_iki_iki=new Intent(Level_2.this,Level_2_2.class);
                        next_level_dizi.add(level_iki_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_3"))){
                        Intent level_iki_uc=new Intent(Level_2.this,Level_2_3.class);
                        next_level_dizi.add(level_iki_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_4"))){
                        Intent level_iki_dort=new Intent(Level_2.this,Level_2_4.class);
                        next_level_dizi.add(level_iki_dort);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_5"))){
                        Intent level_iki_bes=new Intent(Level_2.this,Level_2_5.class);
                        next_level_dizi.add(level_iki_bes);
                    }

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_2.this,BaslaActivity.class);
                        startActivity(bitti);
                    }


                }

            }
        });

    }
}
