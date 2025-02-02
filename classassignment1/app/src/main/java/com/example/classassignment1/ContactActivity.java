package com.example.classassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {
    Button goto_back,goto_home,goto_about,goto_services;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_page);

        goto_back=findViewById(R.id.backtomain);
        goto_home=findViewById(R.id.home_page);
        goto_about=findViewById(R.id.aboutus);
        goto_services=findViewById(R.id.services);

        goto_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ContactActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        goto_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ContactActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

        goto_services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ContactActivity.this, ServicesActivity.class);
                startActivity(i);
            }
        });
        goto_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ContactActivity.this, AboutActivity.class);
                startActivity(i);
            }
        });

    }
}
