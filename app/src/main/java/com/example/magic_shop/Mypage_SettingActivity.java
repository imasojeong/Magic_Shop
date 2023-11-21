package com.example.magic_shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Mypage_SettingActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage_activity_setting);
        getWindow().setWindowAnimations(0);

        Button btn_back = (Button) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mypage_MainActivity.class);
                startActivity(intent);
            }
        });

        Button btn_user_info = (Button) findViewById(R.id.btn_user_info);
        btn_user_info.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mypage_InputPasswordActivity.class);
                startActivity(intent);
            }
        });

        Button btn_change_password = (Button) findViewById(R.id.btn_change_password);
        btn_change_password.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mypage_ChangePasswordActivity.class);
                startActivity(intent);
            }
        });

        Button btn_delivery_address_manage = (Button) findViewById(R.id.btn_delivery_address_manage);
        btn_delivery_address_manage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mypage_DeliveryAddressManageActivity.class);
                startActivity(intent);
            }
        });

        Button btn_refund_account_manage = (Button) findViewById(R.id.btn_refund_account_manage);
        btn_refund_account_manage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mypage_RefundAccountManageActivity.class);
                startActivity(intent);
            }
        });
    }

}
