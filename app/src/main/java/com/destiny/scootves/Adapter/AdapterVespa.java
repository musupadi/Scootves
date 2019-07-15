package com.destiny.scootves.Adapter;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.scootves.Activity.DetailVespaActivity;
import com.destiny.scootves.Model.Model;
import com.destiny.scootves.R;

import java.util.ArrayList;

public class AdapterVespa extends RecyclerView.Adapter<AdapterVespa.CardViewViewHolder>{
    private Context context;
    private ArrayList<Model> listVespa;
    private ArrayList<Model> getListVespa() {
        return listVespa;
    }
    public void setListVespa(ArrayList<Model> listVespa) {
        this.listVespa = listVespa;
    }
    public AdapterVespa(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vespa_list, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder cardViewViewHolder, int i) {
        final Model p = getListVespa().get(i);
        Glide.with(context)
                .load(p.getGambarVespa())
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.tvNama.setText(p.getNamaVespa());
        cardViewViewHolder.tvTahun.setText(p.getTahunVespa());
        cardViewViewHolder.layoutCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(context, DetailVespaActivity.class);
                goInput.putExtra("NAMA",p.getNamaVespa());
                goInput.putExtra("TAHUN",p.getTahunVespa());
                goInput.putExtra("DETAIL",p.getDetailVespa());
                goInput.putExtra("GAMBAR",p.getGambarVespa());
                context.startActivities(new Intent[]{goInput});
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListVespa().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvNama, tvTahun;
        LinearLayout layoutCardView;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvNama = itemView.findViewById(R.id.tvNamaVespa);
            tvTahun = itemView.findViewById(R.id.tvTahun);
            layoutCardView = itemView.findViewById(R.id.LayoutCardView);
        }
    }
}



