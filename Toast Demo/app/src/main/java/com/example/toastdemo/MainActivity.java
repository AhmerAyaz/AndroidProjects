package com.example.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view)
    {
        Log.i("Info","Empty");
        EditText someEditText = (EditText) findViewById(R.id.nameEditText);
        Log.i("Name",someEditText.getText().toString());
        Toast.makeText(this,"Hi "+someEditText.getText().toString()+"!",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
