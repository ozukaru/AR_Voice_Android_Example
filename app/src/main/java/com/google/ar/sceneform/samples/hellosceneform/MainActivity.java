package com.google.ar.sceneform.samples.hellosceneform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button AugmentReality;
    Button Voice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AugmentReality = findViewById(R.id.buttonAR);

        AugmentReality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HelloSceneformActivity.class);
                startActivity(intent);
            }
        });
        Voice = findViewById(R.id.btnVoice);
        Voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVoice = new Intent(MainActivity.this,VoiceActivity.class);
                startActivity(intentVoice);
            }
        });

    }
}
