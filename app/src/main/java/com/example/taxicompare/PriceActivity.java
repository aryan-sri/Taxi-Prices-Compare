package com.example.taxicompare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PriceActivity extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        button1 = findViewById(R.id.button3);
        button2 = findViewById(R.id.button4);
        button3 = findViewById(R.id.button5);
        button4 = findViewById(R.id.button6);
        button5 = findViewById(R.id.button7);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.uber.com/in/en/ride/"));
                startActivity(i);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://book.olacabs.com/"));
                startActivity(i);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.rapido.bike/"));
                startActivity(i);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.meru.in/"));
                startActivity(i);
            }
        });
//        button5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(""));
//                startActivity(i);
//            }
//        });


    }
}