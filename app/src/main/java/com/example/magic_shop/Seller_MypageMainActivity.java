package com.example.magic_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seller_MypageMainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seller_activity_mypage_main);
        getWindow().setWindowAnimations(0);

        Button btn_mypage = (Button) findViewById(R.id.btn_mypage);
        btn_mypage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mypage_MainActivity.class);
                startActivity(intent);
            }
        });

        Button btn_manager = (Button) findViewById(R.id.btn_manager);
        btn_manager.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Manager_MainActivity.class);
                startActivity(intent);
            }
        });

        Button imageButton = (Button) findViewById(R.id.btn_setting);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mypage_SettingActivity.class);
                startActivity(intent);
            }
        });

        Button btn_product_list = (Button) findViewById(R.id.btn_product_list);
        btn_product_list.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Seller_ProductListActivity.class);
                startActivity(intent);
            }
        });

        Button btn_product_register = (Button) findViewById(R.id.btn_product_register);
        btn_product_register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Seller_ProductRegisterActivity.class);
                startActivity(intent);
            }
        });

        Button btn_product_revise = (Button) findViewById(R.id.btn_product_revise);
        btn_product_revise.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Seller_ProductReviseActivity.class);
                startActivity(intent);
            }
        });

        Button btn_product_delete = (Button) findViewById(R.id.btn_product_delete);
        btn_product_delete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Seller_ProductDeleteActivity.class);
                startActivity(intent);
            }
        });

        Button btn_order_delivery_list = (Button) findViewById(R.id.btn_order_delivery_list);
        btn_order_delivery_list.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Seller_OrderDeliveryListActivity.class);
                startActivity(intent);
            }
        });

        Button btn_refund_exchange_list = (Button) findViewById(R.id.btn_refund_exchange_list);
        btn_refund_exchange_list.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Seller_RefundExchangeListActivity.class);
                startActivity(intent);
            }
        });

        Button btn_review_write = (Button) findViewById(R.id.btn_review_list);
        btn_review_write.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Seller_ReviewListActivity.class);
                startActivity(intent);
            }
        });
    }

}
