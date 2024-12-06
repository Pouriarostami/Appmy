package com.example.crmapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AddCustomerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);

        findViewById(R.id.btn_save_customer).setOnClickListener(view -> {
            EditText nameField = findViewById(R.id.edit_name);
            EditText phoneField = findViewById(R.id.edit_phone);

            String name = nameField.getText().toString();
            String phone = phoneField.getText().toString();

            if (!name.isEmpty() && !phone.isEmpty()) {
                // ذخیره مشتری (در اینجا می‌توانید اطلاعات را در دیتابیس ذخیره کنید)
                Toast.makeText(AddCustomerActivity.this, "مشتری ذخیره شد", Toast.LENGTH_SHORT).show();
                finish(); // بازگشت به صفحه قبل
            } else {
                Toast.makeText(AddCustomerActivity.this, "لطفاً تمام فیلدها را پر کنید", Toast.LENGTH_SHORT).show();
            }
        });
    }
}