package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view)
    {
        EditText editText = (EditText)findViewById(R.id.dirhamsEditText);
        String dirhams_str = editText.getText().toString();

        double dirhams = Double.parseDouble(dirhams_str);
        double rupees = dirhams*38.56;

        //String rupees_str = Double.toString(rupees);  Gives accurate figure
        String rupees_str = String.format("%.2f",rupees);
        Toast.makeText(this,"Amount " + dirhams_str + " is Rs." + rupees_str,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
