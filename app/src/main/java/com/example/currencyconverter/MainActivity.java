package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String str = myTextField.getText().toString();
        Double number = Double.valueOf(str);

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();

        goToActivity2(number);
    }

    public void goToActivity2(Double s) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
