package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv1,tv2;
Button btn;
RatingBar ratingBar3,ratingBar4;
float a,b,c;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        btn=findViewById(R.id.btn);
        ratingBar3=findViewById(R.id.ratingBar3);
        ratingBar4=findViewById(R.id.ratingBar4);
        btn.setOnClickListener(v -> {
            a=ratingBar3.getRating();
            b=ratingBar4.getRating();
            tv1.setText("Rating Bar1: "+ b + " and "+ "Rating Bar2: "+a);
            c= a + b;
            tv2.setText(String.valueOf(c));
            Toast.makeText(MainActivity.this,"Total Value"+c,Toast.LENGTH_LONG).show();
        });
    }
}