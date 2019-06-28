package com.example.asus.smartlearn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class Matematika_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematika);
        ImageButton btn_tambahkurang = (ImageButton)findViewById(R.id.btn_tambahkurang);
        ImageButton btn_kalibagi = (ImageButton)findViewById(R.id.btn_kalibagi);
        ImageButton btn_pecahan = (ImageButton)findViewById(R.id.btn_pecahan);
        ImageButton btn_bangundatar = (ImageButton)findViewById(R.id.btn_bangundatar);
        ImageButton btn_keliling = (ImageButton)findViewById(R.id.btn_keliling);
        ImageButton btn_back = (ImageButton)findViewById(R.id.btn_back);

        @SuppressLint("ResourceType") final Animation animasi = AnimationUtils.loadAnimation(this,R.xml.animasi_button);
        final MediaPlayer btn_klik = MediaPlayer.create(this,R.raw.sound_click);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                Intent intent = new Intent(Matematika_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btn_keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                view.startAnimation(animasi);
            }
        });
        btn_bangundatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                view.startAnimation(animasi);
            }
        });
        btn_pecahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                view.startAnimation(animasi);
            }
        });
        btn_kalibagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                view.startAnimation(animasi);

            }
        });
        btn_tambahkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                view.startAnimation(animasi);
                Intent intent = new Intent(Matematika_Activity.this,Materi_Matematika.class);
                startActivity(intent);
            }
        });
    }
}
