package com.math.mathexam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mathexam.R;

import java.util.Random;


public class Basit extends AppCompatActivity {

    private TextView first;
    private TextView second;
    private TextView symbol;
    private Button answerbutton;
    private EditText answer;
    private TextView Result;
    private TextView pointres;
    private TextView questionTimes;

    int num1;
    int num2;
    char symbolChar;
    float trueAnswer;
    int point=0;
    int times=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basit);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        symbol = findViewById(R.id.symbol);
        answerbutton = findViewById(R.id.answerbutton);
        answer = findViewById(R.id.answer);
        Result = findViewById(R.id.Result);
        pointres = findViewById(R.id.pointres);
        questionTimes = findViewById(R.id.questionTimes);
    }

    public void quClick(View view) {
        answer.setText(null);
        Random r = new Random();
        if (times <= 10) {
            questionTimes.setText(times + ". Question");

            int semboll = r.nextInt(4) + 1;
            num1 = r.nextInt(10);
            num2 = r.nextInt(10);

            if (semboll == 1) {
                symbolChar = '+';
                trueAnswer = num1 + num2;
            } else if (semboll == 2) {
                symbolChar = '-';
                trueAnswer = num1 - num2;
            } else if (semboll == 3) {
                symbolChar = '*';
                trueAnswer = num1 * num2;
            } else if (semboll == 4) {
                do {
                    num2 = r.nextInt(10);
                } while (num2 == 0);
                symbolChar = '/';
                trueAnswer = (float) num1 / num2;
            }

            first.setText(String.valueOf(num1));
            second.setText(String.valueOf(num2));
            symbol.setText(String.valueOf(symbolChar));
            times++;
            Result.setText(null);
        }
    }

    public void ansClick(View view) {
        float userNumber = Float.parseFloat(answer.getText().toString());


        float tolerance = 0.001F;

        if (Math.abs(userNumber - trueAnswer) < tolerance) {
            point += 10;
        } else {
        }

        if (times <= 10) {
            quClick(view);
        } else {
            pointres.setText("Exam Result: " + point);
            answerbutton.setEnabled(false);
        }
    }
    public void exitBu(View view){

        finish();
    }
}