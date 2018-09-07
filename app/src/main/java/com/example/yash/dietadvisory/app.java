package com.example.yash.dietadvisory;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        Button logout,b,ca,ta;
        logout=(Button)findViewById(R.id.button);
        b=(Button)findViewById(R.id.bmi);
        ca=(Button)findViewById(R.id.c);
        ta=(Button)findViewById(R.id.t);


        logout.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedpreferences = getSharedPreferences(login.SHARED_PREF_NAME, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.clear();
                editor.commit();
                Intent intent=new Intent(app.this,MainActivity.class);
                startActivity(intent);

            }
        });
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(app.this,calc.class);
                startActivity(intent);

            }
        });
        ca.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(app.this,chart.class);
                startActivity(intent);

            }
        });
        ta.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(app.this,tip.class);
                startActivity(intent);

            }
        });
    }
}
