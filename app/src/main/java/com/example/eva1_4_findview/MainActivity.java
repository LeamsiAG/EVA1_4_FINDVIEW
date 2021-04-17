package com.example.eva1_4_findview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TxtViewMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //FALTA CONECTAR LA VARIABLE CON EL WIDGET
TxtViewMsg = findViewById(R.id.TxtViewMsg);
        TxtViewMsg.setText("Hola mundo Crueeeeeeeel!");
    }
}