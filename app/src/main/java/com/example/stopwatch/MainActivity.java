package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSplash,tvSubSplash;
    Button btnget;
    Animation alg,btn1,btn2;
    ImageView ivSplash;



    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        tvSplash =findViewById ( R.id.tvSplash );
        tvSubSplash =findViewById ( R.id.tvSubSplash );
        btnget =findViewById ( R.id.btnget );
        ivSplash =findViewById ( R.id.ivSplash );

       alg = AnimationUtils.loadAnimation ( this,R.anim.alg );
        btn1 = AnimationUtils.loadAnimation ( this,R.anim.btn1 );
        btn2 = AnimationUtils.loadAnimation ( this,R.anim.btn2 );




        ivSplash.startAnimation ( alg );
        tvSplash.startAnimation ( btn1 );
        tvSubSplash.startAnimation ( btn1 );
        btnget.startAnimation ( btn2 );

        btnget.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick (View v) {
                Intent a =new Intent ( MainActivity.this,stopAct.class );
                a.addFlags ( Intent.FLAG_ACTIVITY_NO_ANIMATION );
                startActivity ( a );
            }
        } );

        Typeface MLight = Typeface.createFromAsset ( getAssets (), "fonts/MLight.ttf" );
        Typeface MMedium = Typeface.createFromAsset ( getAssets (), "fonts/MMedium.ttf" );
        Typeface MRegular = Typeface.createFromAsset ( getAssets (), "fonts/MRegular.ttf" );

        tvSplash.setTypeface ( MRegular );
        tvSubSplash.setTypeface ( MLight );
        btnget.setTypeface ( MMedium );
    }
}
