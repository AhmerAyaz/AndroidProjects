package com.example.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void guess(View view)  {
        /*Random rand = new Random();
        int value = rand.nextInt(50);
        rand.nextInt((max - min) + 1) + min;*/

        EditText editText = (EditText)findViewById(R.id.guessEditText);
        int num = Integer.parseInt(editText.getText().toString());
        String message;

        if(randomNumber == num)  {
            message = "You Win. Play Again";
        }
        else if(randomNumber < num)  {
            message = "Lower!";
        }
        else  {
            message = "Higher!";
        }
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;

        //random = (int)(Math.random()*20+1);

    }
}
