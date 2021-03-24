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

public class Level_3_1 extends AppCompatActivity {

    Button btn_harf_t;
    Button btn_harf_e;
    Button btn_harf_r;
    Button btn_harf_a;
    Button btn_harf_s;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_t_x,pos_t_y;
    float pos_e_x,pos_e_y;
    float pos_r_x,pos_r_y;
    float pos_a_x,pos_a_y;
    float pos_s_x,pos_s_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView teras_t,teras_e,teras_r,teras_a,teras_s,tas_a,tas_s,set_e,ret_e,ret_t,sera_s,sera_e,sera_r,ter_t,ter_r;
    int puan=0;
    int i=0,j=0,k=0,l=0,m=0,n=0;
    String [] cevaplar=new String[6];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_3_1.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_3_1);

        chronometer = findViewById(R.id.chronometer_3_1);
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

        puan_txt=findViewById(R.id.txt_3_1_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_3_1_basilan_harfler);
        cevaplar[0]="SET";
        cevaplar[1]="RET";
        cevaplar[2]="TAS";
        cevaplar[3]="TER";
        cevaplar[4]="SERA";
        cevaplar[5]="TERAS";

        teras_t=findViewById(R.id.txt_teras_t);
        teras_e=findViewById(R.id.txt_teras_e);
        teras_r=findViewById(R.id.txt_teras_r);
        teras_a=findViewById(R.id.txt_teras_a);
        teras_s=findViewById(R.id.txt_teras_s);
        tas_a=findViewById(R.id.txt_tas_a);
        tas_s=findViewById(R.id.txt_tas_s);
        ret_e=findViewById(R.id.txt_ret_e);
        ret_t=findViewById(R.id.txt_ret_t);
        set_e=findViewById(R.id.txt_set_e);
        sera_s=findViewById(R.id.txt_sera_s);
        sera_e=findViewById(R.id.txt_sera_e);
        sera_r=findViewById(R.id.txt_sera_r);
        ter_t=findViewById(R.id.txt_ter_t);
        ter_r=findViewById(R.id.txt_ter_r);

        btn_harf_t=findViewById(R.id.btn_3_1_t);
        btn_harf_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_t);
                harfler_dizi.add("T");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_e=findViewById(R.id.btn_3_1_e);
        btn_harf_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_e);
                harfler_dizi.add("E");
                harfler_txt.setText(harfler_dizi.toString());


            }
        });

        btn_harf_r=findViewById(R.id.btn_3_1_r);
        btn_harf_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_r);
                harfler_dizi.add("R");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_a=findViewById(R.id.btn_3_1_a);
        btn_harf_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_a);
                harfler_dizi.add("A");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_s=findViewById(R.id.btn_3_1_s);
        btn_harf_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_s);
                harfler_dizi.add("S");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_3_1_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_t_x=btn_harf_t.getX();
                pos_t_y=btn_harf_t.getY();

                pos_e_x=btn_harf_e.getX();
                pos_e_y=btn_harf_e.getY();

                pos_r_x=btn_harf_r.getX();
                pos_r_y=btn_harf_r.getY();

                pos_a_x=btn_harf_a.getX();
                pos_a_y=btn_harf_a.getY();

                pos_s_x=btn_harf_s.getX();
                pos_s_y=btn_harf_s.getY();

                btn_harf_t.setX(pos_e_x);
                btn_harf_t.setY(pos_e_y);

                btn_harf_e.setX(pos_r_x);
                btn_harf_e.setY(pos_r_y);

                btn_harf_r.setX(pos_a_x);
                btn_harf_r.setY(pos_a_y);

                btn_harf_a.setX(pos_s_x);
                btn_harf_a.setY(pos_s_y);

                btn_harf_s.setX(pos_t_x);
                btn_harf_s.setY(pos_t_y);

            }
        });

        btn_sil=findViewById(R.id.btn_3_1_sil);
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

        btn_kontrol=findViewById(R.id.btn_3_1_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<3){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_t) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_s) == 2) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            teras_t.setText("T");
                            tas_a.setText("A");
                            tas_s.setText("S");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_r) == 0 && btn_dizi.indexOf(btn_harf_e) == 1 && btn_dizi.indexOf(btn_harf_t) == 2) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            teras_r.setText("R");
                            ret_e.setText("E");
                            ret_t.setText("T");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_s) == 0 && btn_dizi.indexOf(btn_harf_e) == 1 && btn_dizi.indexOf(btn_harf_t) == 2) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            tas_s.setText("S");
                            set_e.setText("E");
                            ret_t.setText("T");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_t) == 0 && btn_dizi.indexOf(btn_harf_e) == 1 && btn_dizi.indexOf(btn_harf_r) == 2) {
                        if (l == 0) {
                            cevaplar[3] = "";
                            puan += harfler_dizi.size() * 100;
                            l++;
                            ter_t.setText("T");
                            sera_e.setText("E");
                            ter_r.setText("R");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==4) {
                    if (btn_dizi.indexOf(btn_harf_s) == 0 && btn_dizi.indexOf(btn_harf_e) == 1 && btn_dizi.indexOf(btn_harf_r) == 2 && btn_dizi.indexOf(btn_harf_a) == 3) {
                        if (m == 0) {
                            cevaplar[4] = "";
                            puan += harfler_dizi.size() * 100;
                            m++;
                            sera_s.setText("S");
                            sera_e.setText("E");
                            sera_r.setText("R");
                            teras_a.setText("A");
                        }
                    }else{
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==5) {
                    if (btn_dizi.indexOf(btn_harf_t) == 0 && btn_dizi.indexOf(btn_harf_e) == 1 && btn_dizi.indexOf(btn_harf_r) == 2 && btn_dizi.indexOf(btn_harf_a) == 3&&btn_dizi.indexOf(btn_harf_s)==4) {
                        if (n == 0) {
                            cevaplar[5] = "";
                            puan += harfler_dizi.size() * 100;
                            n++;
                            teras_t.setText("T");
                            teras_e.setText("E");
                            teras_r.setText("R");
                            teras_a.setText("A");
                            teras_s.setText("S");
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
                    String seviye="Level 3_1";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3"))){
                        Intent level_uc=new Intent(Level_3_1.this,Level_3.class);
                        next_level_dizi.add(level_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_2"))){
                        Intent level_uc_iki=new Intent(Level_3_1.this,Level_3_2.class);
                        next_level_dizi.add(level_uc_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_3"))){
                        Intent level_uc_uc=new Intent(Level_3_1.this,Level_3_3.class);
                        next_level_dizi.add(level_uc_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_4"))){
                        Intent level_uc_dort=new Intent(Level_3_1.this,Level_3_4.class);
                        next_level_dizi.add(level_uc_dort);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_5"))){
                        Intent level_uc_bes=new Intent(Level_3_1.this,Level_3_5.class);
                        next_level_dizi.add(level_uc_bes);
                    }

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_3_1.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }

            }
        });

    }
}
