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

public class Level_2_4 extends AppCompatActivity {


    Button btn_harf_v;
    Button btn_harf_a;
    Button btn_harf_l;
    Button btn_harf_i;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_v_x,pos_v_y;
    float pos_a_x,pos_a_y;
    float pos_l_x,pos_l_y;
    float pos_i_x,pos_i_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView vali_v,vali_a,vali_l,vali_i,lav_l,lav_v,ila_l,ila_a;
    int puan=0;
    int i=0,j=0,k=0;
    String [] cevaplar=new String[3];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_2_4.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_2_4);

        chronometer = findViewById(R.id.chronometer_2_4);
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

        puan_txt=findViewById(R.id.txt_2_4_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_2_4_basilan_harfler);
        cevaplar[0]="VALİ";
        cevaplar[1]="LAV";
        cevaplar[2]="İLA";

        vali_v=findViewById(R.id.txt_vali_v);
        vali_a=findViewById(R.id.txt_vali_a);
        vali_l=findViewById(R.id.txt_vali_l);
        vali_i=findViewById(R.id.txt_vali_i);
        lav_l=findViewById(R.id.txt_lav_l);
        lav_v=findViewById(R.id.txt_lav_v);
        ila_l=findViewById(R.id.txt_ila_l);
        ila_a=findViewById(R.id.txt_ila_a);

        btn_harf_v=findViewById(R.id.btn_2_4_v);
        btn_harf_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn_dizi.add(btn_harf_v);
                harfler_dizi.add("V");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_a=findViewById(R.id.btn_2_4_a);
        btn_harf_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_a);
                harfler_dizi.add("A");
                harfler_txt.setText(harfler_dizi.toString());


            }
        });

        btn_harf_l=findViewById(R.id.btn_2_4_l);
        btn_harf_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_l);
                harfler_dizi.add("L");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_i=findViewById(R.id.btn_2_4_i);
        btn_harf_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_i);
                harfler_dizi.add("İ");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_2_4_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_v_x=btn_harf_v.getX();
                pos_v_y=btn_harf_v.getY();

                pos_a_x=btn_harf_a.getX();
                pos_a_y=btn_harf_a.getY();

                pos_l_x=btn_harf_l.getX();
                pos_l_y=btn_harf_l.getY();

                pos_i_x=btn_harf_i.getX();
                pos_i_y=btn_harf_i.getY();

                btn_harf_v.setX(pos_a_x);
                btn_harf_v.setY(pos_a_y);

                btn_harf_a.setX(pos_l_x);
                btn_harf_a.setY(pos_l_y);

                btn_harf_l.setX(pos_i_x);
                btn_harf_l.setY(pos_i_y);

                btn_harf_i.setX(pos_v_x);
                btn_harf_i.setY(pos_v_y);

            }
        });

        btn_sil=findViewById(R.id.btn_2_4_sil);
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

        btn_kontrol=findViewById(R.id.btn_2_4_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<3){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_i) == 0 && btn_dizi.indexOf(btn_harf_l) == 1 && btn_dizi.indexOf(btn_harf_a) == 2) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            vali_i.setText("İ");
                            ila_l.setText("L");
                            ila_a.setText("A");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_l) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_v) == 2) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            lav_l.setText("L");
                            vali_a.setText("A");
                            lav_v.setText("V");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==4) {
                    if (btn_dizi.indexOf(btn_harf_v) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_l) == 2 && btn_dizi.indexOf(btn_harf_i) == 3) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            vali_v.setText("V");
                            vali_a.setText("A");
                            vali_l.setText("L");
                            vali_i.setText("İ");
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
                    String seviye="Level 2_4";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2"))){
                        Intent level_iki=new Intent(Level_2_4.this,Level_2.class);
                        next_level_dizi.add(level_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_1"))){
                        Intent level_iki_bir=new Intent(Level_2_4.this,Level_2_1.class);
                        next_level_dizi.add(level_iki_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_2"))){
                        Intent level_iki_iki=new Intent(Level_2_4.this,Level_2_2.class);
                        next_level_dizi.add(level_iki_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_3"))){
                        Intent level_iki_uc=new Intent(Level_2_4.this,Level_2_3.class);
                        next_level_dizi.add(level_iki_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_5"))){
                        Intent level_iki_bes=new Intent(Level_2_4.this,Level_2_5.class);
                        next_level_dizi.add(level_iki_bes);
                    }

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_2_4.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }

            }
        });

    }
}
