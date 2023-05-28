package com.example.shareappdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView share = findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String Body = "Download this App";
                String Sub = "https://play.google.com";
                intent.putExtra(Intent.EXTRA_TEXT, Body);
                intent.putExtra(Intent.EXTRA_TEXT, Sub);
                startActivity(Intent.createChooser(intent, "Share using"));

            }
        });
    }
}