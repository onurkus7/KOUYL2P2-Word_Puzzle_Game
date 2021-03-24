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

public class Level_2_5 extends AppCompatActivity {


    Button btn_harf_c;
    Button btn_harf_e;
    Button btn_harf_l;
    Button btn_harf_p;
    Button btn_kontrol;
    Button btn_karistir;
    Button btn_sil;
    float pos_c_x,pos_c_y;
    float pos_e_x,pos_e_y;
    float pos_l_x,pos_l_y;
    float pos_p_x,pos_p_y;
    Chronometer chronometer;
    TextView puan_txt;
    TextView harfler_txt;
    TextView celp_c,celp_e,celp_l,celp_p,cep_e,cep_p,lep_e,lep_p;
    int puan=0;
    int i=0,j=0,k=0;
    String [] cevaplar=new String[3];
    List<Button> btn_dizi=new ArrayList<Button>();
    List<String> harfler_dizi=new ArrayList<String>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    List<Intent> next_level_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(Level_2_5.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_2_5);

        chronometer = findViewById(R.id.chronometer_2_5);
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

        puan_txt=findViewById(R.id.txt_2_5_puan);
        puan_txt.setText(""+puan);
        harfler_txt=findViewById(R.id.txt_2_5_basilan_harfler);
        cevaplar[0]="CELP";
        cevaplar[1]="CEP";
        cevaplar[2]="LEP";

        celp_c=findViewById(R.id.txt_celp_c);
        celp_e=findViewById(R.id.txt_celp_e);
        celp_l=findViewById(R.id.txt_celp_l);
        celp_p=findViewById(R.id.txt_celp_p);
        cep_e=findViewById(R.id.txt_cep_e);
        cep_p=findViewById(R.id.txt_cep_p);
        lep_e=findViewById(R.id.txt_lep_e);
        lep_p=findViewById(R.id.txt_lep_p);

        btn_harf_c=findViewById(R.id.btn_2_5_c);
        btn_harf_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn_dizi.add(btn_harf_c);
                harfler_dizi.add("C");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_e=findViewById(R.id.btn_2_5_e);
        btn_harf_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_e);
                harfler_dizi.add("E");
                harfler_txt.setText(harfler_dizi.toString());


            }
        });

        btn_harf_l=findViewById(R.id.btn_2_5_l);
        btn_harf_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_l);
                harfler_dizi.add("L");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_harf_p=findViewById(R.id.btn_2_5_p);
        btn_harf_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_dizi.add(btn_harf_p);
                harfler_dizi.add("P");
                harfler_txt.setText(harfler_dizi.toString());

            }
        });

        btn_karistir=findViewById(R.id.btn_2_5_karistir);
        btn_karistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pos_c_x=btn_harf_c.getX();
                pos_c_y=btn_harf_c.getY();

                pos_e_x=btn_harf_e.getX();
                pos_e_y=btn_harf_e.getY();

                pos_l_x=btn_harf_l.getX();
                pos_l_y=btn_harf_l.getY();

                pos_p_x=btn_harf_p.getX();
                pos_p_y=btn_harf_p.getY();

                btn_harf_c.setX(pos_e_x);
                btn_harf_c.setY(pos_e_y);

                btn_harf_e.setX(pos_l_x);
                btn_harf_e.setY(pos_l_y);

                btn_harf_l.setX(pos_p_x);
                btn_harf_l.setY(pos_p_y);

                btn_harf_p.setX(pos_c_x);
                btn_harf_p.setY(pos_c_y);

            }
        });

        btn_sil=findViewById(R.id.btn_2_5_sil);
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

        btn_kontrol=findViewById(R.id.btn_2_5_kontrol);
        btn_kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_dizi.size()<3){
                    puan-=harfler_dizi.size()*100;
                }else if (btn_dizi.size()==3) {
                    if (btn_dizi.indexOf(btn_harf_l) == 0 && btn_dizi.indexOf(btn_harf_e) == 1 && btn_dizi.indexOf(btn_harf_p) == 2) {
                        if (i == 0) {
                            cevaplar[2] = "";
                            puan += harfler_dizi.size() * 100;
                            i++;
                            celp_l.setText("L");
                            lep_e.setText("E");
                            lep_p.setText("P");
                        }
                    } else if (btn_dizi.indexOf(btn_harf_c) == 0 && btn_dizi.indexOf(btn_harf_e) == 1 && btn_dizi.indexOf(btn_harf_p) == 2) {
                        if (j == 0) {
                            cevaplar[1] = "";
                            puan += harfler_dizi.size() * 100;
                            j++;
                            celp_c.setText("C");
                            cep_e.setText("E");
                            cep_p.setText("P");
                        }
                    }else {
                        puan-=harfler_dizi.size()*100;
                    }
                }else if (btn_dizi.size()==4) {
                    if (btn_dizi.indexOf(btn_harf_c) == 0 && btn_dizi.indexOf(btn_harf_e) == 1 && btn_dizi.indexOf(btn_harf_l) == 2 && btn_dizi.indexOf(btn_harf_p) == 3) {
                        if (k == 0) {
                            cevaplar[0] = "";
                            puan += harfler_dizi.size() * 100;
                            k++;
                            celp_c.setText("C");
                            celp_e.setText("E");
                            celp_l.setText("L");
                            celp_p.setText("P");
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
                    String seviye="Level 2_5";
                    veritabani.Veri_ekle(seviye,puan);

                    seviye_karsilastir_dizi=veritabani.Veri_Listele();

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2"))){
                        Intent level_iki=new Intent(Level_2_5.this,Level_2.class);
                        next_level_dizi.add(level_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_1"))){
                        Intent level_iki_bir=new Intent(Level_2_5.this,Level_2_1.class);
                        next_level_dizi.add(level_iki_bir);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_2"))){
                        Intent level_iki_iki=new Intent(Level_2_5.this,Level_2_2.class);
                        next_level_dizi.add(level_iki_iki);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_3"))){
                        Intent level_iki_uc=new Intent(Level_2_5.this,Level_2_3.class);
                        next_level_dizi.add(level_iki_uc);
                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_4"))){
                        Intent level_iki_dort=new Intent(Level_2_5.this,Level_2_4.class);
                        next_level_dizi.add(level_iki_dort);
                    }

                    if (!(seviye_karsilastir_dizi.isEmpty())) {
                        Random random = new Random();
                        int ras = random.nextInt(next_level_dizi.size());
                        startActivity(next_level_dizi.get(ras));
                    }else {
                        Intent bitti=new Intent(Level_2_5.this,BaslaActivity.class);
                        startActivity(bitti);
                    }
                }

            }
        });

    }
}
