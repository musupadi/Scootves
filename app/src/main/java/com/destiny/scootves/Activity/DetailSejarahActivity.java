package com.destiny.scootves.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.scootves.Model.Model;
import com.destiny.scootves.Model.SejarahData;
import com.destiny.scootves.R;

import java.util.ArrayList;

public class DetailSejarahActivity extends AppCompatActivity {

    ImageView gambar;
    TextView detail;
    private ArrayList<Model> pList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sejarah);

        gambar=(ImageView)findViewById(R.id.ivImage);
        detail=(TextView)findViewById(R.id.tvDetail);
        Intent data = getIntent();
        String Sejarah = data.getStringExtra("SEJARAH");
        pList.addAll(SejarahData.getListData());

        detail.setText(pList.get(Integer.parseInt(Sejarah)).getSejarahDetail());
        Glide.with(DetailSejarahActivity.this)
                .load(pList.get(Integer.parseInt(Sejarah)).getSejarahGambar())
                .into(gambar);
    }
}
