package com.example.asus.smartlearn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MenuScore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_score);
        ImageButton btn_home = (ImageButton)findViewById(R.id.btn_home);
        ImageButton btn_ulang = (ImageButton)findViewById(R.id.btn_ulang);
        ImageButton btn_materi = (ImageButton)findViewById(R.id.btn_materi);

        final MediaPlayer btn_klik = MediaPlayer.create(this,R.raw.sound_click);

        btn_ulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                Intent intent = new Intent(MenuScore.this,MenuSoal_Matematika.class);
                startActivity(intent);
            }
        });
        btn_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                Intent intent = new Intent(MenuScore.this,Materi_Matematika.class);
                startActivity(intent);
            }
        });
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                Intent intent = new Intent(MenuScore.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
