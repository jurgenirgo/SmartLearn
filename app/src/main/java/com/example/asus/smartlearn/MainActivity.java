package com.example.asus.smartlearn;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint("ResourceType") final Animation animasi = AnimationUtils.loadAnimation(this,R.xml.animasi_button);
        ImageButton btn_matematika = (ImageButton)findViewById(R.id.btn_mtk);
        ImageButton btn_bindo = (ImageButton)findViewById(R.id.btn_bindo);
        final MediaPlayer btn_klik = MediaPlayer.create(this,R.raw.sound_click);

        final ImageButton btn_exit = (ImageButton)findViewById(R.id.btn_exit);

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog_exit);
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
                        finish();
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                });
                dialog.show();
            }
        });



        btn_bindo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                view.startAnimation(animasi);
            }
        });
        btn_matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_klik.start();
                view.startAnimation(animasi);
                Intent intent = new Intent(MainActivity.this,Matematika_Activity.class);
                startActivity(intent);
            }
        });

    }
}
