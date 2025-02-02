package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnclr, btnequal, btnpoint, btnadd, btnsub, btndiv, btnmul;
    TextView result;
    Boolean dotClick=false;
    int status=0;
    double firstvalue,secondvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn0 = findViewById(R.id.btn_0);
        btnpoint = findViewById(R.id.btn_point);
        btnadd = findViewById(R.id.btn_add);
        btnsub = findViewById(R.id.btn_sub);
        btnmul = findViewById(R.id.btn_mul);
        btndiv = findViewById(R.id.btn_div);
        btnequal = findViewById(R.id.btn_equal);
        btnclr = findViewById(R.id.btn_clr);
        result=findViewById(R.id.result);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "0");
            }
        });
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                firstvalue=0;
                secondvalue=0;
            }
        });
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dotClick==false){
                    result.setText(result.getText().toString()+".");
                    dotClick=true;
                }
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status=1;
                firstvalue=Double.parseDouble(result.getText().toString());
                result.setText("");
                dotClick=false;
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status=2;
                firstvalue=Double.parseDouble(result.getText().toString());
                result.setText("");
                dotClick=false;
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status=3;
                firstvalue=Double.parseDouble(result.getText().toString());
                result.setText("");
                dotClick=false;
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status=4;
                firstvalue=Double.parseDouble(result.getText().toString());
                result.setText("");
                dotClick=false;
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status==1){
                    secondvalue=Double.parseDouble(result.getText().toString());
                    double totalVlaue=firstvalue+secondvalue;
                    result.setText(""+totalVlaue);
                }
                else if(status==2){
                    secondvalue=Double.parseDouble(result.getText().toString());
                    double totalVlaue=firstvalue-secondvalue;
                    result.setText(""+totalVlaue);
                }
                else if(status==3){
                    secondvalue=Double.parseDouble(result.getText().toString());
                    double totalVlaue=firstvalue*secondvalue;
                    result.setText(""+totalVlaue);
                }
                else if (status==4){
                    secondvalue=Double.parseDouble(result.getText().toString());
                    double totalVlaue=firstvalue/secondvalue;
                    result.setText(""+totalVlaue);
                }
                else{
                    result.setText("");
                }

            }
        });


    }
}