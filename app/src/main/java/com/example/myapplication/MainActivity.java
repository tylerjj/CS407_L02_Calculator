package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }

    public void multiply(View view) {
        EditText inputL = (EditText) findViewById(R.id.inputL);
        EditText inputR = (EditText) findViewById(R.id.inputR);

        double leftOperand;
        double rightOperand;
        try {
            leftOperand = Double.parseDouble((inputL.getText().toString()));
            rightOperand = Double.parseDouble((inputR.getText().toString()));
            Toast.makeText(MainActivity.this, String.valueOf(leftOperand*rightOperand), Toast.LENGTH_LONG).show();
            goToActivity2(String.valueOf(leftOperand*rightOperand));
        }
        catch(NumberFormatException e){
            Toast.makeText(MainActivity.this, "Please only input numeric values.", Toast.LENGTH_LONG).show();
        }

    }

    public void add(View view) {
        EditText inputL = (EditText) findViewById(R.id.inputL);
        EditText inputR = (EditText) findViewById(R.id.inputR);

        double leftOperand;
        double rightOperand;
        try {
            leftOperand = Double.parseDouble((inputL.getText().toString()));
            rightOperand = Double.parseDouble((inputR.getText().toString()));
            Toast.makeText(MainActivity.this, String.valueOf(leftOperand+rightOperand), Toast.LENGTH_LONG).show();
            goToActivity2(String.valueOf(leftOperand+rightOperand));
        }
        catch(NumberFormatException e){
            Toast.makeText(MainActivity.this, "Please only input numeric values.", Toast.LENGTH_LONG).show();
        }
    }

    public void divide(View view) {
        EditText inputL = (EditText) findViewById(R.id.inputL);
        EditText inputR = (EditText) findViewById(R.id.inputR);

        double leftOperand;
        double rightOperand;
        try {
            leftOperand = Double.parseDouble((inputL.getText().toString()));
            rightOperand = Double.parseDouble((inputR.getText().toString()));
            Toast.makeText(MainActivity.this, String.valueOf(leftOperand/rightOperand), Toast.LENGTH_LONG).show();
            goToActivity2(String.valueOf(leftOperand/rightOperand));
        }
        catch(NumberFormatException e){
            Toast.makeText(MainActivity.this, "Please only input numeric values.", Toast.LENGTH_LONG).show();
        }
    }

    public void subtract(View view) {
        EditText inputL = (EditText) findViewById(R.id.inputL);
        EditText inputR = (EditText) findViewById(R.id.inputR);

        double leftOperand;
        double rightOperand;
        try {
            leftOperand = Double.parseDouble((inputL.getText().toString()));
            rightOperand = Double.parseDouble((inputR.getText().toString()));
            Toast.makeText(MainActivity.this, String.valueOf(leftOperand-rightOperand), Toast.LENGTH_LONG).show();
            goToActivity2(String.valueOf(leftOperand-rightOperand));
        }
        catch(NumberFormatException e){
            Toast.makeText(MainActivity.this, "Please only input numeric values.", Toast.LENGTH_LONG).show();
        }
    }
}