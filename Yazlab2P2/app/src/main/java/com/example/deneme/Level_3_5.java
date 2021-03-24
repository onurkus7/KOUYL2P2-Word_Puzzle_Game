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

public class Level_3_5 extends AppCompatActivity {

    Button btn_harf_m;
    Button btn_harf_a;
    Button btn_harf_s;
    Button btn_harf_u;
    Button btn_harf_i;
    Button btn_harf_r;
    Button btn_harf_h;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_m_x,pos_m_y;
    float pos_a_x,pos_a_y;
    float pos_s_x,pos_s_y;
    float pos_u_x,pos_u_y;
    float pos_i_x,pos_i_y;
    float pos_r_x,pos_r_y;
    float pos_h_x,pos_h_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView muhasir_m,muhasir_u,muhasir_h,muhasir_a,muhasir_s,muhasir_i,muhasir_r;
    TextView mahsur_a,mahsur_hurma_h,hurma_u,hurma_r,hurma_m,hurma_a,mahsur_s,mahsur_u,mahsur_ruh_r,ruh_u,ruh_h;
    TextView sahur_mars_s,mars_m,mars_r,mars_ham_a,ham_h,ham_m,sahur_a,sahur_ahir_h,ahir_a,ahir_i,ahir_sira_r,sira_s,sira_i,sira_a,sahur_u;
    int puan=0;
    int i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,r=0;
    String [] cevaplar=new String[9];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_3_5.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_3_5);

        chronometer = findViewById(R.id.chronometer_3_5);
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

        puan_txt=findViewById(R.id.txt_3_5_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_3_5_basilan_harfler);
        cevaplar[0]="RUH";
        cevaplar[1]="HAM";
        cevaplar[2]="SIRA";
        cevaplar[3]="AHIR";
        cevaplar[4]="MARS";
        cevaplar[5]="SAHUR";
        cevaplar[6]="HURMA";
        cevaplar[7]="MAHSUR";
        cevaplar[8]="MUHASIR";

        muhasir_m=findViewById(R.id.txt_muhasir_m);
        muhasir_u=findViewById(R.id.txt_muhasir_u);
        muhasir_h=findViewById(R.id.txt_muhasir_h);
        muhasir_a=findViewById(R.id.txt_muhasir_a);
        muhasir_s=findViewById(R.id.txt_muhasir_s);
        muhasir_i=findViewById(R.id.txt_muhasir_i);
        muhasir_r=findViewById(R.id.txt_muhasir_r);
        mahsur_a=findViewById(R.id.txt_mahsur_a);
        mahsur_hurma_h=findViewById(R.id.txt_mahsur_hurma_h);
        hurma_u=findViewById(R.id.txt_hurma_u);
        hurma_r=findViewById(R.id.txt_hurma_r);
        hurma_m=findViewById(R.id.txt_hurma_m);
        hurma_a=findViewById(R.id.txt_hurma_a);
        mahsur_s=findViewById(R.id.txt_mahsur_s);
        mahsur_u=findViewById(R.id.txt_mahsur_u);
        mahsur_ruh_r=findViewById(R.id.txt_mahsur_ruh_r);
        ruh_u=findViewById(R.id.txt_ruh_u);
        ruh_h=findViewById(R.id.txt_ruh_h);
        sahur_mars_s=findViewById(R.id.txt_sahur_mars_s);
        mars_m=findViewById(R.id.txt_mars_m);
        mars_ham_a=findViewById(R.id.txt_mars_ham_a);
        ham_h=findViewById(R.id.txt_ham_h);
        ham_m=findViewById(R.id.txt_ham_m);
        mars_r=findViewById(R.id.txt_mars_r);
        sahur_a=findViewById(R.id.txt_sahur_a);
        sahur_ahir_h=findViewById(R.id.txt_sahur_ahir_h);
        ahir_a=findViewById(R.id.txt_ahir_a);
        ahir_i=findViewById(R.id.txt_ahir_i);
        ahir_sira_r=findViewById(R.id.txt_ahir_sira_r);
        sira_s=findViewById(R.id.txt_sira_s);
        sira_i=findViewById(R.id.txt_sira_i);
        sira_a=findViewById(R.id.txt_sira_a);
        sahur_u=findViewById(R.id.txt_sahur_u);


        btn_harf_m=findViewById(R.id.btn_3_5_m);
        btn_harf_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_m);
                harfler_dizi.add("M");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_a=findViewById(R.id.btn_3_5_a);
        btn_harf_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_a);
                harfler_dizi.add("A");
                harfler_txt.setText(harfler_dizi.toString());


            }
        });

        btn_harf_s=findViewById(R.id.btn_3_5_s);
        btn_harf_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_s);
                harfler_dizi.add("S");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_u=findViewById(R.id.btn_3_5_u);
        btn_harf_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_u);
                harfler_dizi.add("U");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_i=findViewById(R.id.btn_3_5_i);
        btn_harf_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_i);
                harfler_dizi.add("I");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_r=findViewById(R.id.btn_3_5_r);
        btn_harf_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_r);
                harfler_dizi.add("R");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_h=findViewById(R.id.btn_3_5_h);
        btn_harf_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_h);
                harfler_dizi.add("H");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_3_5_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_m_x=btn_harf_m.getX();
                pos_m_y=btn_harf_m.getY();

                pos_a_x=btn_harf_a.getX();
                pos_a_y=btn_harf_a.getY();

                pos_s_x=btn_harf_s.getX();
                pos_s_y=btn_harf_s.getY();

                pos_u_x=btn_harf_u.getX();
                pos_u_y=btn_harf_u.getY();

                pos_i_x=btn_harf_i.getX();
                pos_i_y=btn_harf_i.getY();

                pos_r_x=btn_harf_r.getX();
                pos_r_y=btn_harf_r.getY();

                pos_h_x=btn_harf_h.getX();
                pos_h_y=btn_harf_h.getY();

                btn_harf_m.setX(pos_a_x);
                btn_harf_m.setY(pos_a_y);

                btn_harf_a.setX(pos_s_x);
                btn_harf_a.setY(pos_s_y);

                btn_harf_s.setX(pos_u_x);
                btn_harf_s.setY(pos_u_y);

                btn_harf_u.setX(pos_i_x);
                btn_harf_u.setY(pos_i_y);

                btn_harf_i.setX(pos_r_x);
                btn_harf_i.setY(pos_r_y);

                btn_harf_r.setX(pos_h_x);
                btn_harf_r.setY(pos_h_y);

                btn_harf_h.setX(pos_m_x);
                btn_harf_h.setY(pos_m_y);

            }
        });

        btn_sil=findViewById(R.id.btn_3_5_sil);
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

        btn_kontrol=findViewById(R.id.btn_3_5_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<3){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_r) == 0 && btn_dizi.indexOf(btn_harf_u) == 1 && btn_dizi.indexOf(btn_harf_h) == 2) {
                        if (i == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            mahsur_ruh_r.setText("R");
                            ruh_u.setText("U");
                            ruh_h.setText("H");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_h) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_m) == 2) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            ham_h.setText("H");
                            mars_ham_a.setText("A");
                            ham_m.setText("M");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==4) {
                    if (btn_dizi.indexOf(btn_harf_s) == 0 && btn_dizi.indexOf(btn_harf_i) == 1 && btn_dizi.indexOf(btn_harf_r) == 2 && btn_dizi.indexOf(btn_harf_a) == 3) {
                        if (k == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            sira_s.setText("S");
                            sira_i.setText("I");
                            ahir_sira_r.setText("R");
                            sira_a.setText("A");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_a) == 0 && btn_dizi.indexOf(btn_harf_h) == 1 && btn_dizi.indexOf(btn_harf_i) == 2&& btn_dizi.indexOf(btn_harf_r) == 3) {
                        if (l == 0) {
                            cevaplar[3] = "";
                            puan += harfler_dizi.size() * 100;
                            l++;
                            ahir_a.setText("A");
                            sahur_ahir_h.setText("H");
                            ahir_i.setText("I");
                            ahir_sira_r.setText("R");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_m) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_r) == 2&& btn_dizi.indexOf(btn_harf_s) == 3) {
                        if (m == 0) {
                            cevaplar[4] = "";
                            puan += harfler_dizi.size() * 100;
                            m++;
                            mars_m.setText("M");
                            mars_ham_a.setText("A");
                            mars_r.setText("R");
                            sahur_mars_s.setText("S");
                        }
                    }else{
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==5) {
                    if (btn_dizi.indexOf(btn_harf_s) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_h) == 2 && btn_dizi.indexOf(btn_harf_u) == 3&&btn_dizi.indexOf(btn_harf_r)==4) {
                        if (n == 0) {
                            cevaplar[5] = "";
                            puan += harfler_dizi.size() * 100;
                            n++;
                            sahur_mars_s.setText("S");
                            sahur_a.setText("A");
                            sahur_ahir_h.setText("H");
                            sahur_u.setText("U");
                            muhasir_r.setText("R");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_h) == 0 && btn_dizi.indexOf(btn_harf_u) == 1 && btn_dizi.indexOf(btn_harf_r) == 2&& btn_dizi.indexOf(btn_harf_m) == 3&&btn_dizi.indexOf(btn_harf_a)==4) {
                        if (o == 0) {
                            cevaplar[6] = "";
                            puan += harfler_dizi.size() * 100;
                            o++;
                            mahsur_hurma_h.setText("H");
                            hurma_u.setText("U");
                            hurma_r.setText("R");
                            hurma_m.setText("M");
                            hurma_a.setText("A");
                        }
                    }else{
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==6) {
                    if (btn_dizi.indexOf(btn_harf_m) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_h) == 2 && btn_dizi.indexOf(btn_harf_s) == 3&&btn_dizi.indexOf(btn_harf_u)==4&&btn_dizi.indexOf(btn_harf_r)==5) {
                        if (p == 0) {
                            cevaplar[7] = "";
                            puan += harfler_dizi.size() * 100;
                            p++;
                            muhasir_m.setText("M");
                            mahsur_a.setText("A");
                            mahsur_hurma_h.setText("H");
                            mahsur_s.setText("S");
                            mahsur_u.setText("U");
                            mahsur_ruh_r.setText("R");
                        }
                    }else{
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==7) {
                    if (btn_dizi.indexOf(btn_harf_m) == 0 && btn_dizi.indexOf(btn_harf_u) == 1 && btn_dizi.indexOf(btn_harf_h) == 2 && btn_dizi.indexOf(btn_harf_a) == 3&&btn_dizi.indexOf(btn_harf_s)==4&&btn_dizi.indexOf(btn_harf_i)==5&&btn_dizi.indexOf(btn_harf_r)==6) {
                        if (r == 0) {
                            cevaplar[8] = "";
                            puan += harfler_dizi.size() * 100;
                            r++;
                            muhasir_m.setText("M");
                            muhasir_u.setText("U");
                            muhasir_h.setText("H");
                            muhasir_a.setText("A");
                            muhasir_s.setText("S");
                            muhasir_i.setText("I");
                            muhasir_r.setText("R");
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

                if (cevaplar[0]==""&&cevaplar[1]==""&&cevaplar[2]==""&&cevaplar[3]==""&&cevaplar[4]==""&&cevaplar[5]==""&&cevaplar[6]==""&&cevaplar[7]==""&&cevaplar[8]==""){
                    String seviye="Level 3_5";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3"))){
                        Intent level_uc=new Intent(Level_3_5.this,Level_3.class);
                        level_uc.putExtra("puan_3_5",puan);
                        next_level_dizi.add(level_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_1"))){
                        Intent level_uc_bir=new Intent(Level_3_5.this,Level_3_1.class);
                        next_level_dizi.add(level_uc_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_2"))){
                        Intent level_uc_iki=new Intent(Level_3_5.this,Level_3_2.class);
                        next_level_dizi.add(level_uc_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_3"))){
                        Intent level_uc_uc=new Intent(Level_3_5.this,Level_3_3.class);
                        next_level_dizi.add(level_uc_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_4"))){
                        Intent level_uc_dort=new Intent(Level_3_5.this,Level_3_4.class);
                        next_level_dizi.add(level_uc_dort);
                    }

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_3_5.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }


            }
        });

    }
}
