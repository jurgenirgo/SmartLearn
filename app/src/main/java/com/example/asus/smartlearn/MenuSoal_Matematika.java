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

public class MenuSoal_Matematika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_soal__matematika);

        ImageButton btn_cek = (ImageButton)findViewById(R.id.btn_cek);
        @SuppressLint("ResourceType") final Animation animasi = AnimationUtils.loadAnimation(this,R.xml.animasi_button);
        final MediaPlayer btn_klik = MediaPlayer.create(this,R.raw.sound_click);

        btn_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                Intent intent = new Intent(MenuSoal_Matematika.this,MenuScore.class);
                startActivity(intent);
            }
        });
    }
}
