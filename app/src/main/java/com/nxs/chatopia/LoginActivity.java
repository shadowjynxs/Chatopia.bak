package com.nxs.chatopia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    TextView gotoSignup;
    EditText lEmail, lPasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        gotoSignup = findViewById(R.id.gotoSignup);
        lEmail = findViewById(R.id.lEmail);
        lPasswd = findViewById(R.id.lPasswd);

        gotoSignup.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), RegisterActivity.class)));
    }
}