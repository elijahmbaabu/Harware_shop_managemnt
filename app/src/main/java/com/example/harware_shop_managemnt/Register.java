package com.example.harware_shop_managemnt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    EditText username, password;
    TextView sign_redirect;
    Button sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.username);
        password =findViewById(R.id.user_password);
        sign_redirect = findViewById(R.id.log_redirect);
        sign_up = findViewById(R.id.btn_register);

    }
}