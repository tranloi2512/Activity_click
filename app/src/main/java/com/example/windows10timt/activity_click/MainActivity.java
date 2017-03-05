package com.example.windows10timt.activity_click;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnResult;
    private EditText edNumberA;
    private EditText edNumberB;
    private int numberA, numberB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculating);
        btnResult = (Button) findViewById(R.id.btn_cal);
        edNumberA = (EditText) findViewById(R.id.et_input1);
        edNumberB = (EditText) findViewById(R.id.et_input2);
        btnResult.setOnClickListener(this);
        /* btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edNumberB.getText().toString().isEmpty() && edNumberA.getText().toString().isEmpty()) {

                    Toast.makeText(MainActivity.this, "Plese input A and B", Toast.LENGTH_SHORT).show();
                } else {
                    numberA = Integer.parseInt(edNumberA.getText().toString());
                    numberB = Integer.parseInt(edNumberB.getText().toString());
                    Toast.makeText(MainActivity.this, numberA + " + " + numberB + " = " + (numberA + numberB), Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Khanh Linh xí mứng", Toast.LENGTH_SHORT).show();
                }
            }
        }); */

        btnResult.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "You have clicked for a while", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_cal: {
                if (edNumberB.getText().toString().isEmpty() && edNumberA.getText().toString().isEmpty()) {

                    Toast.makeText(MainActivity.this, "Plese input A and B", Toast.LENGTH_SHORT).show();
                    } else {
                    numberA = Integer.parseInt(edNumberA.getText().toString());
                    numberB = Integer.parseInt(edNumberB.getText().toString());
                    Toast.makeText(MainActivity.this, numberA + " + " + numberB + " = " + (numberA + numberB), Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Khanh Linh xí mứng", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            default:
                break;
        }
    }
}

