package com.example.classassignment1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button gotoBtn, goto_home,goto_about,goto_services, goto_contact;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        gotoBtn=findViewById(R.id.visiturl);
        goto_home=findViewById(R.id.home_page);
        goto_about=findViewById(R.id.aboutus);
        goto_services=findViewById(R.id.services);
        goto_contact=findViewById(R.id.contact_us);
        et=findViewById(R.id.typedvalue);



        gotoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=et.getText().toString();
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        goto_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });

        goto_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ContactActivity.class);
                startActivity(i);
            }
        });

        goto_services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ServicesActivity.class);
                startActivity(i);
            }
        });

        goto_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, AboutActivity.class);
                startActivity(i);
            }
        });



    }
}