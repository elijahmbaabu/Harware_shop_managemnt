package com.example.harware_shop_managemnt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name, password;
    Button btn_log;
    TextView r_register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.username);
        password = findViewById(R.id.user_password);
        btn_log = findViewById(R.id.btn_log);
        r_register =findViewById(R.id.register_redirect);

        r_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        });

        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LogUser();
            }

            private void LogUser() {
                String username = name.getText().toString();
                String Password = password.getText().toString();

                if (!username.isEmpty() && !Password.isEmpty() ){

                }
            }
        });
    }
}