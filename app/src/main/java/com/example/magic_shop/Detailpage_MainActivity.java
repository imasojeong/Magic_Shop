package com.example.magic_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Detailpage_MainActivity extends AppCompatActivity {

    private Button btnBuy;
    private Button btnReview;
    private Button btnSize;
    private Button btnAsk;
    private Button btnHome;
    private Button btnSearch;
    private Button btnBag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailpage_activity_main);

        btnBuy = findViewById(R.id.btn_buy);
        btnReview = findViewById(R.id.reviewBtn);
        btnSize = findViewById(R.id.sizeBtn);
        btnAsk = findViewById(R.id.askBtn);
        btnHome = findViewById(R.id.home_btn);
        btnSearch = findViewById(R.id.search_btn);
        btnBag = findViewById(R.id.bag_btn);


        btnBuy.setVisibility(View.VISIBLE);
        btnReview.setVisibility(View.VISIBLE);
        btnSize.setVisibility(View.VISIBLE);
        btnAsk.setVisibility(View.VISIBLE);
        btnHome.setVisibility(View.VISIBLE);
        btnSearch.setVisibility(View.VISIBLE);
        btnBag.setVisibility(View.VISIBLE);


        // btnBuy의 클릭 이벤트 처리
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Detailpage_MainOptionSelectActivity.class);
                startActivity(intent);
            }
        });

        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Detailpage_MainReviewActivity.class);
                startActivity(intent);
            }
        });

        btnSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Detailpage_MainSizeActivity.class);
                startActivity(intent);
            }
        });

        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Detailpage_MainAskActivity.class);
                startActivity(intent);
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SearchActivity.class);
                startActivity(intent);
            }
        });

        btnBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);
            }
        });

    }

}
