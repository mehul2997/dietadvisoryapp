package com.example.yash.dietadvisory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread th=new Thread(){
            @Override
            public void run() {
                try{
                    sleep(4000);
                }catch (Exception e){
                    e.printStackTrace();

                }
                finally {
                    Intent obj = new Intent(splash.this, MainActivity.class);
                    startActivity(obj);
                }

            }
        };
        th.start();




    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}


