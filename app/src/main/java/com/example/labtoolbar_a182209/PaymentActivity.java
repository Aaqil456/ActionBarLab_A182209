package com.example.labtoolbar_a182209;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {
    Toolbar toolbar;
    EditText etPay;
    Button btnPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        toolbar=findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        
        etPay=findViewById(R.id.valueRM);
        btnPay=findViewById(R.id.btnPay);
        
        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(PaymentActivity.this, "Thank you for paying RM "+etPay.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}