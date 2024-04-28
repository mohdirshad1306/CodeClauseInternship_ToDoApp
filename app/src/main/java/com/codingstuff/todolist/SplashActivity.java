package com.codingstuff.todolist;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {
    TextView textView;
    LottieAnimationView lottie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();
//
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(SplashActivity.this , MainActivity.class));
//                finish();
//            }
//        } , 4000);

        textView=findViewById(R.id.textView);
        //lottie=findViewById(R.id.lottie_layer_name);

//        textView.animate().translationX(-1400).setDuration(2700).setStartDelay(0);
//        lottie.animate().translationX(2000).setDuration(2700).setStartDelay(0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent i=new Intent(getApplicationContext(),MainActivity.class);
               startActivity(i);
               finish();
//
            }
        },5000);

    }
}