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

public class Level_2_3 extends AppCompatActivity {


    Button btn_harf_s;
    Button btn_harf_a;
    Button btn_harf_r;
    Button btn_harf_t;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_s_x,pos_s_y;
    float pos_a_x,pos_a_y;
    float pos_r_x,pos_r_y;
    float pos_t_x,pos_t_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView sart_s,sart_a,sart_r,sart_t,tas_a,tas_s,art_r,art_t;
    int puan=0;
    int i=0,j=0,k=0;
    String [] cevaplar=new String[3];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_2_3.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_2_3);

        chronometer = findViewById(R.id.chronometer_2_3);
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

        puan_txt=findViewById(R.id.txt_2_3_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_2_3_basilan_harfler);
        cevaplar[0]="ŞART";
        cevaplar[1]="TAŞ";
        cevaplar[2]="ART";

        sart_s=findViewById(R.id.txt_sart_s);
        sart_a=findViewById(R.id.txt_sart_a);
        sart_r=findViewById(R.id.txt_sart_r);
        sart_t=findViewById(R.id.txt_sart_t);
        tas_a=findViewById(R.id.txt_tas_a);
        tas_s=findViewById(R.id.txt_tas_s);
        art_r=findViewById(R.id.txt_art_r);
        art_t=findViewById(R.id.txt_art_t);

        btn_harf_s=findViewById(R.id.btn_2_3_s);
        btn_harf_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn_dizi.add(btn_harf_s);
                harfler_dizi.add("Ş");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_a=findViewById(R.id.btn_2_3_a);
        btn_harf_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_a);
                harfler_dizi.add("A");
                harfler_txt.setText(harfler_dizi.toString());


            }
        });

        btn_harf_r=findViewById(R.id.btn_2_3_r);
        btn_harf_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_r);
                harfler_dizi.add("R");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_t=findViewById(R.id.btn_2_3_t);
        btn_harf_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_t);
                harfler_dizi.add("T");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_2_3_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_s_x=btn_harf_s.getX();
                pos_s_y=btn_harf_s.getY();

                pos_a_x=btn_harf_a.getX();
                pos_a_y=btn_harf_a.getY();

                pos_r_x=btn_harf_r.getX();
                pos_r_y=btn_harf_r.getY();

                pos_t_x=btn_harf_t.getX();
                pos_t_y=btn_harf_t.getY();

                btn_harf_s.setX(pos_a_x);
                btn_harf_s.setY(pos_a_y);

                btn_harf_a.setX(pos_r_x);
                btn_harf_a.setY(pos_r_y);

                btn_harf_r.setX(pos_t_x);
                btn_harf_r.setY(pos_t_y);

                btn_harf_t.setX(pos_s_x);
                btn_harf_t.setY(pos_s_y);

            }
        });

        btn_sil=findViewById(R.id.btn_2_3_sil);
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

        btn_kontrol=findViewById(R.id.btn_2_3_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<3){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_a) == 0 && btn_dizi.indexOf(btn_harf_r) == 1 && btn_dizi.indexOf(btn_harf_t) == 2) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            sart_a.setText("A");
                            art_r.setText("R");
                            art_t.setText("T");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_t) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_s) == 2) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            sart_t.setText("T");
                            tas_a.setText("A");
                            tas_s.setText("Ş");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==4) {
                    if (btn_dizi.indexOf(btn_harf_s) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_r) == 2 && btn_dizi.indexOf(btn_harf_t) == 3) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            sart_s.setText("Ş");
                            sart_a.setText("A");
                            sart_r.setText("R");
                            sart_t.setText("T");
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
                    String seviye="Level 2_3";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2"))){
                        Intent level_iki=new Intent(Level_2_3.this,Level_2.class);
                        next_level_dizi.add(level_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_1"))){
                        Intent level_iki_bir=new Intent(Level_2_3.this,Level_2_1.class);
                        next_level_dizi.add(level_iki_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_2"))){
                        Intent level_iki_iki=new Intent(Level_2_3.this,Level_2_2.class);
                        next_level_dizi.add(level_iki_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_4"))){
                        Intent level_iki_dort=new Intent(Level_2_3.this,Level_2_4.class);
                        next_level_dizi.add(level_iki_dort);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_5"))){
                        Intent level_iki_bes=new Intent(Level_2_3.this,Level_2_5.class);
                        next_level_dizi.add(level_iki_bes);
                    }

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_2_3.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }

            }
        });

    }
}
