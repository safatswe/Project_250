package com.example.quiz_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {

    Button btnBMI, btnQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        btnBMI = findViewById(R.id.btn_bmi);
        btnQuiz = findViewById(R.id.btn_quiz);


        btnBMI.setOnClickListener(view -> {
            Intent intent = new Intent(CategoryActivity.this, splashBmi.class);
            startActivity(intent);
        });


        btnQuiz.setOnClickListener(view -> {
            Intent intent = new Intent(CategoryActivity.this, Splash_iq.class);
            startActivity(intent);
        });
    }
}
