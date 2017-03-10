package com.example.ar.usagi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class Usagi2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usagi2);{
            final Intent intent = new Intent(this, MainActivity.class);
            Bundle extras = getIntent().getExtras();
            String s = getIntent().getStringExtra("key");


        }

    }
}
