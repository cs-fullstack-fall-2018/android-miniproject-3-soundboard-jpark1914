package org.code_crew.soundboard;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int sound1, sound2, sound3, sound4, sound5, sound6;
    private SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        soundPool = new SoundPool.Builder()
                .setMaxStreams(6)
                .setAudioAttributes(audioAttributes)
                .build();

        sound1 = soundPool.load(this,R.raw.sound1,1);
        sound2 = soundPool.load(this,R.raw.sound2,1);
        sound3 = soundPool.load(this,R.raw.sound3, 1);
        sound4 = soundPool.load(this, R.raw.sound4, 1);
        sound5 = soundPool.load(this, R.raw.sound5, 1);


    }

    public void soundOn(View view) {
        switch (view.getId()){
            case (R.id.sound1):
                soundPool.play(sound1, 1,1,0,0,1);
                break;
            case(R.id.sound2):
                soundPool.play(sound2,1,1,0,0,1);
                break;
            case(R.id.sound3):
                soundPool.play(sound3, 1,1,0,0,1);
                break;
            case(R.id.sound4):
                soundPool.play(sound4, 1,1,0,0,1);
                break;
            case(R.id.sound5):
                soundPool.play(sound5, 1,1,0,0,1);
                break;

        }
    }

}
