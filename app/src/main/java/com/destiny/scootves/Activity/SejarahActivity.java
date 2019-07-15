package com.destiny.scootves.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.destiny.scootves.R;

public class SejarahActivity extends AppCompatActivity {

    ImageView scooter,vespa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);
        scooter=(ImageView)findViewById(R.id.ivScooter);
        vespa=(ImageView)findViewById(R.id.ivVespa);
        scooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(SejarahActivity.this, DetailSejarahActivity.class);
                goInput.putExtra("SEJARAH","0");
                SejarahActivity.this.startActivities(new Intent[]{goInput});
            }
        });
        vespa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(SejarahActivity.this, DetailSejarahActivity.class);
                goInput.putExtra("SEJARAH","1");
                SejarahActivity.this.startActivities(new Intent[]{goInput});
            }
        });
    }
}
