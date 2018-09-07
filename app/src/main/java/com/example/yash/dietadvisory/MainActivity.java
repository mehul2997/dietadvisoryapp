package com.example.yash.dietadvisory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final Button s,l;

        l=(Button)findViewById(R.id.log) ;
        s=(Button)findViewById(R.id.sig) ;

        l.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                     Intent intents = new Intent(MainActivity.this, login.class);
                                     startActivity(intents);
                                 }
                             });

                s.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intents = new Intent(MainActivity.this, signup.class);
                        startActivity(intents);
                    }

                });

}}