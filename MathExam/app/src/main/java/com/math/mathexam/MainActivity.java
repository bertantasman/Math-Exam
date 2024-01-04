package com.math.mathexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mathexam.R;

public class MainActivity extends AppCompatActivity {

    Button usluSayilar,FaktoriyelID;
    Button KokBulma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        KokBulma = findViewById(R.id.KokBulma);
        usluSayilar = findViewById(R.id.usluSayilar);
        FaktoriyelID=findViewById(R.id.FaktoriyelID);

        KokBulma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KokBulmaca.class);
                startActivity(intent);
            }
        });

        usluSayilar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, usluRakamlar.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Basit.class);
                startActivity(intent);
            }
        });
        FaktoriyelID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Faktoriyel.class);
                startActivity(intent);
            }
        });
    }
}
