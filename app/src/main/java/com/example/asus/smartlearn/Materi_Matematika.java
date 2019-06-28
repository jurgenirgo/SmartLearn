package com.example.asus.smartlearn;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class Materi_Matematika extends AppCompatActivity {
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi__matematika);
        @SuppressLint("ResourceType") final Animation animasi = AnimationUtils.loadAnimation(this,R.xml.animasi_button);
        final MediaPlayer btn_klik = MediaPlayer.create(this,R.raw.sound_click);
        ImageButton btn_soal = (ImageButton)findViewById(R.id.btn_soal);
        ImageButton btn_back = (ImageButton)findViewById(R.id.btn_back);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                Intent intent = new Intent(Materi_Matematika.this,Matematika_Activity.class);
                startActivity(intent);
            }
        });
        btn_soal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog_rules);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

                ImageButton btn_yes = (ImageButton)dialog.findViewById(R.id.btn_yes);
                ImageButton btn_no = (ImageButton)dialog.findViewById(R.id.btn_no);

                btn_no.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btn_klik.start();
                        dialog.dismiss();
                    }
                });
                btn_yes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btn_klik.start();
                        dialog.dismiss();
                        Intent intent = new Intent(Materi_Matematika.this,MenuSoal_Matematika.class);
                        startActivity(intent);
                    }
                });
                dialog.show();

            }
        });
    }
}
