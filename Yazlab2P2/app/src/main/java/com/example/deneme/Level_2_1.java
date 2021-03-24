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

public class Level_2_1 extends AppCompatActivity {


    Button btn_harf_e;
    Button btn_harf_t;
    Button btn_harf_i;
    Button btn_harf_k;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_e_x,pos_e_y;
    float pos_t_x,pos_t_y;
    float pos_i_x,pos_i_y;
    float pos_k_x,pos_k_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView etik_e,etik_t,etik_i,etik_k,tek_e,tek_k,kit_i,kit_t;
    int puan=0;
    int i=0,j=0,k=0;
    String [] cevaplar=new String[3];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_2_1.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_2_1);

        chronometer = findViewById(R.id.chronometer_2_1);
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

        puan_txt=findViewById(R.id.txt_2_1_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_2_1_basilan_harfler);
        cevaplar[0]="ETİK";
        cevaplar[1]="TEK";
        cevaplar[2]="KİT";

        etik_e=findViewById(R.id.txt_etik_e);
        etik_t=findViewById(R.id.txt_etik_t);
        etik_i=findViewById(R.id.txt_etik_i);
        etik_k=findViewById(R.id.txt_etik_k);
        tek_e=findViewById(R.id.txt_tek_e);
        tek_k=findViewById(R.id.txt_tek_k);
        kit_i=findViewById(R.id.txt_kit_i);
        kit_t=findViewById(R.id.txt_kit_t);

        btn_harf_e=findViewById(R.id.btn_2_1_e);
        btn_harf_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn_dizi.add(btn_harf_e);
                harfler_dizi.add("E");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_t=findViewById(R.id.btn_2_1_t);
        btn_harf_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_t);
                harfler_dizi.add("T");
                harfler_txt.setText(harfler_dizi.toString());


            }
        });

        btn_harf_i=findViewById(R.id.btn_2_1_i);
        btn_harf_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_i);
                harfler_dizi.add("İ");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_k=findViewById(R.id.btn_2_1_k);
        btn_harf_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_k);
                harfler_dizi.add("K");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_2_1_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_e_x=btn_harf_e.getX();
                pos_e_y=btn_harf_e.getY();

                pos_t_x=btn_harf_t.getX();
                pos_t_y=btn_harf_t.getY();

                pos_i_x=btn_harf_i.getX();
                pos_i_y=btn_harf_i.getY();

                pos_k_x=btn_harf_k.getX();
                pos_k_y=btn_harf_k.getY();

                btn_harf_e.setX(pos_t_x);
                btn_harf_e.setY(pos_t_y);

                btn_harf_t.setX(pos_i_x);
                btn_harf_t.setY(pos_i_y);

                btn_harf_i.setX(pos_k_x);
                btn_harf_i.setY(pos_k_y);

                btn_harf_k.setX(pos_e_x);
                btn_harf_k.setY(pos_e_y);

            }
        });

        btn_sil=findViewById(R.id.btn_2_1_sil);
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

        btn_kontrol=findViewById(R.id.btn_2_1_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<3){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_k) == 0 && btn_dizi.indexOf(btn_harf_i) == 1 && btn_dizi.indexOf(btn_harf_t) == 2) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            etik_k.setText("K");
                            kit_i.setText("İ");
                            kit_t.setText("T");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_t) == 0 && btn_dizi.indexOf(btn_harf_e) == 1 && btn_dizi.indexOf(btn_harf_k) == 2) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            etik_t.setText("T");
                            tek_e.setText("E");
                            tek_k.setText("K");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==4) {
                    if (btn_dizi.indexOf(btn_harf_e) == 0 && btn_dizi.indexOf(btn_harf_t) == 1 && btn_dizi.indexOf(btn_harf_i) == 2 && btn_dizi.indexOf(btn_harf_k) == 3) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            etik_e.setText("E");
                            etik_t.setText("T");
                            etik_i.setText("İ");
                            etik_k.setText("K");
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
                    String seviye="Level 2_1";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2"))){
                        Intent level_iki=new Intent(Level_2_1.this,Level_2.class);
                        next_level_dizi.add(level_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_2"))){
                        Intent level_iki_iki=new Intent(Level_2_1.this,Level_2_2.class);
                        next_level_dizi.add(level_iki_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_3"))){
                        Intent level_iki_uc=new Intent(Level_2_1.this,Level_2_3.class);
                        next_level_dizi.add(level_iki_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_4"))){
                        Intent level_iki_dort=new Intent(Level_2_1.this,Level_2_4.class);
                        next_level_dizi.add(level_iki_dort);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_5"))){
                        Intent level_iki_bes=new Intent(Level_2_1.this,Level_2_5.class);
                        next_level_dizi.add(level_iki_bes);
                    }

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_2_1.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }

            }
        });

    }
}