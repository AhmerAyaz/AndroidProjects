package com.example.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Console;

import static java.lang.Math.floor;

public class MainActivity extends AppCompatActivity {

    class Number  {

        int number;

        public boolean isSquare()  {
            double d = (double)number;
            double temp = Math.sqrt(d);

            if(floor(temp)==temp) {
                return true;
            }
            else  {
                return false;
            }
        }


        public boolean isTriangular()  {

            int sum = 0;

            for(int i = 1; number > sum ; i++)  {

                sum = i+sum;
            }

            if(sum == number)  {

                return true;

            }

            else  {

                return false;

            }


        }

    }

    public void testNumber(View view)  {
        Number temp = new Number();
        EditText editText = (EditText)findViewById(R.id.editText);

        if(editText.getText().toString().isEmpty())  {
            Toast.makeText(this,"Please enter a number",Toast.LENGTH_LONG).show();
        }
        else {
            temp.number = Integer.parseInt(editText.getText().toString());

            String message = editText.getText().toString();

            if ((temp.isSquare()) && (temp.isTriangular())) {
                message += " is both Triangular and Square";
            } else if (temp.isTriangular()) {
                message += " is a Triangular number";
            } else if (temp.isSquare()) {
                message += " is a Square number";
            } else {
                message += " is neither Triangular nor Square";
            }

            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
