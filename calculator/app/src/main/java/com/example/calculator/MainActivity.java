package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText number1, number2;
    private TextView resultText;
    private Button button1, button2, button3, button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        number1 = findViewById(R.id.editTextNumber);
        number2 = findViewById(R.id.editTextNumber2);
        resultText = findViewById(R.id.editTextNumber3);
    }
    public void onPlusClicked(View view) {
        String num1Str = number1.getText().toString();
        String num2Str = number2.getText().toString();

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);

        double result = num1 + num2;

        resultText.setText(String.valueOf(result));
    }
    public void onMinusClicked(View view) {
        String num1Str = number1.getText().toString();
        String num2Str = number2.getText().toString();

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);

        double result = num1 - num2;

        resultText.setText(String.valueOf(result));
    }
    public void onMulClicked(View view) {
        String num1Str = number1.getText().toString();
        String num2Str = number2.getText().toString();

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);

        double result = num1 * num2;

        resultText.setText(String.valueOf(result));
    }

    public void onDivClicked(View view) {
        String num1Str = number1.getText().toString();
        String num2Str = number2.getText().toString();

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);

        double result = num1 / num2;

            resultText.setText(String.valueOf(result));
    }
}