package com.example.keval.e_moss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class KioskCenter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiosk_center);

        TextView t1, t2, t3, t4, t5, t6, t7, t8, t9;
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.textView4);
        t5 = (TextView) findViewById(R.id.textView5);
        t6 = (TextView) findViewById(R.id.textView6);
        t7 = (TextView) findViewById(R.id.textView7);
        t8 = (TextView) findViewById(R.id.textView8);
        t9 = (TextView) findViewById(R.id.textView9);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KioskCenter.this, MapsActivity.class);
                i.putExtra("value", 1);
                startActivity(i);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KioskCenter.this, MapsActivity.class);
                i.putExtra("value", 2);
                startActivity(i);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KioskCenter.this, MapsActivity.class);
                i.putExtra("value", 3);
                startActivity(i);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KioskCenter.this, MapsActivity.class);
                i.putExtra("value", 4);
                startActivity(i);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KioskCenter.this, MapsActivity.class);
                i.putExtra("value", 5);
                startActivity(i);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KioskCenter.this, MapsActivity.class);
                i.putExtra("value", 6);
                startActivity(i);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KioskCenter.this, MapsActivity.class);
                i.putExtra("value", 7);
                startActivity(i);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KioskCenter.this, MapsActivity.class);
                i.putExtra("value", 8);
                startActivity(i);
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KioskCenter.this, MapsActivity.class);
                i.putExtra("value", 9);
                startActivity(i);
            }
        });

    }
}