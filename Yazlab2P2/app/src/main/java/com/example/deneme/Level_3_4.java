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

public class Level_3_4 extends AppCompatActivity {

    Button btn_harf_t;
    Button btn_harf_a;
    Button btn_harf_k;
    Button btn_harf_v;
    Button btn_harf_i;
    Button btn_harf_m;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_t_x,pos_t_y;
    float pos_a_x,pos_a_y;
    float pos_k_x,pos_k_y;
    float pos_v_x,pos_v_y;
    float pos_i_x,pos_i_y;
    float pos_m_x,pos_m_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView takvim_t,takvim_a,takvim_k,takvim_v,takvim_i,takvim_m;
    TextView kat_k,kat_a,vakit_a,vakit_k,vakit_i,vakit_ait_t,ait_a,ait_i;
    TextView maki_m,maki_a,maki_k,mavi_akit_a,akit_k,akit_i,akit_mat_t,mat_m,mat_a,mavi_v,mavi_i;
    int puan=0;
    int i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0;
    String [] cevaplar=new String[8];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_3_4.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_3_4);

        chronometer = findViewById(R.id.chronometer_3_4);
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

        puan_txt=findViewById(R.id.txt_3_4_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_3_4_basilan_harfler);
        cevaplar[0]="KAT";
        cevaplar[1]="AİT";
        cevaplar[2]="MAT";
        cevaplar[3]="AKİT";
        cevaplar[4]="MAKİ";
        cevaplar[5]="MAVİ";
        cevaplar[6]="VAKİT";
        cevaplar[7]="TAKVİM";

        takvim_t=findViewById(R.id.txt_takvim_t);
        takvim_a=findViewById(R.id.txt_takvim_a);
        takvim_k=findViewById(R.id.txt_takvim_k);
        takvim_v=findViewById(R.id.txt_takvim_v);
        takvim_i=findViewById(R.id.txt_takvim_i);
        takvim_m=findViewById(R.id.txt_takvim_m);
        kat_a=findViewById(R.id.txt_kat_a);
        kat_k=findViewById(R.id.txt_kat_k);
        vakit_a=findViewById(R.id.txt_vakit_a);
        vakit_k=findViewById(R.id.txt_vakit_k);
        vakit_i=findViewById(R.id.txt_vakit_i);
        vakit_ait_t=findViewById(R.id.txt_vakit_ait_t);
        ait_a=findViewById(R.id.txt_ait_a);
        ait_i=findViewById(R.id.txt_ait_i);
        maki_m=findViewById(R.id.txt_maki_m);
        maki_a=findViewById(R.id.txt_maki_a);
        maki_k=findViewById(R.id.txt_maki_k);
        mavi_akit_a=findViewById(R.id.txt_mavi_akit_a);
        mavi_v=findViewById(R.id.txt_mavi_v);
        mavi_i=findViewById(R.id.txt_mavi_i);
        akit_k=findViewById(R.id.txt_akit_k);
        akit_i=findViewById(R.id.txt_akit_i);
        akit_mat_t=findViewById(R.id.txt_akit_mat_t);
        mat_m=findViewById(R.id.txt_mat_m);
        mat_a=findViewById(R.id.txt_mat_a);


        btn_harf_t=findViewById(R.id.btn_3_4_t);
        btn_harf_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_t);
                harfler_dizi.add("T");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_a=findViewById(R.id.btn_3_4_a);
        btn_harf_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_a);
                harfler_dizi.add("A");
                harfler_txt.setText(harfler_dizi.toString());


            }
        });

        btn_harf_k=findViewById(R.id.btn_3_4_k);
        btn_harf_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_k);
                harfler_dizi.add("K");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_v=findViewById(R.id.btn_3_4_v);
        btn_harf_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_v);
                harfler_dizi.add("V");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_i=findViewById(R.id.btn_3_4_i);
        btn_harf_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_i);
                harfler_dizi.add("İ");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_m=findViewById(R.id.btn_3_4_m);
        btn_harf_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_m);
                harfler_dizi.add("M");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_3_4_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_t_x=btn_harf_t.getX();
                pos_t_y=btn_harf_t.getY();

                pos_a_x=btn_harf_a.getX();
                pos_a_y=btn_harf_a.getY();

                pos_k_x=btn_harf_k.getX();
                pos_k_y=btn_harf_k.getY();

                pos_v_x=btn_harf_v.getX();
                pos_v_y=btn_harf_v.getY();

                pos_i_x=btn_harf_i.getX();
                pos_i_y=btn_harf_i.getY();

                pos_m_x=btn_harf_m.getX();
                pos_m_y=btn_harf_m.getY();

                btn_harf_t.setX(pos_a_x);
                btn_harf_t.setY(pos_a_y);

                btn_harf_a.setX(pos_k_x);
                btn_harf_a.setY(pos_k_y);

                btn_harf_k.setX(pos_v_x);
                btn_harf_k.setY(pos_v_y);

                btn_harf_v.setX(pos_i_x);
                btn_harf_v.setY(pos_i_y);

                btn_harf_i.setX(pos_m_x);
                btn_harf_i.setY(pos_m_y);

                btn_harf_m.setX(pos_t_x);
                btn_harf_m.setY(pos_t_y);

            }
        });

        btn_sil=findViewById(R.id.btn_3_4_sil);
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

        btn_kontrol=findViewById(R.id.btn_3_4_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<3){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_m) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_t) == 2) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            mat_m.setText("M");
                            mat_a.setText("A");
                            akit_mat_t.setText("T");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_a) == 0 && btn_dizi.indexOf(btn_harf_i) == 1 && btn_dizi.indexOf(btn_harf_t) == 2) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            ait_a.setText("A");
                            ait_i.setText("İ");
                            vakit_ait_t.setText("T");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_k) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_t) == 2) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            kat_k.setText("K");
                            kat_a.setText("A");
                            takvim_t.setText("T");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==4) {
                    if (btn_dizi.indexOf(btn_harf_a) == 0 && btn_dizi.indexOf(btn_harf_k) == 1 && btn_dizi.indexOf(btn_harf_i) == 2 && btn_dizi.indexOf(btn_harf_t) == 3) {
                        if (l == 0) {
                            cevaplar[3] = "";
                            puan += harfler_dizi.size() * 100;
                            l++;
                            mavi_akit_a.setText("A");
                            akit_k.setText("K");
                            akit_i.setText("İ");
                            akit_mat_t.setText("T");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_m) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_k) == 2&& btn_dizi.indexOf(btn_harf_i) == 3) {
                        if (m == 0) {
                            cevaplar[4] = "";
                            puan += harfler_dizi.size() * 100;
                            m++;
                            maki_m.setText("M");
                            maki_a.setText("A");
                            maki_k.setText("K");
                            takvim_i.setText("İ");
                        }
                    }else if (btn_dizi.indexOf(btn_harf_m) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_v) == 2&& btn_dizi.indexOf(btn_harf_i) == 3) {
                        if (n == 0) {
                            cevaplar[5] = "";
                            puan += harfler_dizi.size() * 100;
                            n++;
                            takvim_m.setText("M");
                            mavi_akit_a.setText("A");
                            mavi_v.setText("V");
                            mavi_i.setText("İ");
                        }
                    }else{
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==5) {
                    if (btn_dizi.indexOf(btn_harf_v) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_k) == 2 && btn_dizi.indexOf(btn_harf_i) == 3&&btn_dizi.indexOf(btn_harf_t)==4) {
                        if (o == 0) {
                            cevaplar[6] = "";
                            puan += harfler_dizi.size() * 100;
                            o++;
                            takvim_v.setText("V");
                            vakit_a.setText("A");
                            vakit_k.setText("K");
                            vakit_i.setText("İ");
                            vakit_ait_t.setText("T");
                        }
                    }else{
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==6) {
                    if (btn_dizi.indexOf(btn_harf_t) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_k) == 2 && btn_dizi.indexOf(btn_harf_v) == 3&&btn_dizi.indexOf(btn_harf_i)==4&&btn_dizi.indexOf(btn_harf_m)==5) {
                        if (p == 0) {
                            cevaplar[7] = "";
                            puan += harfler_dizi.size() * 100;
                            p++;
                            takvim_t.setText("T");
                            takvim_a.setText("A");
                            takvim_k.setText("K");
                            takvim_v.setText("V");
                            takvim_i.setText("İ");
                            takvim_m.setText("M");
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
                    String seviye="Level 3_4";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3"))){
                        Intent level_uc=new Intent(Level_3_4.this,Level_3.class);
                        next_level_dizi.add(level_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_1"))){
                        Intent level_uc_bir=new Intent(Level_3_4.this,Level_3_1.class);
                        next_level_dizi.add(level_uc_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_2"))){
                        Intent level_uc_iki=new Intent(Level_3_4.this,Level_3_2.class);
                        next_level_dizi.add(level_uc_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_3"))){
                        Intent level_uc_uc=new Intent(Level_3_4.this,Level_3_3.class);
                        next_level_dizi.add(level_uc_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_5"))){
                        Intent level_uc_bes=new Intent(Level_3_4.this,Level_3_5.class);
                        next_level_dizi.add(level_uc_bes);
                    }

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_3_4.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }


            }
        });

    }
}
