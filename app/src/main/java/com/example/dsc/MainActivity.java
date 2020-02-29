package com.example.dsc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button plus,subtract;
    EditText et1,et2;
    TextView tv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus= findViewById(R.id.plus);
        subtract= findViewById(R.id.subtract);
        et1= findViewById(R.id.et1);
        et2 =findViewById(R.id.et2);
        tv= findViewById(R.id.tv);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(et1.getText().toString());
                int num2= Integer.parseInt(et2.getText().toString());
                 tv.setText(String.valueOf(num1+num2));

                et1.setText("");
                et2.setText("");
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(et1.getText().toString());
                int num2= Integer.parseInt(et2.getText().toString());
                Toast.makeText(getApplicationContext(),String.valueOf(num1-num2),Toast.LENGTH_SHORT).show();
                tv.setText(String.valueOf(num1-num2));
                et2.setText("");
                et1.setText("");
            }
        });





    }
}
