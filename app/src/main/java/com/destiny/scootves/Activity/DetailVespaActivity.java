package com.destiny.scootves.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.scootves.R;

public class DetailVespaActivity extends AppCompatActivity {
    ImageView gambar;
    TextView nama,tahun,detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_vespa);

        gambar=(ImageView)findViewById(R.id.ivPhoto);
        nama=(TextView)findViewById(R.id.tvNamaVespa);
        tahun=(TextView)findViewById(R.id.tvTahun);
        detail=(TextView)findViewById(R.id.tvDetail);
        Intent data = getIntent();
        String Nama = data.getStringExtra("NAMA");
        String Tahun = data.getStringExtra("TAHUN");
        String Detail = data.getStringExtra("DETAIL");
        String Gambar = data.getStringExtra("GAMBAR");
        nama.setText(Nama);
        tahun.setText(Tahun);
        detail.setText(Detail);
        Glide.with(DetailVespaActivity.this)
                .load(Gambar)
                .into(gambar);
    }
}
