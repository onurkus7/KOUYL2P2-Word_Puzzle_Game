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

public class Level_2_2 extends AppCompatActivity {


    Button btn_harf_m;
    Button btn_harf_a;
    Button btn_harf_n;
    Button btn_harf_i;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_m_x,pos_m_y;
    float pos_a_x,pos_a_y;
    float pos_n_x,pos_n_y;
    float pos_i_x,pos_i_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView mani_m,mani_a,mani_n,mani_i,ima_m,ima_a,nam_n,nam_m;
    int puan=0;
    int i=0,j=0,k=0;
    String [] cevaplar=new String[3];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_2_2.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_2_2);

        chronometer = findViewById(R.id.chronometer_2_2);
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

        puan_txt=findViewById(R.id.txt_2_2_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_2_2_basilan_harfler);
        cevaplar[0]="MANİ";
        cevaplar[1]="NAM";
        cevaplar[2]="İMA";

        mani_m=findViewById(R.id.txt_mani_m);
        mani_a=findViewById(R.id.txt_mani_a);
        mani_n=findViewById(R.id.txt_mani_n);
        mani_i=findViewById(R.id.txt_mani_i);
        ima_m=findViewById(R.id.txt_ima_m);
        ima_a=findViewById(R.id.txt_ima_a);
        nam_n=findViewById(R.id.txt_nam_n);
        nam_m=findViewById(R.id.txt_nam_m);

        btn_harf_m=findViewById(R.id.btn_2_2_m);
        btn_harf_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn_dizi.add(btn_harf_m);
                harfler_dizi.add("M");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_a=findViewById(R.id.btn_2_2_a);
        btn_harf_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_a);
                harfler_dizi.add("A");
                harfler_txt.setText(harfler_dizi.toString());


            }
        });

        btn_harf_n=findViewById(R.id.btn_2_2_n);
        btn_harf_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_n);
                harfler_dizi.add("N");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_i=findViewById(R.id.btn_2_2_i);
        btn_harf_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_i);
                harfler_dizi.add("İ");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_2_2_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_m_x=btn_harf_m.getX();
                pos_m_y=btn_harf_m.getY();

                pos_a_x=btn_harf_a.getX();
                pos_a_y=btn_harf_a.getY();

                pos_n_x=btn_harf_n.getX();
                pos_n_y=btn_harf_n.getY();

                pos_i_x=btn_harf_i.getX();
                pos_i_y=btn_harf_i.getY();

                btn_harf_m.setX(pos_a_x);
                btn_harf_m.setY(pos_a_y);

                btn_harf_a.setX(pos_n_x);
                btn_harf_a.setY(pos_n_y);

                btn_harf_n.setX(pos_i_x);
                btn_harf_n.setY(pos_i_y);

                btn_harf_i.setX(pos_m_x);
                btn_harf_i.setY(pos_m_y);

            }
        });

        btn_sil=findViewById(R.id.btn_2_2_sil);
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

        btn_kontrol=findViewById(R.id.btn_2_2_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<3){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_i) == 0 && btn_dizi.indexOf(btn_harf_m) == 1 && btn_dizi.indexOf(btn_harf_a) == 2) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            mani_i.setText("İ");
                            ima_m.setText("M");
                            ima_a.setText("A");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_n) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_m) == 2) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            nam_n.setText("N");
                            mani_a.setText("A");
                            nam_m.setText("M");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==4) {
                    if (btn_dizi.indexOf(btn_harf_m) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_n) == 2 && btn_dizi.indexOf(btn_harf_i) == 3) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            mani_m.setText("M");
                            mani_a.setText("A");
                            mani_n.setText("N");
                            mani_i.setText("İ");
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
                    String seviye="Level 2_2";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2"))){
                        Intent level_iki=new Intent(Level_2_2.this,Level_2.class);
                        next_level_dizi.add(level_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_1"))){
                        Intent level_iki_bir=new Intent(Level_2_2.this,Level_2_1.class);
                        next_level_dizi.add(level_iki_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_3"))){
                        Intent level_iki_uc=new Intent(Level_2_2.this,Level_2_3.class);
                        next_level_dizi.add(level_iki_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_4"))){
                        Intent level_iki_dort=new Intent(Level_2_2.this,Level_2_4.class);
                        next_level_dizi.add(level_iki_dort);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_5"))){
                        Intent level_iki_bes=new Intent(Level_2_2.this,Level_2_5.class);
                        next_level_dizi.add(level_iki_bes);
                    }

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_2_2.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }

            }
        });

    }
}
