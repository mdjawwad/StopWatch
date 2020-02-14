package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class stopAct extends AppCompatActivity {

    Button btnStart;
    ImageView icanchor;
    Animation roundingalone;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_stop );

        btnStart = findViewById ( R.id.btnStart);
        icanchor = findViewById ( R.id.icanchor );


        roundingalone = AnimationUtils.loadAnimation ( this, R.anim.roundingalone );

        Typeface MMedium = Typeface.createFromAsset ( getAssets (),"fonts/MMedium.ttf" );

        btnStart.setTypeface ( MMedium );
        btnStart.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick (View v) {
                icanchor.startAnimation ( roundingalone );
            }
        } );



    }
}
