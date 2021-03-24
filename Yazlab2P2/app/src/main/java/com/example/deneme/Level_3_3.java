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

public class Level_3_3 extends AppCompatActivity {

    Button btn_harf_y;
    Button btn_harf_a;
    Button btn_harf_s;
    Button btn_harf_t;
    Button btn_harf_i;
    Button btn_harf_k;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_y_x,pos_y_y;
    float pos_a_x,pos_a_y;
    float pos_s_x,pos_s_y;
    float pos_t_x,pos_t_y;
    float pos_i_x,pos_i_y;
    float pos_k_x,pos_k_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView yastik_y,yastik_a,yastik_s,yastik_t,yastik_i,yastik_k;
    TextView yat_a,yat_t,sayi_a,sayi_y,sayi_kisa_i,kisa_kas_k,kas_a,kas_s,kisa_s,kisa_taki_a,taki_t,taki_k,taki_i;
    TextView kiyas_ayi_a,kiyas_k,kiyas_i,kiyas_y,kiyas_s,ayi_y;
    int puan=0;
    int i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0;
    String [] cevaplar=new String[8];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_3_3.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_3_3);

        chronometer = findViewById(R.id.chronometer_3_3);
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

        puan_txt=findViewById(R.id.txt_3_3_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_3_3_basilan_harfler);
        cevaplar[0]="KAS";
        cevaplar[1]="YAT";
        cevaplar[2]="AYI";
        cevaplar[3]="TAKI";
        cevaplar[4]="SAYI";
        cevaplar[5]="KISA";
        cevaplar[6]="KIYAS";
        cevaplar[7]="YASTIK";

        yastik_y=findViewById(R.id.txt_yastik_y);
        yastik_a=findViewById(R.id.txt_yastik_a);
        yastik_s=findViewById(R.id.txt_yastik_s);
        yastik_t=findViewById(R.id.txt_yastik_t);
        yastik_i=findViewById(R.id.txt_yastik_i);
        yastik_k=findViewById(R.id.txt_yastik_k);
        yat_a=findViewById(R.id.txt_yat_a);
        yat_t=findViewById(R.id.txt_yat_t);
        sayi_a=findViewById(R.id.txt_sayi_a);
        sayi_y=findViewById(R.id.txt_sayi_y);
        sayi_kisa_i=findViewById(R.id.txt_sayi_kisa_i);
        kisa_kas_k=findViewById(R.id.txt_kisa_kas_k);
        kas_a=findViewById(R.id.txt_kas_a);
        kas_s=findViewById(R.id.txt_kas_s);
        kisa_s=findViewById(R.id.txt_kisa_s);
        kisa_taki_a=findViewById(R.id.txt_kisa_taki_a);
        taki_t=findViewById(R.id.txt_taki_t);
        taki_k=findViewById(R.id.txt_taki_k);
        taki_i=findViewById(R.id.txt_taki_i);
        kiyas_ayi_a=findViewById(R.id.txt_kiyas_ayi_a);
        kiyas_k=findViewById(R.id.txt_kiyas_k);
        kiyas_i=findViewById(R.id.txt_kiyas_i);
        kiyas_y=findViewById(R.id.txt_kiyas_y);
        kiyas_s=findViewById(R.id.txt_kiyas_s);
        ayi_y=findViewById(R.id.txt_ayi_y);

        btn_harf_y=findViewById(R.id.btn_3_3_y);
        btn_harf_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_y);
                harfler_dizi.add("Y");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_a=findViewById(R.id.btn_3_3_a);
        btn_harf_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_a);
                harfler_dizi.add("A");
                harfler_txt.setText(harfler_dizi.toString());


            }
        });

        btn_harf_s=findViewById(R.id.btn_3_3_s);
        btn_harf_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_s);
                harfler_dizi.add("S");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_t=findViewById(R.id.btn_3_3_t);
        btn_harf_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_t);
                harfler_dizi.add("T");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_i=findViewById(R.id.btn_3_3_i);
        btn_harf_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_i);
                harfler_dizi.add("I");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_k=findViewById(R.id.btn_3_3_k);
        btn_harf_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_k);
                harfler_dizi.add("K");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_3_3_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_y_x=btn_harf_y.getX();
                pos_y_y=btn_harf_y.getY();

                pos_a_x=btn_harf_a.getX();
                pos_a_y=btn_harf_a.getY();

                pos_s_x=btn_harf_s.getX();
                pos_s_y=btn_harf_s.getY();

                pos_t_x=btn_harf_t.getX();
                pos_t_y=btn_harf_t.getY();

                pos_i_x=btn_harf_i.getX();
                pos_i_y=btn_harf_i.getY();

                pos_k_x=btn_harf_k.getX();
                pos_k_y=btn_harf_k.getY();

                btn_harf_y.setX(pos_a_x);
                btn_harf_y.setY(pos_a_y);

                btn_harf_a.setX(pos_s_x);
                btn_harf_a.setY(pos_s_y);

                btn_harf_s.setX(pos_t_x);
                btn_harf_s.setY(pos_t_y);

                btn_harf_t.setX(pos_i_x);
                btn_harf_t.setY(pos_i_y);

                btn_harf_i.setX(pos_k_x);
                btn_harf_i.setY(pos_k_y);

                btn_harf_k.setX(pos_y_x);
                btn_harf_k.setY(pos_y_y);

            }
        });

        btn_sil=findViewById(R.id.btn_3_3_sil);
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

        btn_kontrol=findViewById(R.id.btn_3_3_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<3){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_a) == 0 && btn_dizi.indexOf(btn_harf_y) == 1 && btn_dizi.indexOf(btn_harf_i) == 2) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            kiyas_ayi_a.setText("A");
                            ayi_y.setText("Y");
                            yastik_i.setText("I");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_y) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_t) == 2) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            yastik_y.setText("Y");
                            yat_a.setText("A");
                            yat_t.setText("T");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_k) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_s) == 2) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            kisa_kas_k.setText("K");
                            kas_a.setText("A");
                            kas_s.setText("S");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==4) {
                    if (btn_dizi.indexOf(btn_harf_t) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_k) == 2 && btn_dizi.indexOf(btn_harf_i) == 3) {
                        if (l == 0) {
                            cevaplar[3] = "";
                            puan += harfler_dizi.size() * 100;
                            l++;
                            taki_t.setText("T");
                            kisa_taki_a.setText("A");
                            taki_k.setText("K");
                            taki_i.setText("I");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_s) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_y) == 2&& btn_dizi.indexOf(btn_harf_i) == 3) {
                        if (m == 0) {
                            cevaplar[4] = "";
                            puan += harfler_dizi.size() * 100;
                            m++;
                            yastik_s.setText("S");
                            sayi_a.setText("A");
                            sayi_y.setText("Y");
                            sayi_kisa_i.setText("I");

                        }
                    }else if (btn_dizi.indexOf(btn_harf_k) == 0 && btn_dizi.indexOf(btn_harf_i) == 1 && btn_dizi.indexOf(btn_harf_s) == 2&& btn_dizi.indexOf(btn_harf_a) == 3) {
                        if (n == 0) {
                            cevaplar[5] = "";
                            puan += harfler_dizi.size() * 100;
                            n++;
                            kisa_kas_k.setText("K");
                            sayi_kisa_i.setText("I");
                            kisa_s.setText("S");
                            kisa_taki_a.setText("A");

                        }
                    }else{
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==5) {
                    if (btn_dizi.indexOf(btn_harf_k) == 0 && btn_dizi.indexOf(btn_harf_i) == 1 && btn_dizi.indexOf(btn_harf_y) == 2 && btn_dizi.indexOf(btn_harf_a) == 3&&btn_dizi.indexOf(btn_harf_s)==4) {
                        if (o == 0) {
                            cevaplar[6] = "";
                            puan += harfler_dizi.size() * 100;
                            o++;
                            kiyas_k.setText("K");
                            kiyas_i.setText("I");
                            kiyas_y.setText("Y");
                            kiyas_ayi_a.setText("A");
                            kiyas_s.setText("S");

                        }
                    }else{
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==6) {
                    if (btn_dizi.indexOf(btn_harf_y) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_s) == 2 && btn_dizi.indexOf(btn_harf_t) == 3&&btn_dizi.indexOf(btn_harf_i)==4&&btn_dizi.indexOf(btn_harf_k)==5) {
                        if (p == 0) {
                            cevaplar[7] = "";
                            puan += harfler_dizi.size() * 100;
                            p++;
                            yastik_y.setText("Y");
                            yastik_a.setText("A");
                            yastik_s.setText("S");
                            yastik_t.setText("T");
                            yastik_i.setText("I");
                            yastik_k.setText("K");
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

                if (cevaplar[0]==""&&cevaplar[1]==""&&cevaplar[2]==""&&cevaplar[3]==""&&cevaplar[4]==""&&cevaplar[5]==""&&cevaplar[6]==""&&cevaplar[7]==""){
                    String seviye="Level 3_3";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3"))){
                        Intent level_uc=new Intent(Level_3_3.this,Level_3.class);
                        next_level_dizi.add(level_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_1"))){
                        Intent level_uc_bir=new Intent(Level_3_3.this,Level_3_1.class);
                        next_level_dizi.add(level_uc_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_2"))){
                        Intent level_uc_iki=new Intent(Level_3_3.this,Level_3_2.class);
                        next_level_dizi.add(level_uc_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_4"))){
                        Intent level_uc_dort=new Intent(Level_3_3.this,Level_3_4.class);
                        next_level_dizi.add(level_uc_dort);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_5"))){
                        Intent level_uc_bes=new Intent(Level_3_3.this,Level_3_5.class);
                        next_level_dizi.add(level_uc_bes);
                    }

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_3_3.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }


            }
        });

    }
}
