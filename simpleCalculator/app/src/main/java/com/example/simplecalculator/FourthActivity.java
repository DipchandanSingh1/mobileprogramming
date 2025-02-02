package com.example.simplecalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {
    Button btn;
    TextView result;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        result=findViewById(R.id.fourthvalue);
        String value=getIntent().getExtras().getString("abc");
        result.setText(value);
    }
}