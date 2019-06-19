package com.example.additionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButton (View view) {

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.cat2);

        EditText nameText = (EditText) findViewById(R.id.nameText);
        EditText numberText = (EditText) findViewById(R.id.numberText);
        EditText numberText2 = (EditText) findViewById(R.id.numberText2);

        int total = Integer.parseInt(numberText.getText().toString()) + Integer.parseInt(numberText2.getText().toString());

        double amount = total ;

        double convert = amount * 0.85 ;

        Toast.makeText(MainActivity.this, "Hi " + nameText.getText().toString()
                + ", total money is " + total + " and the amount in dollars is $"
                + String.format("%.2f", convert), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
