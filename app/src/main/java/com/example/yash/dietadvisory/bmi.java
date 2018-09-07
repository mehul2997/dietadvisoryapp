package com.example.yash.dietadvisory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class bmi extends AppCompatActivity {
    Button a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        a = (Button)findViewById(R.id.uv);
        b = (Button)findViewById(R.id.n);
        c = (Button)findViewById(R.id.ow);
        d = (Button)findViewById(R.id.o);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents = new Intent(bmi.this, uv.class);
                startActivity(intents);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents = new Intent(bmi.this, n.class);
                startActivity(intents);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents = new Intent(bmi.this, Overweight.class);
                startActivity(intents);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents = new Intent(bmi.this, o.class);
                startActivity(intents);
            }
        });
}
}
