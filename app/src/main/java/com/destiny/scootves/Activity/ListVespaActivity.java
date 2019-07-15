package com.destiny.scootves.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.destiny.scootves.Adapter.AdapterVespa;
import com.destiny.scootves.Model.Model;
import com.destiny.scootves.Model.VespaData;
import com.destiny.scootves.R;

import java.util.ArrayList;

public class ListVespaActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Model> pList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_vespa);
        rvCategory = (RecyclerView)findViewById(R.id.recycler);
        rvCategory.setLayoutManager(new LinearLayoutManager(ListVespaActivity.this));
        pList.addAll(VespaData.getListData());
        AdapterVespa cardViewPresidentAdapter = new AdapterVespa(ListVespaActivity.this);
        cardViewPresidentAdapter.setListVespa(pList);
        rvCategory.setAdapter(cardViewPresidentAdapter);
    }
}
