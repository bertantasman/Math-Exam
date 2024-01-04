package com.math.mathexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mathexam.R;

import java.util.Random;

        public class KokBulmaca extends AppCompatActivity {
        TextView firstnum, secondnum, RESULT;
        EditText num1, num2, num3;

        int ran1, ran2, ran3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_kok_bulmaca);
            firstnum = findViewById(R.id.firstnum);
            secondnum = findViewById(R.id.secondnum);
            num1 = findViewById(R.id.num1);
            num2 = findViewById(R.id.num2);
            num3 = findViewById(R.id.num3);
            RESULT = findViewById(R.id.RESULT);
        }

        public void quClick(View view) {
            RESULT.setText(" ");

            if (isValidInput()) {
                ran1 = Integer.parseInt(num1.getText().toString());
                ran2 = Integer.parseInt(num2.getText().toString());
                ran3 = Integer.parseInt(num3.getText().toString());

                float discriminant = ran2 * ran2 - 4 * ran1 * ran3;

                if (discriminant > 0) {
                    float root1 = (-ran2 + (float) Math.sqrt(discriminant)) / (2 * ran1);
                    float root2 = (-ran2 - (float) Math.sqrt(discriminant)) / (2 * ran1);
                    firstnum.setText("Kök 1: " + root1);
                    secondnum.setText("Kök 2: " + root2);
                    RESULT.setText(null);
                } else if (discriminant == 0) {
                    float root = -ran2 / (2 * ran1);
                    RESULT.setText("Tek kök: " + root);
                    firstnum.setText(null);
                    secondnum.setText(null);
                } else {
                    RESULT.setText("Gerçel kök yok. Kökler karmaşık sayılardır.");
                    firstnum.setText(null);
                    secondnum.setText(null);
                }
            }
        }

        private boolean isValidInput() {
            String str1 = num1.getText().toString();
            String str2 = num2.getText().toString();
            String str3 = num3.getText().toString();

            if (str1.isEmpty() || str2.isEmpty() || str3.isEmpty()) {
                RESULT.setText("Lütfen tüm alanları doldurun.");
                return false;
            }

            int a = Integer.parseInt(str1);
            int b = Integer.parseInt(str2);
            int c = Integer.parseInt(str3);

            if (a == 0) {
                RESULT.setText("a katsayısı sıfır olamaz.");
                return false;
            }

            return true;
        }
            public void exitBu(View view){
                finish();
            }
    }
