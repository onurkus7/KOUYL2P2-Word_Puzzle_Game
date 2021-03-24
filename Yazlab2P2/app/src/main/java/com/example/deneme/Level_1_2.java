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

public class Level_1_2 extends AppCompatActivity {

    Button btn_harf_s;
    Button btn_harf_a;
    Button btn_harf_i;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_s_x,pos_s_y;
    float pos_a_x,pos_a_y;
    float pos_i_x,pos_i_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView asi_a,asi_s,asi_i,as_s,si_s;
    int puan=0;
    int i=0,j=0,k=0;
    String [] cevaplar=new String[3];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_1_2.this);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_1_2);

        chronometer=findViewById(R.id.chronometer_1_2);
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

        puan_txt=findViewById(R.id.txt_1_2_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_1_2_basilan_harfler);
        cevaplar[0]="ASİ";
        cevaplar[1]="Sİ";
        cevaplar[2]="AS";

        asi_a=findViewById(R.id.txt_asi_a);
        asi_s=findViewById(R.id.txt_asi_s);
        asi_i=findViewById(R.id.txt_asi_i);
        as_s=findViewById(R.id.txt_as_s);
        si_s=findViewById(R.id.txt_si_s);

        btn_harf_s=findViewById(R.id.btn_1_2_s);
        btn_harf_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_s);
                harfler_dizi.add("S");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_a=findViewById(R.id.btn_1_2_a);
        btn_harf_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_a);
                harfler_dizi.add("A");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_i=findViewById(R.id.btn_1_2_i);
        btn_harf_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_i);
                harfler_dizi.add("İ");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_1_2_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_s_x=btn_harf_s.getX();
                pos_s_y=btn_harf_s.getY();

                pos_a_x=btn_harf_a.getX();
                pos_a_y=btn_harf_a.getY();

                pos_i_x=btn_harf_i.getX();
                pos_i_y=btn_harf_i.getY();

                btn_harf_s.setX(pos_a_x);
                btn_harf_s.setY(pos_a_y);

                btn_harf_a.setX(pos_i_x);
                btn_harf_a.setY(pos_i_y);

                btn_harf_i.setX(pos_s_x);
                btn_harf_i.setY(pos_s_y);

            }
        });

        btn_sil=findViewById(R.id.btn_1_2_sil);
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

        btn_kontrol=findViewById(R.id.btn_1_2_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<2){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==2) {
                    if (btn_dizi.indexOf(btn_harf_a) == 0 && btn_dizi.indexOf(btn_harf_s) == 1) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            asi_a.setText("A");
                            as_s.setText("S");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_s) == 0 && btn_dizi.indexOf(btn_harf_i) == 1) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            si_s.setText("S");
                            asi_i.setText("İ");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_a) == 0 && btn_dizi.indexOf(btn_harf_s) == 1 && btn_dizi.indexOf(btn_harf_i) == 2) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            asi_a.setText("A");
                            asi_s.setText("S");
                            asi_i.setText("İ");
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
                    String seviye="Level 1_2";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1"))){
                        Intent level_bir=new Intent(Level_1_2.this,Level_1.class);
                        next_level_dizi.add(level_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_1"))){
                        Intent level_bir_bir=new Intent(Level_1_2.this,Level_1_1.class);
                        next_level_dizi.add(level_bir_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_3"))){
                        Intent level_bir_uc=new Intent(Level_1_2.this,Level_1_3.class);
                        next_level_dizi.add(level_bir_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_4"))){
                        Intent level_bir_dort=new Intent(Level_1_2.this,Level_1_4.class);
                        next_level_dizi.add(level_bir_dort);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_5"))){
                        Intent level_bir_bes=new Intent(Level_1_2.this,Level_1_5.class);
                        next_level_dizi.add(level_bir_bes);
                    }

                    /*if (!(seviye_karsilastir_dizi.toString().contains("Level 1"))){
                        Intent level_bir=new Intent(Level_1_2.this,Level_1.class);
                        next_level_dizi.add(level_bir);
                    }else if (!(seviye_karsilastir_dizi.toString().contains("Level 1_1"))){
                        Intent level_bir_bir=new Intent(Level_1_2.this,Level_1_1.class);
                        next_level_dizi.add(level_bir_bir);
                    }else if (!(seviye_karsilastir_dizi.toString().contains("Level 1_3"))){
                        Intent level_bir_uc=new Intent(Level_1_2.this,Level_1_3.class);
                        next_level_dizi.add(level_bir_uc);
                    }else if (!(seviye_karsilastir_dizi.toString().contains("Level 1_4"))){
                        Intent level_bir_dort=new Intent(Level_1_2.this,Level_1_4.class);
                        next_level_dizi.add(level_bir_dort);
                    }else if (!(seviye_karsilastir_dizi.toString().contains("Level 1_5"))){
                        Intent level_bir_bes=new Intent(Level_1_2.this,Level_1_5.class);
                        next_level_dizi.add(level_bir_bes);
                    }*/

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_1_2.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }



            }
        });


    }
}
