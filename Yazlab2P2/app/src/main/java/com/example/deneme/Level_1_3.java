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

public class Level_1_3 extends AppCompatActivity {

    Button btn_harf_n;
    Button btn_harf_l;
    Button btn_harf_a;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_n_x,pos_n_y;
    float pos_l_x,pos_l_y;
    float pos_a_x,pos_a_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView nal_n,nal_a,nal_l,al_a,an_a;
    int puan=0;
    int i=0,j=0,k=0;
    String [] cevaplar=new String[3];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_1_3.this);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_1_3);

        chronometer=findViewById(R.id.chronometer_1_3);
        chronometer.start();

        new CountDownTimer(30000,1000){
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                puan-=10;
                puan_txt.setText(""+puan);
            }
        }.start();

        puan_txt=findViewById(R.id.txt_1_3_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_1_3_basilan_harfler);
        cevaplar[0]="NAL";
        cevaplar[1]="AL";
        cevaplar[2]="AN";

        nal_n=findViewById(R.id.txt_nal_n);
        nal_a=findViewById(R.id.txt_nal_a);
        nal_l=findViewById(R.id.txt_nal_l);
        al_a=findViewById(R.id.txt_al_a);
        an_a=findViewById(R.id.txt_an_a);

        btn_harf_n=findViewById(R.id.btn_1_3_n);
        btn_harf_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_n);
                harfler_dizi.add("N");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_l=findViewById(R.id.btn_1_3_l);
        btn_harf_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_l);
                harfler_dizi.add("L");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_a=findViewById(R.id.btn_1_3_a);
        btn_harf_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_a);
                harfler_dizi.add("A");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_1_3_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_n_x=btn_harf_n.getX();
                pos_n_y=btn_harf_n.getY();

                pos_l_x=btn_harf_l.getX();
                pos_l_y=btn_harf_l.getY();

                pos_a_x=btn_harf_a.getX();
                pos_a_y=btn_harf_a.getY();

                btn_harf_n.setX(pos_l_x);
                btn_harf_n.setY(pos_l_y);

                btn_harf_l.setX(pos_a_x);
                btn_harf_l.setY(pos_a_y);

                btn_harf_a.setX(pos_n_x);
                btn_harf_a.setY(pos_n_y);

            }
        });

        btn_sil=findViewById(R.id.btn_1_3_sil);
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

        btn_kontrol=findViewById(R.id.btn_1_3_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<2){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==2) {
                    if (btn_dizi.indexOf(btn_harf_a) == 0 && btn_dizi.indexOf(btn_harf_n) == 1) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            an_a.setText("A");
                            nal_n.setText("N");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_a) == 0 && btn_dizi.indexOf(btn_harf_l) == 1) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            al_a.setText("A");
                            nal_l.setText("L");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_n) == 0 && btn_dizi.indexOf(btn_harf_a) == 1 && btn_dizi.indexOf(btn_harf_l) == 2) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            nal_n.setText("N");
                            nal_a.setText("A");
                            nal_l.setText("L");
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
                    String seviye="Level 1_3";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1"))){
                        Intent level_bir=new Intent(Level_1_3.this,Level_1.class);
                        next_level_dizi.add(level_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_1"))){
                        Intent level_bir_bir=new Intent(Level_1_3.this,Level_1_1.class);
                        next_level_dizi.add(level_bir_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_2"))){
                        Intent level_bir_iki=new Intent(Level_1_3.this,Level_1_2.class);
                        next_level_dizi.add(level_bir_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_4"))){
                        Intent level_bir_dort=new Intent(Level_1_3.this,Level_1_4.class);
                        next_level_dizi.add(level_bir_dort);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_5"))){
                        Intent level_bir_bes=new Intent(Level_1_3.this,Level_1_5.class);
                        next_level_dizi.add(level_bir_bes);
                    }

                    /*if (!(seviye_karsilastir_dizi.toString().contains("Level 1"))){
                        Intent level_bir=new Intent(Level_1_3.this,Level_1.class);
                        next_level_dizi.add(level_bir);
                    }else if (!(seviye_karsilastir_dizi.toString().contains("Level 1_1"))){
                        Intent level_bir_bir=new Intent(Level_1_3.this,Level_1_1.class);
                        next_level_dizi.add(level_bir_bir);
                    }else if (!(seviye_karsilastir_dizi.toString().contains("Level 1_2"))){
                        Intent level_bir_iki=new Intent(Level_1_3.this,Level_1_2.class);
                        next_level_dizi.add(level_bir_iki);
                    }else if (!(seviye_karsilastir_dizi.toString().contains("Level 1_4"))){
                        Intent level_bir_dort=new Intent(Level_1_3.this,Level_1_4.class);
                        next_level_dizi.add(level_bir_dort);
                    }else if (!(seviye_karsilastir_dizi.toString().contains("Level 1_5"))){
                        Intent level_bir_bes=new Intent(Level_1_3.this,Level_1_5.class);
                        next_level_dizi.add(level_bir_bes);
                    }*/

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_1_3.this,BaslaActivity.class);
                        startActivity(bitti);
                    }

                }
            }
        });


    }
}
