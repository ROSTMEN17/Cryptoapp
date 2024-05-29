package com.example.myapplication.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.myapplication.Adapter.CrtproAdapter;
import com.example.myapplication.Adapter.StockAdapter;
import com.example.myapplication.Damain.domain;
import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
ArrayList<Integer> lineData = new ArrayList<>();
ArrayList<Integer> lineData2 = new ArrayList<>();
ArrayList<Integer> lineData3 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setData();
        recylcerViewCrypto();
        recylcerViewStock();
    }

    private void recylcerViewCrypto(){
        binding.cryptoView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
// tyt nada API
        ArrayList<domain> domainArrayList = new ArrayList<>();
        domainArrayList.add(new domain("bitcoin","BTX",1234.12,2.13,lineData,1234.12,0.1234));
        domainArrayList.add(new domain("etherium","ETH",2134.21,-1.13,lineData2,6545.65,0.12345));
        domainArrayList.add(new domain("trox","ROX",6543.21,0.73,lineData3,31234.12,0.02154));

        binding.cryptoView.setAdapter(new CrtproAdapter(domainArrayList));
    }
    private void recylcerViewStock(){
        binding.stockView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
// tyt nada API
        ArrayList<domain> domainArrayList = new ArrayList<>();
        domainArrayList.add(new domain("NASDAQ100","BTX",1234.12,2.13,lineData,1234.12,0.1234));
        domainArrayList.add(new domain("S&P 500","ETH",2134.21,-1.13,lineData2,6545.65,0.12345));
        domainArrayList.add(new domain("Dow Jones","ROX",6543.21,0.73,lineData3,31234.12,0.02154));

        binding.stockView.setAdapter(new StockAdapter(domainArrayList));
    }

    private void setData(){
        // tyt nada API
        lineData.add(1000);
        lineData.add(1100);
        lineData.add(1200);
        lineData.add(1100);

        lineData2.add(2100);
        lineData2.add(2000);
        lineData2.add(1900);
        lineData2.add(2000);

        lineData3.add(900);
        lineData3.add(1100);
        lineData3.add(1200);
        lineData3.add(1000);
        lineData3.add(1150);
    }

}
