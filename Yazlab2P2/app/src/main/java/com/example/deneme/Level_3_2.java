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

public class Level_3_2 extends AppCompatActivity {

    Button btn_harf_r;
    Button btn_harf_e;
    Button btn_harf_s;
    Button btn_harf_i;
    Button btn_harf_m;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_r_x,pos_r_y;
    float pos_e_x,pos_e_y;
    float pos_s_x,pos_s_y;
    float pos_i_x,pos_i_y;
    float pos_m_x,pos_m_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView resim_r,resim_e,resim_s,resim_i,resim_m,emir_e,emir_m,emir_i,sim_i,sim_m,mis_i,seri_mis_s,seri_e,seri_ser_r,seri_i,ser_s,ser_e;
    int puan=0;
    int i=0,j=0,k=0,l=0,m=0,n=0;
    String [] cevaplar=new String[6];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_3_2.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_3_2);

        chronometer = findViewById(R.id.chronometer_3_2);
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

        puan_txt=findViewById(R.id.txt_3_2_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_3_2_basilan_harfler);
        cevaplar[0]="SİM";
        cevaplar[1]="SER";
        cevaplar[2]="MİS";
        cevaplar[3]="SERİ";
        cevaplar[4]="EMİR";
        cevaplar[5]="RESİM";

        resim_r=findViewById(R.id.txt_resim_r);
        resim_e=findViewById(R.id.txt_resim_e);
        resim_s=findViewById(R.id.txt_resim_s);
        resim_i=findViewById(R.id.txt_resim_i);
        resim_m=findViewById(R.id.txt_resim_m);
        emir_e=findViewById(R.id.txt_emir_e);
        emir_m=findViewById(R.id.txt_emir_m);
        emir_i=findViewById(R.id.txt_emir_i);
        sim_i=findViewById(R.id.txt_sim_i);
        sim_m=findViewById(R.id.txt_sim_m);
        mis_i=findViewById(R.id.txt_mis_i);
        seri_mis_s=findViewById(R.id.txt_seri_mis_s);
        seri_e=findViewById(R.id.txt_seri_e);
        seri_ser_r=findViewById(R.id.txt_seri_ser_r);
        seri_i=findViewById(R.id.txt_seri_i);
        ser_s=findViewById(R.id.txt_ser_s);
        ser_e=findViewById(R.id.txt_ser_e);

        btn_harf_r=findViewById(R.id.btn_3_2_r);
        btn_harf_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_r);
                harfler_dizi.add("R");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_e=findViewById(R.id.btn_3_2_e);
        btn_harf_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_e);
                harfler_dizi.add("E");
                harfler_txt.setText(harfler_dizi.toString());


            }
        });

        btn_harf_s=findViewById(R.id.btn_3_2_s);
        btn_harf_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_s);
                harfler_dizi.add("S");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_i=findViewById(R.id.btn_3_2_i);
        btn_harf_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_i);
                harfler_dizi.add("İ");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_m=findViewById(R.id.btn_3_2_m);
        btn_harf_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_m);
                harfler_dizi.add("M");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_3_2_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_r_x=btn_harf_r.getX();
                pos_r_y=btn_harf_r.getY();

                pos_e_x=btn_harf_e.getX();
                pos_e_y=btn_harf_e.getY();

                pos_s_x=btn_harf_s.getX();
                pos_s_y=btn_harf_s.getY();

                pos_i_x=btn_harf_i.getX();
                pos_i_y=btn_harf_i.getY();

                pos_m_x=btn_harf_m.getX();
                pos_m_y=btn_harf_m.getY();

                btn_harf_r.setX(pos_e_x);
                btn_harf_r.setY(pos_e_y);

                btn_harf_e.setX(pos_s_x);
                btn_harf_e.setY(pos_s_y);

                btn_harf_s.setX(pos_i_x);
                btn_harf_s.setY(pos_i_y);

                btn_harf_i.setX(pos_m_x);
                btn_harf_i.setY(pos_m_y);

                btn_harf_m.setX(pos_r_x);
                btn_harf_m.setY(pos_r_y);

            }
        });

        btn_sil=findViewById(R.id.btn_3_2_sil);
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

        btn_kontrol=findViewById(R.id.btn_3_2_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<3){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_m) == 0 && btn_dizi.indexOf(btn_harf_i) == 1 && btn_dizi.indexOf(btn_harf_s) == 2) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            resim_m.setText("M");
                            mis_i.setText("İ");
                            seri_mis_s.setText("S");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_s) == 0 && btn_dizi.indexOf(btn_harf_e) == 1 && btn_dizi.indexOf(btn_harf_r) == 2) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            ser_s.setText("S");
                            ser_e.setText("E");
                            seri_ser_r.setText("R");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_s) == 0 && btn_dizi.indexOf(btn_harf_i) == 1 && btn_dizi.indexOf(btn_harf_m) == 2) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            resim_s.setText("S");
                            sim_i.setText("İ");
                            sim_m.setText("M");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==4) {
                    if (btn_dizi.indexOf(btn_harf_s) == 0 && btn_dizi.indexOf(btn_harf_e) == 1 && btn_dizi.indexOf(btn_harf_r) == 2 && btn_dizi.indexOf(btn_harf_i) == 3) {
                        if (m == 0) {
                            cevaplar[3] = "";
                            puan += harfler_dizi.size() * 100;
                            m++;
                            seri_mis_s.setText("S");
                            seri_e.setText("E");
                            seri_ser_r.setText("R");
                            seri_i.setText("İ");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_e) == 0 && btn_dizi.indexOf(btn_harf_m) == 1 && btn_dizi.indexOf(btn_harf_i) == 2&&btn_dizi.indexOf(btn_harf_r) == 3) {
                        if (l == 0) {
                            cevaplar[4] = "";
                            puan += harfler_dizi.size() * 100;
                            l++;
                            emir_e.setText("E");
                            emir_m.setText("M");
                            emir_i.setText("İ");
                            resim_r.setText("R");
                        }
                    }else{
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==5) {
                    if (btn_dizi.indexOf(btn_harf_r) == 0 && btn_dizi.indexOf(btn_harf_e) == 1 && btn_dizi.indexOf(btn_harf_s) == 2 && btn_dizi.indexOf(btn_harf_i) == 3&&btn_dizi.indexOf(btn_harf_m)==4) {
                        if (n == 0) {
                            cevaplar[5] = "";
                            puan += harfler_dizi.size() * 100;
                            n++;
                            resim_r.setText("R");
                            resim_e.setText("E");
                            resim_s.setText("S");
                            resim_i.setText("İ");
                            resim_m.setText("M");
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
                    String seviye="Level 3_2";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3"))){
                        Intent level_uc=new Intent(Level_3_2.this,Level_3.class);
                        next_level_dizi.add(level_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_1"))){
                        Intent level_uc_bir=new Intent(Level_3_2.this,Level_3_1.class);
                        next_level_dizi.add(level_uc_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_3"))){
                        Intent level_uc_uc=new Intent(Level_3_2.this,Level_3_3.class);
                        next_level_dizi.add(level_uc_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_4"))){
                        Intent level_uc_dort=new Intent(Level_3_2.this,Level_3_4.class);
                        next_level_dizi.add(level_uc_dort);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_5"))){
                        Intent level_uc_bes=new Intent(Level_3_2.this,Level_3_5.class);
                        next_level_dizi.add(level_uc_bes);
                    }

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_3_2.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }




            }
        });

    }
}
