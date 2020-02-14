package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import java.util.*;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int r;
    public void guess(View view){
        Log.i("Info","button pressed");
        EditText val =(EditText) findViewById(R.id.editText);
        int u = Integer.parseInt( val.getText().toString() );
        if(u<r)
        {
            Toast.makeText(this, "go Higher", Toast.LENGTH_SHORT).show();
        }
        else if(u>r)
        {
            Toast.makeText(this, "go Lower", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "You got it right,try again!!!", Toast.LENGTH_SHORT).show();
            r = random(0,20);
        }
    }

    public static int random(int min, int max)
    {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = random(0,20);
    }
}
