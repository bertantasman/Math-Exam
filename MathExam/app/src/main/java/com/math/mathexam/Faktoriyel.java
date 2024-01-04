package com.math.mathexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mathexam.R;

import java.util.Random;

public class Faktoriyel extends AppCompatActivity {
    TextView firstnumber, secondnumber, thirdnumber, forthnumber, fifthnumber, resres,showAnswer;
    public EditText userNum;
    Button ansButton, quButton;
    int num1, num2, num3, symbol1, symbol2, faktoriyel1, faktoriyel2, faktoriyel3, result1, times = 1, point = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faktoriyel);
        firstnumber = findViewById(R.id.firstnumber);
        secondnumber = findViewById(R.id.secondnumber);
        thirdnumber = findViewById(R.id.thirdnumber);
        forthnumber = findViewById(R.id.fourthnumber);
        fifthnumber = findViewById(R.id.fifthnumber);
        userNum = findViewById(R.id.userNum);
        resres = findViewById(R.id.resres);
        ansButton = findViewById(R.id.ansButton);
        quButton = findViewById(R.id.quButton);
        showAnswer=findViewById(R.id.showAnswer);
        resres.setText("");
    }

    public void quClick(View view) {
        resres.setText(times + ". Question");
        times++;
        if (times < 11) {
            Random r = new Random();
            int ranum = r.nextInt(3) + 1;
            num1 = r.nextInt(6) + 1;
            num2 = r.nextInt(6) + 1;
            num3 = r.nextInt(6) + 1;
            firstnumber.setText(null);
            secondnumber.setText(null);
            thirdnumber.setText(null);
            forthnumber.setText(null);
            fifthnumber.setText(null);

            switch (ranum) {
                case 1:
                    faktoriyel1 = 1;
                    faktoriyel2 = 1;
                    faktoriyel3 = 1;

                    for (int i = 1; i <= num1; i++) {
                        faktoriyel1 *= i;
                    }
                    for (int i = 1; i <= num2; i++) {
                        faktoriyel2 *= i;
                    }
                    for (int i = 1; i <= num3; i++) {
                        faktoriyel3 *= i;
                    }

                    symbol1 = r.nextInt(4) + 1;
                    symbol2 = r.nextInt(4) + 1;

                    result1 = 0;

                    if (symbol1 == 1 && symbol2 == 1) {
                        result1 = faktoriyel1 + faktoriyel2 + faktoriyel3;
                    } else if (symbol1 == 1 && symbol2 == 2) {
                        result1 = faktoriyel1 + faktoriyel2 - faktoriyel3;
                    } else if (symbol1 == 1 && symbol2 == 3) {
                        result1 = faktoriyel1 + faktoriyel2 / faktoriyel3;
                    } else if (symbol1 == 1 && symbol2 == 4) {
                        result1 = faktoriyel1 + faktoriyel2 * faktoriyel3;
                    } else if (symbol1 == 2 && symbol2 == 1) {
                        result1 = faktoriyel1 - faktoriyel2 + faktoriyel3;
                    } else if (symbol1 == 2 && symbol2 == 2) {
                        result1 = faktoriyel1 - faktoriyel2 - faktoriyel3;
                    } else if (symbol1 == 2 && symbol2 == 3) {
                        result1 = faktoriyel1 - faktoriyel2 / faktoriyel3;
                    } else if (symbol1 == 2 && symbol2 == 4) {
                        result1 = faktoriyel1 - faktoriyel2 * faktoriyel3;
                    } else if (symbol1 == 3 && symbol2 == 1) {
                        result1 = faktoriyel1 / faktoriyel2 + faktoriyel3;
                    } else if (symbol1 == 3 && symbol2 == 2) {
                        result1 = faktoriyel1 / faktoriyel2 - faktoriyel3;
                    } else if (symbol1 == 3 && symbol2 == 3) {
                        result1 = faktoriyel1 / faktoriyel2 / faktoriyel3;
                    } else if (symbol1 == 3 && symbol2 == 4) {
                        result1 = faktoriyel1 / faktoriyel2 * faktoriyel3;
                    } else if (symbol1 == 4 && symbol2 == 1) {
                        result1 = faktoriyel1 * faktoriyel2 + faktoriyel3;
                    } else if (symbol1 == 4 && symbol2 == 2) {
                        result1 = faktoriyel1 * faktoriyel2 - faktoriyel3;
                    } else if (symbol1 == 4 && symbol2 == 3) {
                        result1 = faktoriyel1 * faktoriyel2 / faktoriyel3;
                    } else if (symbol1 == 4 && symbol2 == 4) {
                        result1 = faktoriyel1 * faktoriyel2 * faktoriyel3;
                    }

                    firstnumber.setText(String.valueOf(num1 + "!"));
                    secondnumber.setText(
                            symbol1 == 1 ? "+" :
                                    symbol1 == 2 ? "-" :
                                            symbol1 == 3 ? "/" :
                                                    symbol1 == 4 ? "*" :
                                                            "Invalid Symbol"
                    );
                    thirdnumber.setText(String.valueOf(num2 + "!"));
                    forthnumber.setText(
                            symbol2 == 1 ? "+" :
                                    symbol2 == 2 ? "-" :
                                            symbol2 == 3 ? "/" :
                                                    symbol2 == 4 ? "*" :
                                                            "Invalid Symbol"
                    );
                    fifthnumber.setText(String.valueOf(num3 + "!"));
                    break;
                case 2:
                    faktoriyel1 = 1;
                    faktoriyel2 = 1;

                    for (int i = 1; i <= num1; i++) {
                        faktoriyel1 *= i;
                    }
                    for (int i = 1; i <= num2; i++) {
                        faktoriyel2 *= i;
                    }
                    symbol1 = r.nextInt(4) + 1;

                    result1 = 0;

                    if (symbol1 == 1) {
                        result1 = faktoriyel1 + faktoriyel2;
                    } else if (symbol1 == 2) {
                        result1 = faktoriyel1 - faktoriyel2;
                    } else if (symbol1 == 3) {
                        result1 = faktoriyel1 / faktoriyel2;
                    } else if (symbol1 == 4) {
                        result1 = faktoriyel1 * faktoriyel2;
                    }

                    firstnumber.setText(String.valueOf(num1 + "!"));
                    thirdnumber.setText(
                            symbol1 == 1 ? "+" :
                                    symbol1 == 2 ? "-" :
                                            symbol1 == 3 ? "/" :
                                                    symbol1 == 4 ? "*" :
                                                            "Invalid Symbol"
                    );
                    forthnumber.setText(String.valueOf(num2 + "!"));

                    break;
                case 3:
                    faktoriyel1 = 1;
                    for (int i = 1; i <= num1; i++) {
                        faktoriyel1 *= i;
                    }
                    result1 = faktoriyel1;
                    forthnumber.setText(String.valueOf(num1 + "!"));
                    break;
            }
        }
    }

    public void ansClick(View view) {
        float userAnswer = Float.parseFloat(userNum.getText().toString());
        if (times <= 10) {
            userNum.setText("");
            if (userAnswer == result1) {
                point += 10;
            }
            else{
            }
        }
        if(times==11){
            quButton.setEnabled(false);
            ansButton.setEnabled(false);
            showAnswer.setText("Your exam Result:"+point);
        }

        quClick(view);
    }
    public void exitBu(View view){
        finish();
    }
}
