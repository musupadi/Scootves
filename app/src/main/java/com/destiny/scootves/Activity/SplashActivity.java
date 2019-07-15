package com.destiny.scootves.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.destiny.scootves.R;

public class SplashActivity extends AppCompatActivity {
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        click=(Button)findViewById(R.id.btnClick);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
