package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view) {
        EditText first = (EditText) findViewById(R.id.myFirstNumber);
        EditText second = (EditText) findViewById(R.id.mySecondNumber);
        Double sum;
        try {
            Double a = Double.parseDouble(first.getText().toString());
            Double b = Double.parseDouble(second.getText().toString());
            sum = a + b;
            goToActivity(sum.toString());
        } catch (NumberFormatException e) {
            goToActivity("Could not parse values");
        }
    }

    public void subFunction(View view) {
        EditText first = (EditText) findViewById(R.id.myFirstNumber);
        EditText second = (EditText) findViewById(R.id.mySecondNumber);
        Double diff;
        try {
            Double a = Double.parseDouble(first.getText().toString());
            Double b = Double.parseDouble(second.getText().toString());
            diff = a - b;
            goToActivity(diff.toString());
        } catch (NumberFormatException e) {
            goToActivity("Could not parse values");
        }
    }

    public void multFunction(View view) {
        EditText first = (EditText) findViewById(R.id.myFirstNumber);
        EditText second = (EditText) findViewById(R.id.mySecondNumber);
        Double prod;
        try {
            Double a = Double.parseDouble(first.getText().toString());
            Double b = Double.parseDouble(second.getText().toString());
            prod = a * b;
            goToActivity(prod.toString());
        } catch (NumberFormatException e) {
            goToActivity("Could not parse values");
        }
    }

    public void divFunction(View view) {
        EditText first = (EditText) findViewById(R.id.myFirstNumber);
        EditText second = (EditText) findViewById(R.id.mySecondNumber);
        Double quot;
        try {
            Double a = Double.parseDouble(first.getText().toString());
            Double b = Double.parseDouble(second.getText().toString());
            if (b == 0) {
                goToActivity("Cannot divide by 0");
            }
            else {
                quot = a / b;
                goToActivity(quot.toString());
            }
        } catch (NumberFormatException e) {
            goToActivity("Could not parse values");
        }
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}