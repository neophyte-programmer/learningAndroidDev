package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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
        The method "onBtnClick" needs to also be included in the xml file
    */

    public void onBtnClick (View view) {
        // Assigning the textview text to a variable
        // R stands for Resources and id is the type of resource then the textMessage is the name of
        // id
        TextView textHello = findViewById(R.id.textMessage);

        // Assigning the edit text to a variable
        EditText editTextName = findViewById(R.id.editTextName);

        //Get the input from user and converting to string so that it can be used
        /* Setting the text to the string */
        textHello.setText("Hello " + editTextName.getText().toString());
    }
}