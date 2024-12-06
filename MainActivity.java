package com.example.crmapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        findViewById(R.id.btn_customers).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CustomerListActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_add_customer).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddCustomerActivity.class);
            startActivity(intent);
        });
    }
}