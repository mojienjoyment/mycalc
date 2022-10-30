package com.example.myapplication99;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtnum1;
    private EditText txtnum2;
    private TextView txtres;
    private Button btjam;
    private Button bttaf;
    private Button btmul;
    private Button btdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1=(EditText) findViewById(R.id.txt1);
        txtnum2=(EditText) findViewById(R.id.txt2);
        txtres=(TextView) findViewById(R.id.txtresult);
        btjam=(Button) findViewById(R.id.btnjam);
        bttaf=(Button) findViewById(R.id.btntaf);
        btmul=(Button) findViewById(R.id.btnmul);
        btdiv=(Button) findViewById(R.id.btndiv);


        btjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(txtnum1.getText().toString());
                double num2=Double.parseDouble(txtnum2.getText().toString());
                double result=num1+num2;
                String res=String.valueOf(result);
                txtres.setText(res);

            }
        });

        bttaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(txtnum1.getText().toString());
                double num2=Double.parseDouble(txtnum2.getText().toString());
                double result=num1-num2;
                String res=String.valueOf(result);
                txtres.setText(res);
            }
        });
        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(txtnum1.getText().toString());
                double num2=Double.parseDouble(txtnum2.getText().toString());
                double result=num1*num2;
                String res=String.valueOf(result);
                txtres.setText(res);
            }
        });
        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double num1=Double.parseDouble(txtnum1.getText().toString());
                double num2=Double.parseDouble(txtnum2.getText().toString());
                double result=num1/num2;
                String res=String.valueOf(result);
                txtres.setText(res);
            }
        });
    }
}