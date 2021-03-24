package com.example.deneme;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaslaKontrolActivity extends AppCompatActivity {

    Button btn_yeni_oyun;
    Button btn_kaldigin_yer;
    List<Intent> kaldigin_yer_1_dizi=new ArrayList<Intent>();
    List<Intent> kaldigin_yer_2_dizi=new ArrayList<Intent>();
    List<Intent> kaldigin_yer_3_dizi=new ArrayList<Intent>();
    List<String> seviye_karsilastir_dizi=new ArrayList<String>();
    Veritabani veritabani=new Veritabani(BaslaKontrolActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basla_kontrol);

        btn_yeni_oyun=findViewById(R.id.btn_yeni_oyun);
        btn_yeni_oyun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yeni=new Intent(BaslaKontrolActivity.this,BaslaActivity.class);
                startActivity(yeni);
            }
        });

        btn_kaldigin_yer=findViewById(R.id.btn_kaldigin_yer);
        btn_kaldigin_yer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seviye_karsilastir_dizi=veritabani.Veri_Listele();

                if (seviye_karsilastir_dizi.toString().contains("Level 1")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_1"))){

                        Intent level_bir_bir=new Intent(BaslaKontrolActivity.this,Level_1_1.class);
                        kaldigin_yer_1_dizi.add(level_bir_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_2"))){

                        Intent level_bir_iki=new Intent(BaslaKontrolActivity.this,Level_1_2.class);
                        kaldigin_yer_1_dizi.add(level_bir_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_3"))){

                        Intent level_bir_uc=new Intent(BaslaKontrolActivity.this,Level_1_3.class);
                        kaldigin_yer_1_dizi.add(level_bir_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_4"))){

                        Intent level_bir_dort=new Intent(BaslaKontrolActivity.this,Level_1_4.class);
                        kaldigin_yer_1_dizi.add(level_bir_dort);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_5"))){

                        Intent level_bir_bes=new Intent(BaslaKontrolActivity.this,Level_1_5.class);
                        kaldigin_yer_1_dizi.add(level_bir_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 1_1")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1"))){

                        Intent level_bir=new Intent(BaslaKontrolActivity.this,Level_1.class);
                        kaldigin_yer_1_dizi.add(level_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_2"))){

                        Intent level_bir_iki=new Intent(BaslaKontrolActivity.this,Level_1_2.class);
                        kaldigin_yer_1_dizi.add(level_bir_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_3"))){

                        Intent level_bir_uc=new Intent(BaslaKontrolActivity.this,Level_1_3.class);
                        kaldigin_yer_1_dizi.add(level_bir_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_4"))){

                        Intent level_bir_dort=new Intent(BaslaKontrolActivity.this,Level_1_4.class);
                        kaldigin_yer_1_dizi.add(level_bir_dort);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_5"))){

                        Intent level_bir_bes=new Intent(BaslaKontrolActivity.this,Level_1_5.class);
                        kaldigin_yer_1_dizi.add(level_bir_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 1_2")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1"))){

                        Intent level_bir=new Intent(BaslaKontrolActivity.this,Level_1.class);
                        kaldigin_yer_1_dizi.add(level_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_1"))){

                        Intent level_bir_bir=new Intent(BaslaKontrolActivity.this,Level_1_1.class);
                        kaldigin_yer_1_dizi.add(level_bir_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_3"))){

                        Intent level_bir_uc=new Intent(BaslaKontrolActivity.this,Level_1_3.class);
                        kaldigin_yer_1_dizi.add(level_bir_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_4"))){

                        Intent level_bir_dort=new Intent(BaslaKontrolActivity.this,Level_1_4.class);
                        kaldigin_yer_1_dizi.add(level_bir_dort);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_5"))){

                        Intent level_bir_bes=new Intent(BaslaKontrolActivity.this,Level_1_5.class);
                        kaldigin_yer_1_dizi.add(level_bir_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 1_3")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1"))){

                        Intent level_bir=new Intent(BaslaKontrolActivity.this,Level_1.class);
                        kaldigin_yer_1_dizi.add(level_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_1"))){

                        Intent level_bir_bir=new Intent(BaslaKontrolActivity.this,Level_1_1.class);
                        kaldigin_yer_1_dizi.add(level_bir_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_2"))){

                        Intent level_bir_iki=new Intent(BaslaKontrolActivity.this,Level_1_2.class);
                        kaldigin_yer_1_dizi.add(level_bir_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_4"))){

                        Intent level_bir_dort=new Intent(BaslaKontrolActivity.this,Level_1_4.class);
                        kaldigin_yer_1_dizi.add(level_bir_dort);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_5"))){

                        Intent level_bir_bes=new Intent(BaslaKontrolActivity.this,Level_1_5.class);
                        kaldigin_yer_1_dizi.add(level_bir_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 1_4")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1"))){

                        Intent level_bir=new Intent(BaslaKontrolActivity.this,Level_1.class);
                        kaldigin_yer_1_dizi.add(level_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_1"))){

                        Intent level_bir_bir=new Intent(BaslaKontrolActivity.this,Level_1_1.class);
                        kaldigin_yer_1_dizi.add(level_bir_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_2"))){

                        Intent level_bir_iki=new Intent(BaslaKontrolActivity.this,Level_1_2.class);
                        kaldigin_yer_1_dizi.add(level_bir_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_3"))){

                        Intent level_bir_uc=new Intent(BaslaKontrolActivity.this,Level_1_3.class);
                        kaldigin_yer_1_dizi.add(level_bir_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_5"))){

                        Intent level_bir_bes=new Intent(BaslaKontrolActivity.this,Level_1_5.class);
                        kaldigin_yer_1_dizi.add(level_bir_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 1_5")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1"))){

                        Intent level_bir=new Intent(BaslaKontrolActivity.this,Level_1.class);
                        kaldigin_yer_1_dizi.add(level_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_1"))){

                        Intent level_bir_bir=new Intent(BaslaKontrolActivity.this,Level_1_1.class);
                        kaldigin_yer_1_dizi.add(level_bir_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_2"))){

                        Intent level_bir_iki=new Intent(BaslaKontrolActivity.this,Level_1_2.class);
                        kaldigin_yer_1_dizi.add(level_bir_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_3"))){

                        Intent level_bir_uc=new Intent(BaslaKontrolActivity.this,Level_1_3.class);
                        kaldigin_yer_1_dizi.add(level_bir_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 1_4"))){

                        Intent level_bir_dort=new Intent(BaslaKontrolActivity.this,Level_1_4.class);
                        kaldigin_yer_1_dizi.add(level_bir_dort);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 2")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_1"))){

                        Intent level_iki_bir=new Intent(BaslaKontrolActivity.this,Level_2_1.class);
                        kaldigin_yer_2_dizi.add(level_iki_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_2"))){

                        Intent level_iki_iki=new Intent(BaslaKontrolActivity.this,Level_2_2.class);
                        kaldigin_yer_2_dizi.add(level_iki_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_3"))){

                        Intent level_iki_uc=new Intent(BaslaKontrolActivity.this,Level_2_3.class);
                        kaldigin_yer_2_dizi.add(level_iki_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_4"))){

                        Intent level_iki_dort=new Intent(BaslaKontrolActivity.this,Level_2_4.class);
                        kaldigin_yer_2_dizi.add(level_iki_dort);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_5"))){

                        Intent level_iki_bes=new Intent(BaslaKontrolActivity.this,Level_2_5.class);
                        kaldigin_yer_2_dizi.add(level_iki_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 2_1")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2"))){

                        Intent level_iki=new Intent(BaslaKontrolActivity.this,Level_2.class);
                        kaldigin_yer_2_dizi.add(level_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_2"))){

                        Intent level_iki_iki=new Intent(BaslaKontrolActivity.this,Level_2_2.class);
                        kaldigin_yer_2_dizi.add(level_iki_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_3"))){

                        Intent level_iki_uc=new Intent(BaslaKontrolActivity.this,Level_2_3.class);
                        kaldigin_yer_2_dizi.add(level_iki_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_4"))){

                        Intent level_iki_dort=new Intent(BaslaKontrolActivity.this,Level_2_4.class);
                        kaldigin_yer_2_dizi.add(level_iki_dort);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_5"))){

                        Intent level_iki_bes=new Intent(BaslaKontrolActivity.this,Level_2_5.class);
                        kaldigin_yer_2_dizi.add(level_iki_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 2_2")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2"))){

                        Intent level_iki=new Intent(BaslaKontrolActivity.this,Level_2.class);
                        kaldigin_yer_2_dizi.add(level_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_1"))){

                        Intent level_iki_bir=new Intent(BaslaKontrolActivity.this,Level_2_1.class);
                        kaldigin_yer_2_dizi.add(level_iki_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_3"))){

                        Intent level_iki_uc=new Intent(BaslaKontrolActivity.this,Level_2_3.class);
                        kaldigin_yer_2_dizi.add(level_iki_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_4"))){

                        Intent level_iki_dort=new Intent(BaslaKontrolActivity.this,Level_2_4.class);
                        kaldigin_yer_2_dizi.add(level_iki_dort);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_5"))){

                        Intent level_iki_bes=new Intent(BaslaKontrolActivity.this,Level_2_5.class);
                        kaldigin_yer_2_dizi.add(level_iki_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 2_3")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2"))){

                        Intent level_iki=new Intent(BaslaKontrolActivity.this,Level_2.class);
                        kaldigin_yer_2_dizi.add(level_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_1"))){

                        Intent level_iki_bir=new Intent(BaslaKontrolActivity.this,Level_2_1.class);
                        kaldigin_yer_2_dizi.add(level_iki_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_2"))){

                        Intent level_iki_iki=new Intent(BaslaKontrolActivity.this,Level_2_2.class);
                        kaldigin_yer_2_dizi.add(level_iki_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_4"))){

                        Intent level_iki_dort=new Intent(BaslaKontrolActivity.this,Level_2_4.class);
                        kaldigin_yer_2_dizi.add(level_iki_dort);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_5"))){

                        Intent level_iki_bes=new Intent(BaslaKontrolActivity.this,Level_2_5.class);
                        kaldigin_yer_2_dizi.add(level_iki_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 2_4")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2"))){

                        Intent level_iki=new Intent(BaslaKontrolActivity.this,Level_2.class);
                        kaldigin_yer_2_dizi.add(level_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_1"))){

                        Intent level_iki_bir=new Intent(BaslaKontrolActivity.this,Level_2_1.class);
                        kaldigin_yer_2_dizi.add(level_iki_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_2"))){

                        Intent level_iki_iki=new Intent(BaslaKontrolActivity.this,Level_2_2.class);
                        kaldigin_yer_2_dizi.add(level_iki_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_3"))){

                        Intent level_iki_uc=new Intent(BaslaKontrolActivity.this,Level_2_3.class);
                        kaldigin_yer_2_dizi.add(level_iki_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_5"))){

                        Intent level_iki_bes=new Intent(BaslaKontrolActivity.this,Level_2_5.class);
                        kaldigin_yer_2_dizi.add(level_iki_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 2_5")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2"))){

                        Intent level_iki=new Intent(BaslaKontrolActivity.this,Level_2.class);
                        kaldigin_yer_2_dizi.add(level_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_1"))){

                        Intent level_iki_bir=new Intent(BaslaKontrolActivity.this,Level_2_1.class);
                        kaldigin_yer_2_dizi.add(level_iki_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_2"))){

                        Intent level_iki_iki=new Intent(BaslaKontrolActivity.this,Level_2_2.class);
                        kaldigin_yer_2_dizi.add(level_iki_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_3"))){

                        Intent level_iki_uc=new Intent(BaslaKontrolActivity.this,Level_2_3.class);
                        kaldigin_yer_2_dizi.add(level_iki_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 2_4"))){

                        Intent level_iki_dort=new Intent(BaslaKontrolActivity.this,Level_2_4.class);
                        kaldigin_yer_2_dizi.add(level_iki_dort);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 3")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_1"))){

                        Intent level_uc_bir=new Intent(BaslaKontrolActivity.this,Level_3_1.class);
                        kaldigin_yer_3_dizi.add(level_uc_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_2"))){

                        Intent level_uc_iki=new Intent(BaslaKontrolActivity.this,Level_3_2.class);
                        kaldigin_yer_3_dizi.add(level_uc_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_3"))){

                        Intent level_uc_uc=new Intent(BaslaKontrolActivity.this,Level_3_3.class);
                        kaldigin_yer_3_dizi.add(level_uc_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_4"))){

                        Intent level_uc_dort=new Intent(BaslaKontrolActivity.this,Level_3_4.class);
                        kaldigin_yer_3_dizi.add(level_uc_dort);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_5"))){

                        Intent level_uc_bes=new Intent(BaslaKontrolActivity.this,Level_3_5.class);
                        kaldigin_yer_3_dizi.add(level_uc_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 3_1")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3"))){

                        Intent level_uc=new Intent(BaslaKontrolActivity.this,Level_3.class);
                        kaldigin_yer_3_dizi.add(level_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_2"))){

                        Intent level_uc_iki=new Intent(BaslaKontrolActivity.this,Level_3_2.class);
                        kaldigin_yer_3_dizi.add(level_uc_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_3"))){

                        Intent level_uc_uc=new Intent(BaslaKontrolActivity.this,Level_3_3.class);
                        kaldigin_yer_3_dizi.add(level_uc_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_4"))){

                        Intent level_uc_dort=new Intent(BaslaKontrolActivity.this,Level_3_4.class);
                        kaldigin_yer_3_dizi.add(level_uc_dort);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_5"))){

                        Intent level_uc_bes=new Intent(BaslaKontrolActivity.this,Level_3_5.class);
                        kaldigin_yer_3_dizi.add(level_uc_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 3_2")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3"))){

                        Intent level_uc=new Intent(BaslaKontrolActivity.this,Level_3.class);
                        kaldigin_yer_3_dizi.add(level_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_1"))){

                        Intent level_uc_bir=new Intent(BaslaKontrolActivity.this,Level_3_1.class);
                        kaldigin_yer_3_dizi.add(level_uc_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_3"))){

                        Intent level_uc_uc=new Intent(BaslaKontrolActivity.this,Level_3_3.class);
                        kaldigin_yer_3_dizi.add(level_uc_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_4"))){

                        Intent level_uc_dort=new Intent(BaslaKontrolActivity.this,Level_3_4.class);
                        kaldigin_yer_3_dizi.add(level_uc_dort);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_5"))){

                        Intent level_uc_bes=new Intent(BaslaKontrolActivity.this,Level_3_5.class);
                        kaldigin_yer_3_dizi.add(level_uc_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 3_3")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3"))){

                        Intent level_uc=new Intent(BaslaKontrolActivity.this,Level_3.class);
                        kaldigin_yer_3_dizi.add(level_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_1"))){

                        Intent level_uc_bir=new Intent(BaslaKontrolActivity.this,Level_3_1.class);
                        kaldigin_yer_3_dizi.add(level_uc_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_2"))){

                        Intent level_uc_iki=new Intent(BaslaKontrolActivity.this,Level_3_2.class);
                        kaldigin_yer_3_dizi.add(level_uc_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_4"))){

                        Intent level_uc_dort=new Intent(BaslaKontrolActivity.this,Level_3_4.class);
                        kaldigin_yer_3_dizi.add(level_uc_dort);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_5"))){

                        Intent level_uc_bes=new Intent(BaslaKontrolActivity.this,Level_3_5.class);
                        kaldigin_yer_3_dizi.add(level_uc_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 3_4")){


                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3"))){

                        Intent level_uc=new Intent(BaslaKontrolActivity.this,Level_3.class);
                        kaldigin_yer_3_dizi.add(level_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_1"))){

                        Intent level_uc_bir=new Intent(BaslaKontrolActivity.this,Level_3_1.class);
                        kaldigin_yer_3_dizi.add(level_uc_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_2"))){

                        Intent level_uc_iki=new Intent(BaslaKontrolActivity.this,Level_3_2.class);
                        kaldigin_yer_3_dizi.add(level_uc_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_3"))){

                        Intent level_uc_uc=new Intent(BaslaKontrolActivity.this,Level_3_3.class);
                        kaldigin_yer_3_dizi.add(level_uc_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_5"))){

                        Intent level_uc_bes=new Intent(BaslaKontrolActivity.this,Level_3_5.class);
                        kaldigin_yer_3_dizi.add(level_uc_bes);

                    }

                }
                if (seviye_karsilastir_dizi.toString().contains("Level 3_5")){

                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3"))){

                        Intent level_uc=new Intent(BaslaKontrolActivity.this,Level_3.class);
                        kaldigin_yer_3_dizi.add(level_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_1"))){

                        Intent level_uc_bir=new Intent(BaslaKontrolActivity.this,Level_3_1.class);
                        kaldigin_yer_3_dizi.add(level_uc_bir);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_2"))){

                        Intent level_uc_iki=new Intent(BaslaKontrolActivity.this,Level_3_2.class);
                        kaldigin_yer_3_dizi.add(level_uc_iki);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_3"))){

                        Intent level_uc_uc=new Intent(BaslaKontrolActivity.this,Level_3_3.class);
                        kaldigin_yer_3_dizi.add(level_uc_uc);

                    }
                    if (!(seviye_karsilastir_dizi.toString().contains("Level 3_4"))){

                        Intent level_uc_dort=new Intent(BaslaKontrolActivity.this,Level_3_4.class);
                        kaldigin_yer_3_dizi.add(level_uc_dort);

                    }

                }

                if (!(seviye_karsilastir_dizi.isEmpty())) {

                    if (!(kaldigin_yer_1_dizi.isEmpty())) {

                        Random random = new Random();
                        int ras = random.nextInt(kaldigin_yer_1_dizi.size());
                        startActivity(kaldigin_yer_1_dizi.get(ras));

                    }else if (!(kaldigin_yer_2_dizi.isEmpty())) {

                        Random random = new Random();
                        int ras = random.nextInt(kaldigin_yer_2_dizi.size());
                        startActivity(kaldigin_yer_2_dizi.get(ras));

                    }else if (!(kaldigin_yer_3_dizi.isEmpty())) {

                        Random random = new Random();
                        int ras = random.nextInt(kaldigin_yer_3_dizi.size());
                        startActivity(kaldigin_yer_3_dizi.get(ras));

                    }
                }else {
                    Intent bos=new Intent(BaslaKontrolActivity.this,BaslaActivity.class);
                    startActivity(bos);

                }



            }
        });

    }
}
