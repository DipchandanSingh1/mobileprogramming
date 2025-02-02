package com.example.simplecalculator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

// Activity class
public class MainActivity extends AppCompatActivity {

    //ui defined component
    Button add, subtract, gotobutton,goto_third,goto_fourth;
    TextView result;
    int counter = 0;
    EditText et;
    EditText ed;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //introduce your layout
        setContentView(R.layout.activity_main);

        //object initialization using id
        add = findViewById(R.id.add_data);
        subtract = findViewById(R.id.subtract_data);
        result = findViewById(R.id.display_value);
        gotobutton=findViewById(R.id.next_screen_button);
        goto_third=findViewById(R.id.gottothird);
        goto_fourth=findViewById(R.id.gotofourth);
        et=findViewById(R.id.typedvalue);
        ed=findViewById(R.id.newtypedvalue);

        goto_fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,FourthActivity.class);
                Bundle b=new Bundle();
                String value=ed.getText().toString();
                b.putString("abc",value);
                i.putExtras(b);
                startActivity(i);

            }
        });

        goto_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //implicit intent
                String url=et.getText().toString();
                //define an implicit inetent to browser application in our phone
                Intent i=new Intent(Intent.ACTION_VIEW);
                //stored our data to be sent along with the intent
                i.setData(Uri.parse(url));
                //started the intent
                startActivity(i);
            }
        });

        gotobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //define what needs to be done after clicking this button
                Intent i=new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // define what to do when add button is clicked
                counter++;
                result.setText("" + counter);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //define what to do when subtract button is clicked
                counter--;
                result.setText("" + counter);
            }
        });
    }
}