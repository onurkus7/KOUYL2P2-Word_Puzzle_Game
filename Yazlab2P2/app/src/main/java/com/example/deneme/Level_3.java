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

public class Level_3 extends AppCompatActivity {

    Button btn_harf_b;
    Button btn_harf_a;
    Button btn_harf_l;
    Button btn_harf_i;
    Button btn_harf_k;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_b_x,pos_b_y;
    float pos_a_x,pos_a_y;
    float pos_l_x,pos_l_y;
    float pos_i_x,pos_i_y;
    float pos_k_x,pos_k_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView balik_b,balik_a,balik_l,balik_i,balik_k,bal_a,bal_l,bak_b,bak_a,bak_kal_k,kal_a,akil_a,akil_i,akil_kil_l,kil_k,kil_i;
    int puan=0;
    int i=0,j=0,k=0,l=0,m=0,n=0;
    String [] cevaplar=new String[6];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_3.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_3);

        chronometer = findViewById(R.id.chronometer_3);
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

        puan_txt=findViewById(R.id.txt_3_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_3_basilan_harfler);
        cevaplar[0]="BAK";
        cevaplar[1]="BAL";
        cevaplar[2]="KAL";
        cevaplar[3]="KIL";
        cevaplar[4]="AKIL";
        cevaplar[5]="BALIK";

        balik_b=findViewById(R.id.txt_balik_b);
        balik_a=findViewById(R.id.txt_balik_a);
        balik_l=findViewById(R.id.txt_balik_l);
        balik_i=findViewById(R.id.txt_balik_i);
        balik_k=findViewById(R.id.txt_balik_k);
        bal_a=findViewById(R.id.txt_bal_a);
        bal_l=findViewById(R.id.txt_bal_l);
        kal_a=findViewById(R.id.txt_kal_a);
        bak_kal_k=findViewById(R.id.txt_bak_kal_k);
        bak_a=findViewById(R.id.txt_bak_a);
        bak_b=findViewById(R.id.txt_bak_b);
        akil_a=findViewById(R.id.txt_akil_a);
        akil_i=findViewById(R.id.txt_akil_i);
        akil_kil_l=findViewById(R.id.txt_akil_kil_l);
        kil_i=findViewById(R.id.txt_kil_i);
        kil_k=findViewById(R.id.txt_kil_k);

        btn_harf_b=findViewById(R.id.btn_3_b);
        btn_harf_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_b);
                harfler_dizi.add("B");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_a=findViewById(R.id.btn_3_a);
        btn_harf_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_a);
                harfler_dizi.add("A");
                harfler_txt.setText(harfler_dizi.toString());


            }
        });

        btn_harf_l=findViewById(R.id.btn_3_l);
        btn_harf_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_l);
                harfler_dizi.add("L");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_i=findViewById(R.id.btn_3_i);
        btn_harf_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_i);
                harfler_dizi.add("I");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_k=findViewById(R.id.btn_3_k);
        btn_harf_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_k);
                harfler_dizi.add("K");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_3_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_b_x=btn_harf_b.getX();
                pos_b_y=btn_harf_b.getY();

                pos_a_x=btn_harf_a.getX();
                pos_a_y=btn_harf_a.getY();

                pos_l_x=btn_harf_l.getX();
                pos_l_y=btn_harf_l.getY();

                pos_i_x=btn_harf_i.getX();
                pos_i_y=btn_harf_i.getY();

                pos_k_x=btn_harf_k.getX();
                pos_k_y=btn_harf_k.getY();

                btn_harf_b.setX(pos_a_x);
                btn_harf_b.setY(pos_a_y);

                btn_harf_a.setX(pos_l_x);
                btn_harf_a.setY(pos_l_y);

                btn_harf_l.setX(pos_i_x);
                btn_harf_l.setY(pos_i_y);

                btn_harf_i.setX(pos_k_x);
                btn_harf_i.setY(pos_k_y);

                btn_harf_k.setX(pos_b_x);
                btn_harf_k.setY(pos_b_y);
            }
        });

        btn_sil=findViewById(R.id.btn_3_sil);
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

        btn_kontrol=findViewById(R.id.btn_3_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<3){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_k) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_l) == 2) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            bak_kal_k.setText("K");
                            kal_a.setText("A");
                            balik_l.setText("L");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_b) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_l) == 2) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            balik_b.setText("B");
                            bal_a.setText("A");
                            bal_l.setText("L");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_b) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_k) == 2) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            bak_b.setText("B");
                            bak_a.setText("A");
                            bak_kal_k.setText("K");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_k) == 0 && btn_dizi.indexOf(btn_harf_i) == 1 && btn_dizi.indexOf(btn_harf_l) == 2) {
                        if (l == 0) {
                            cevaplar[3] = "";
                            puan += harfler_dizi.size() * 100;
                            l++;
                            kil_k.setText("K");
                            kil_i.setText("I");
                            akil_kil_l.setText("L");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==4) {
                    if (btn_dizi.indexOf(btn_harf_a) == 0 && btn_dizi.indexOf(btn_harf_k) == 1 && btn_dizi.indexOf(btn_harf_i) == 2 && btn_dizi.indexOf(btn_harf_l) == 3) {
                        if (m == 0) {
                            cevaplar[4] = "";
                            puan += harfler_dizi.size() * 100;
                            m++;
                            akil_a.setText("A");
                            balik_k.setText("K");
                            akil_i.setText("I");
                            akil_kil_l.setText("L");
                        }
                    }else{
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==5) {
                    if (btn_dizi.indexOf(btn_harf_b) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_l) == 2 && btn_dizi.indexOf(btn_harf_i) == 3&&btn_dizi.indexOf(btn_harf_k)==4) {
                        if (n == 0) {
                            cevaplar[5] = "";
                            puan += harfler_dizi.size() * 100;
                            n++;
                            balik_b.setText("B");
                            balik_a.setText("A");
                            balik_l.setText("L");
                            balik_i.setText("I");
                            balik_k.setText("K");
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

                if (cevaplar[0]==""&&cevaplar[1]==""&&cevaplar[2]==""&&cevaplar[3]==""&&cevaplar[4]==""&&cevaplar[5]==""){
                    String seviye="Level 3";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_1"))){
                        Intent level_uc_bir=new Intent(Level_3.this,Level_3_1.class);
                        next_level_dizi.add(level_uc_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_2"))){
                        Intent level_uc_iki=new Intent(Level_3.this,Level_3_2.class);
                        next_level_dizi.add(level_uc_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_3"))){
                        Intent level_uc_uc=new Intent(Level_3.this,Level_3_3.class);
                        next_level_dizi.add(level_uc_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_4"))){
                        Intent level_uc_dort=new Intent(Level_3.this,Level_3_4.class);
                        next_level_dizi.add(level_uc_dort);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_5"))){
                        Intent level_uc_bes=new Intent(Level_3.this,Level_3_5.class);
                        next_level_dizi.add(level_uc_bes);
                    }

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_3.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }




            }
        });

    }
}