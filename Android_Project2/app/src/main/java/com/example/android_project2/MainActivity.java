package com.example.android_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText w = findViewById(R.id.number1);
        final EditText x = findViewById(R.id.number2);
        Button a = findViewById(R.id.button1);
        Button b = findViewById(R.id.button2);
        Button c = findViewById(R.id.button3);
        Button d = findViewById(R.id.button4);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1String = w.getText().toString();
                String number2String = x.getText().toString();
                double number1 = Double.parseDouble(number1String);
                double number2 = Double.parseDouble(number2String);
                double Sum = number1 + number2;
                Toast.makeText(MainActivity.this, "The Sum is " + Sum, Toast.LENGTH_SHORT).show();

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1String = w.getText().toString();
                String number2String = x.getText().toString();
                double number1 = Double.parseDouble(number1String);
                double number2 = Double.parseDouble(number2String);
                double Difference = number1 - number2;
                Toast.makeText(MainActivity.this, "The Difference is " + Difference, Toast.LENGTH_SHORT).show();





            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1String = w.getText().toString();
                String number2String = x.getText().toString();
                double number1 = Double.parseDouble(number1String);
                double number2 = Double.parseDouble(number2String);
                double Product = number1 * number2;
                Toast.makeText(MainActivity.this, "The Product is " + Product, Toast.LENGTH_SHORT).show();


            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1String = w.getText().toString();
                String number2String = x.getText().toString();
                double number1 = Double.parseDouble(number1String);
                double number2 = Double.parseDouble(number2String);
                double Quotient = number1/number2;
                Toast.makeText(MainActivity.this, "The Quotient is " + Quotient, Toast.LENGTH_SHORT).show();


            }
        });
    }
}