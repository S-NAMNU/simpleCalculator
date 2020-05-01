package com.example.samplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, buttonAdd, buttonEquals;
    EditText display;
    float mValOne, mValTwo;
    boolean bAdd, BEquals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.n1);
        button2 = (Button)findViewById(R.id.n2);
        buttonAdd = (Button)findViewById(R.id.add);
        buttonEquals = (Button)findViewById(R.id.ans);
        display = (EditText)findViewById(R.id.lineDisp);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"2");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null){
                    display.setText("");
                }
                else{
                    mValOne = Float.parseFloat(display.getText()+"");
                    bAdd = true;
                    display.setText(null);
                }
            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValTwo = Float.parseFloat(display.getText()+"");
                if (bAdd == true){
                    display.setText(mValOne+mValTwo+"");
                    bAdd = false;
                }
            }
        });
    }
}
