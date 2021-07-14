package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button1,button2,button3,button4;
    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        textView=findViewById(R.id.textView);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(editText1.getText().toString());
                secondValue=Integer.parseInt(editText2.getText().toString());
                ans=firstValue+secondValue;
                textView.setText("Answer is " +ans);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(editText1.getText().toString());
                secondValue=Integer.parseInt(editText2.getText().toString());
                ans=firstValue-secondValue;
                textView.setText("Answer is " +ans);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(editText1.getText().toString());
                secondValue=Integer.parseInt(editText2.getText().toString());
                ans=firstValue*secondValue;
                textView.setText("Answer is " +ans);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float firstValue,secondValue,ans;
                firstValue=Integer.parseInt(editText1.getText().toString());
                secondValue=Integer.parseInt(editText2.getText().toString());
                ans=firstValue/secondValue;
                textView.setText("Answer is " +ans);
            }
        });
    }
}