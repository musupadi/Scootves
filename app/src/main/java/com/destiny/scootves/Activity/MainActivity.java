package com.destiny.scootves.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.destiny.scootves.R;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    LinearLayout Sejarah,Pengenalan,Bengkel,Tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sejarah = (LinearLayout) findViewById(R.id.btnSejarah);
        Pengenalan = (LinearLayout) findViewById(R.id.btnPengenalan);
        Bengkel = (LinearLayout) findViewById(R.id.btnBengkel);
        Tentang = (LinearLayout) findViewById(R.id.btnTentang);

        Sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SejarahActivity.class);
                startActivity(intent);
            }
        });
        Pengenalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ListVespaActivity.class);
                startActivity(intent);
            }
        });
    }
}
