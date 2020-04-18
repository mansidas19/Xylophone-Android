package com.londonappbrewery.xylophonepm;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes aa = new AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build();

            // TODO: Create a new SoundPool
            mSoundPool = new SoundPool.Builder()
                    .setMaxStreams(NR_OF_SIMULTANEOUS_SOUNDS)
                    .setAudioAttributes(aa)
                    .build();
            mCSoundId = mSoundPool.load(this, R.raw.note1_c, 1);
            mDSoundId = mSoundPool.load(this, R.raw.note2_d, 1);
            mESoundId = mSoundPool.load(this, R.raw.note3_e, 1);
            mFSoundId = mSoundPool.load(this, R.raw.note4_f, 1);
            mGSoundId = mSoundPool.load(this, R.raw.note5_g, 1);
            mASoundId = mSoundPool.load(this, R.raw.note6_a, 1);
            mBSoundId = mSoundPool.load(this, R.raw.note7_b, 1);
        }else {
            mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);
            mCSoundId = mSoundPool.load(this, R.raw.note1_c, 1);
            mDSoundId = mSoundPool.load(this, R.raw.note2_d, 1);
            mESoundId = mSoundPool.load(this, R.raw.note3_e, 1);
            mFSoundId = mSoundPool.load(this, R.raw.note4_f, 1);
            mGSoundId = mSoundPool.load(this, R.raw.note5_g, 1);
            mASoundId = mSoundPool.load(this, R.raw.note6_a, 1);
            mBSoundId = mSoundPool.load(this, R.raw.note7_b, 1);
        }


        // TODO: Load and get the IDs to identify the sounds


    }

    public void playC(View view) {mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playD(View view) {mSoundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playE(View view) {mSoundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playF(View view) {mSoundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playG(View view) {mSoundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playA(View view) {mSoundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playB(View view) {mSoundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    // TODO: Add the play methods triggered by the buttons



}
