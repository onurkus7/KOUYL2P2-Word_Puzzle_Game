package com.example.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;

public class BaslaActivity extends AppCompatActivity {

    Button btn_level_bir;
    Button btn_level_iki;
    Button btn_level_uc;
    List<Intent> Level_bir_dizi=new ArrayList<Intent>();
    List<Intent> Level_iki_dizi=new ArrayList<Intent>();
    List<Intent> Level_uc_dizi=new ArrayList<Intent>();
    Veritabani veritabani=new Veritabani(BaslaActivity.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basla);


        btn_level_bir=findViewById(R.id.btn_birinci_level);

        btn_level_bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                veritabani.hepsinisil(veritabani.getWritableDatabase());

                Intent level_bir=new Intent(BaslaActivity.this,Level_1.class);
                Level_bir_dizi.add(level_bir);

                Intent level_bir_bir=new Intent(BaslaActivity.this,Level_1_1.class);
                Level_bir_dizi.add(level_bir_bir);

                Intent level_bir_iki=new Intent(BaslaActivity.this,Level_1_2.class);
                Level_bir_dizi.add(level_bir_iki);

                Intent level_bir_uc=new Intent(BaslaActivity.this,Level_1_3.class);
                Level_bir_dizi.add(level_bir_uc);

                Intent level_bir_dort=new Intent(BaslaActivity.this,Level_1_4.class);
                Level_bir_dizi.add(level_bir_dort);

                Intent level_bir_bes=new Intent(BaslaActivity.this,Level_1_5.class);
                Level_bir_dizi.add(level_bir_bes);

                Random r=new Random();
                int ras=r.nextInt(Level_bir_dizi.size());

                startActivity(Level_bir_dizi.get(ras));

            }
        });

        btn_level_iki=findViewById(R.id.btn_ikinci_level);

        btn_level_iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                veritabani.hepsinisil(veritabani.getWritableDatabase());

                Intent level_iki=new Intent(BaslaActivity.this,Level_2.class);
                Level_iki_dizi.add(level_iki);

                Intent level_iki_bir=new Intent(BaslaActivity.this,Level_2_1.class);
                Level_iki_dizi.add(level_iki_bir);

                Intent level_iki_iki=new Intent(BaslaActivity.this,Level_2_2.class);
                Level_iki_dizi.add(level_iki_iki);

                Intent level_iki_uc=new Intent(BaslaActivity.this,Level_2_3.class);
                Level_iki_dizi.add(level_iki_uc);

                Intent level_iki_dort=new Intent(BaslaActivity.this,Level_2_4.class);
                Level_iki_dizi.add(level_iki_dort);

                Intent level_iki_bes=new Intent(BaslaActivity.this,Level_2_5.class);
                Level_iki_dizi.add(level_iki_bes);

                Random r=new Random();
                int ras=r.nextInt(Level_iki_dizi.size());

                startActivity(Level_iki_dizi.get(ras));

            }
        });

        btn_level_uc=findViewById(R.id.btn_ucuncu_level);

        btn_level_uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                veritabani.hepsinisil(veritabani.getWritableDatabase());

                Intent level_uc=new Intent(BaslaActivity.this,Level_3.class);
                Level_uc_dizi.add(level_uc);

                Intent level_uc_bir=new Intent(BaslaActivity.this,Level_3_1.class);
                Level_uc_dizi.add(level_uc_bir);

                Intent level_uc_iki=new Intent(BaslaActivity.this,Level_3_2.class);
                Level_uc_dizi.add(level_uc_iki);

                Intent level_uc_uc=new Intent(BaslaActivity.this,Level_3_3.class);
                Level_uc_dizi.add(level_uc_uc);

                Intent level_uc_dort=new Intent(BaslaActivity.this,Level_3_4.class);
                Level_uc_dizi.add(level_uc_dort);

                Intent level_uc_bes=new Intent(BaslaActivity.this,Level_3_5.class);
                Level_uc_dizi.add(level_uc_bes);

                Random r=new Random();
                int ras=r.nextInt(Level_uc_dizi.size());
                startActivity(Level_uc_dizi.get(ras));
            }
        });

    }
}
