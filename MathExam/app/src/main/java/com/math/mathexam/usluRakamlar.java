package com.math.mathexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mathexam.R;

import java.util.Random;

public class usluRakamlar extends AppCompatActivity {
    TextView ustlu, sayi, pointt, timess;
    EditText cevap;
    Button answerButton, questionButton;
    int num1, num2, point = 0, times = 1;
    double trueAnswer, user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uslu_rakamlar);
        ustlu = findViewById(R.id.ustlu);
        sayi = findViewById(R.id.sayi);
        cevap = findViewById(R.id.cevap);
        pointt = findViewById(R.id.pointt);
        timess = findViewById(R.id.timess);
        answerButton = findViewById(R.id.answerButton);
        questionButton = findViewById(R.id.questionButton);
        quClick(null);
    }

    public void quClick(View view) {
        if (times <= 10) {
            timess.setText(times + ". Question");
            Random r = new Random();
            num1 = r.nextInt(10);
            num2 = r.nextInt(5);
            sayi.setText(String.valueOf(num1));
            ustlu.setText(String.valueOf(num2));
            trueAnswer = Math.pow(num1, num2);
            times++;
        }
    }

    public void ansClick(View view) {
        if (times <= 10) {
            String userText = cevap.getText().toString();
            if (!userText.isEmpty()) {
                user = Double.parseDouble(userText);
                if (user == trueAnswer) {
                    point += 10;
                }
            }
            quClick(view);
            cevap.setText(null);
        } else {
            pointt.setText("Your exam score: " + point);
            cevap.setEnabled(false);
            timess.setText(null);
            questionButton.setEnabled(false);
            answerButton.setEnabled(false);
        }
    }
    public void exitBu(View view){
        finish();
    }
}
