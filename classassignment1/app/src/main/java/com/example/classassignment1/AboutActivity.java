package com.example.classassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {
    Button goto_back,goto_home,goto_contact,goto_services;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_page);

        goto_back=findViewById(R.id.backtomain);
        goto_home=findViewById(R.id.home_page);
        goto_contact=findViewById(R.id.contact_us);
        goto_services=findViewById(R.id.services);


        goto_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AboutActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        goto_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AboutActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

        goto_services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AboutActivity.this, ServicesActivity.class);
                startActivity(i);
            }
        });
        goto_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AboutActivity.this, ContactActivity.class);
                startActivity(i);
            }
        });



    }
}
