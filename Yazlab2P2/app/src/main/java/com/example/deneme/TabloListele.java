package com.example.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.List;

public class TabloListele extends AppCompatActivity {
    Button btn_listele;
    ListView listView;
    List<String> veriler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablo_listele);
        btn_listele=findViewById(R.id.btn_listele);
        listView=findViewById(R.id.Listele);
        btn_listele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Veritabani veritabani=new Veritabani(TabloListele.this);
                veriler=veritabani.Veri_Listele();
                ArrayAdapter<String> adapter=new ArrayAdapter<String>(TabloListele.this,android.R.layout.activity_list_item,android.R.id.text1,veriler);
                listView.setAdapter(adapter);
            }
        });
    }

}
