package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        Methods are fancy names for functions in Java
        Methods should be created outside the scope of the onCreate method
        But it should still be in the MainActivity class
    */

    public void onBtnClick (View view) {
        // Assigning the textview text to a variable
        // R stands for Resources and id is the type of resource then the textMessage is the name of
        // id
        TextView textHello = findViewById(R.id.textMessage);

        /* Setting the text to something else */
        textHello.setText("Hello People");
    }
}