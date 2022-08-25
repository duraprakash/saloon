package com.infotech.sassysaloon.ui.SplashScreenActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.infotech.sassysaloon.R;
import com.infotech.sassysaloon.ui.GetStartedActivity.GetStartedActivity;

public class SplashScreenActivity extends AppCompatActivity {

    // using handler library
    Handler handler;
    ImageView ivLogo;
    TextView tvSassy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();
        ivLogo = findViewById(R.id.ivLogo);
        tvSassy = findViewById(R.id.tvSassy);


        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        ivLogo.startAnimation(animation);
        tvSassy.startAnimation(animation);

        handler=new Handler();
        // code to delay splash screen for 3 sec
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this, GetStartedActivity.class));
                finish();
            }
        },3000); // set 3000 for 3 sec delay


    }
}