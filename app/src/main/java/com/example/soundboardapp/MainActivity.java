package com.example.soundboardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Button augh, booWomp, drumRoll, quanDale, vineBoom, source, badBone, cloaker, tenyear;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        augh = (Button)findViewById(R.id.aughBtn);
        augh.setOnClickListener(playSound);
        booWomp = (Button)findViewById(R.id.wompBtn);
        booWomp.setOnClickListener(playSound);
        drumRoll = (Button)findViewById(R.id.drumBtn);
        drumRoll.setOnClickListener(playSound);
        quanDale = (Button)findViewById(R.id.dingleBtn);
        quanDale.setOnClickListener(playSound);
        vineBoom = (Button) findViewById(R.id.vineBtn);
        vineBoom.setOnClickListener(playSound);
        source = (Button)findViewById(R.id.sourceBtn);
        source.setOnClickListener(playSound);
        badBone = (Button)findViewById(R.id.boneBtn);
        badBone.setOnClickListener(playSound);
        cloaker = (Button)findViewById(R.id.cloaker);
        cloaker.setOnClickListener(playSound);
        tenyear = (Button)findViewById(R.id.tenyears);
        tenyear.setOnClickListener(playSound);
        image = (ImageView) findViewById(R.id.imageView);
    }

    View.OnClickListener playSound = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sponchbox);
            }
            switch (view.getId()) {
                case R.id.aughBtn:
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.augh);
                    mediaPlayer.start();
                    image.setImageResource(R.drawable.augh);
                    break;
                case R.id.wompBtn:
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.boowomp);
                    mediaPlayer.start();
                    image.setImageResource(R.drawable.boowomp);
                    break;
                case R.id.drumBtn:
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.drumroll);
                    mediaPlayer.start();
                    image.setImageResource(R.drawable.drums);
                    break;
                case R.id.dingleBtn:
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.quandale);
                    mediaPlayer.start();
                    image.setImageResource(R.drawable.quandale);
                    break;
                case R.id.vineBtn:
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vineboom);
                    mediaPlayer.start();
                    image.setImageResource(R.drawable.biner);
                    break;
                case R.id.sourceBtn:
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.nosource);
                    mediaPlayer.start();
                    image.setImageResource(R.drawable.armstrong);
                case R.id.boneBtn:
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.badbone);
                    mediaPlayer.start();
                    image.setImageResource(R.drawable.badbone);
                    break;
                case R.id.cloaker:
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cloak);
                    mediaPlayer.start();
                    image.setImageResource(R.drawable.cloamker);
                    break;
                case R.id.tenyears:
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.tenyears);
                    mediaPlayer.start();
                    image.setImageResource(R.drawable.tenyear);
                    break;
            }
        }
    };
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
}