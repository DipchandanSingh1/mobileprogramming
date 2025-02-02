package com.example.classassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ServicesActivity extends AppCompatActivity {
    Button goto_back,goto_home,goto_contact,goto_about;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.services_page);
        goto_back=findViewById(R.id.backtomain);
        goto_home=findViewById(R.id.home_page);
        goto_about=findViewById(R.id.aboutus);
        goto_contact=findViewById(R.id.contact_us);

        goto_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ServicesActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        goto_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ServicesActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

        goto_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ServicesActivity.this, AboutActivity.class);
                startActivity(i);
            }
        });
        goto_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ServicesActivity.this, ContactActivity.class);
                startActivity(i);
            }
        });

    }
}
