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

public class Level_1 extends AppCompatActivity {

    Button btn_harf_k;
    Button btn_harf_t;
    Button btn_harf_i;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_k_x,pos_k_y;
    float pos_t_x,pos_t_y;
    float pos_i_x,pos_i_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView tik_t,tik_i,tik_k,ki_i,it_i;
    int puan=0;
    int i=0,j=0,k=0;
    String [] cevaplar=new String[3];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_1.this);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_1);

        chronometer=findViewById(R.id.chronometer_1);
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

        tik_t=findViewById(R.id.txt_tik_t);
        tik_i=findViewById(R.id.txt_tik_i);
        tik_k=findViewById(R.id.txt_tik_k);
        ki_i=findViewById(R.id.txt_ki_i);
        it_i=findViewById(R.id.txt_it_i);


        puan_txt=findViewById(R.id.txt_1_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_1_basilan_harfler);

        cevaplar[0]="TİK";
        cevaplar[1]="Kİ";
        cevaplar[2]="İT";

        btn_harf_k=findViewById(R.id.btn_1_k);
        btn_harf_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_k);
                harfler_dizi.add("K");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_t=findViewById(R.id.btn_1_t);
        btn_harf_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_t);
                harfler_dizi.add("T");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_i=findViewById(R.id.btn_1_i);
        btn_harf_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_i);
                harfler_dizi.add("İ");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });


        btn_karistir=findViewById(R.id.btn_1_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_k_x=btn_harf_k.getX();
                pos_k_y=btn_harf_k.getY();

                pos_t_x=btn_harf_t.getX();
                pos_t_y=btn_harf_t.getY();

                pos_i_x=btn_harf_i.getX();
                pos_i_y=btn_harf_i.getY();

                btn_harf_k.setX(pos_t_x);
                btn_harf_k.setY(pos_t_y);

                btn_harf_t.setX(pos_i_x);
                btn_harf_t.setY(pos_i_y);

                btn_harf_i.setX(pos_k_x);
                btn_harf_i.setY(pos_k_y);

            }
        });
        btn_sil=findViewById(R.id.btn_1_sil);
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


        btn_kontrol=findViewById(R.id.btn_1_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<2){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==2) {
                    if (btn_dizi.indexOf(btn_harf_i) == 0 && btn_dizi.indexOf(btn_harf_t) == 1) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            it_i.setText("İ");
                            tik_t.setText("T");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_k) == 0 && btn_dizi.indexOf(btn_harf_i) == 1) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            tik_k.setText("K");
                            ki_i.setText("i");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_t) == 0 && btn_dizi.indexOf(btn_harf_i) == 1 && btn_dizi.indexOf(btn_harf_k) == 2) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            tik_t.setText("T");
                            tik_i.setText("İ");
                            tik_k.setText("K");
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
                    String seviye="Level 1";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();


                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_1"))){
                        Intent level_bir_bir=new Intent(Level_1.this,Level_1_1.class);
                        next_level_dizi.add(level_bir_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2"))){
                        Intent level_iki=new Intent(Level_1.this,Level_2.class);
                        next_level_dizi.add(level_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_1"))){
                        Intent level_iki_bir=new Intent(Level_1.this,Level_2_1.class);
                        next_level_dizi.add(level_iki_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3"))){
                        Intent level_uc=new Intent(Level_1.this,Level_3.class);
                        next_level_dizi.add(level_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_1"))){
                        Intent level_uc_bir=new Intent(Level_1.this,Level_3_1.class);
                        next_level_dizi.add(level_uc_bir);
                    }

                   /* if (!(seviye_karsilastir_dizi.toString().contains("Level 1_1"))){
                        Intent level_bir_bir=new Intent(Level_1.this,Level_1_1.class);
                        next_level_dizi.add(level_bir_bir);
                    }else if (!(seviye_karsilastir_dizi.toString().contains("Level 2"))){
                        Intent level_iki=new Intent(Level_1.this,Level_2.class);
                        next_level_dizi.add(level_iki);
                    }else if (!(seviye_karsilastir_dizi.toString().contains("Level 2_1"))){
                        Intent level_iki_bir=new Intent(Level_1.this,Level_2_1.class);
                        next_level_dizi.add(level_iki_bir);
                    }else if (!(seviye_karsilastir_dizi.toString().contains("Level 3"))){
                        Intent level_uc=new Intent(Level_1.this,Level_3.class);
                        next_level_dizi.add(level_uc);
                    }else if (!(seviye_karsilastir_dizi.toString().contains("Level 3_1"))){
                        Intent level_uc_bir=new Intent(Level_1.this,Level_3_1.class);
                        next_level_dizi.add(level_uc_bir);
                    }*/

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_1.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }



            }
        });


    }
}
