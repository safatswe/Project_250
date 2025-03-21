package com.example.quiz_app;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoryActivity extends AppCompatActivity {

    Button btnBMI, btnQuiz,btncg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        btnBMI = findViewById(R.id.btn_bmi);
        btnQuiz = findViewById(R.id.btn_quiz);
        btncg=findViewById(R.id.btn_cgpa);



        btnBMI.setOnClickListener(view -> {
            Intent intent = new Intent(CategoryActivity.this, splashBmi.class);
            startActivity(intent);
        });


        btnQuiz.setOnClickListener(view -> {
            Intent intent = new Intent(CategoryActivity.this, Splash_iq.class);
            startActivity(intent);
        });
        btncg.setOnClickListener(view -> {
            Intent intent = new Intent(CategoryActivity.this, CgpaCalculator.class);
            startActivity(intent);
        });
    }
}
