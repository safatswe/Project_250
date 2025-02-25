package com.example.quiz_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    TextView scoreTextView, resultTextView;
    Button restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        scoreTextView = findViewById(R.id.score_text);
        resultTextView = findViewById(R.id.result_text);
        restartButton = findViewById(R.id.btn_restart);

        // Get score from Intent
        int score = getIntent().getIntExtra("SCORE", 0);
        int totalQuestions = getIntent().getIntExtra("TOTAL_QUESTIONS", 0);

        // Display Score
        scoreTextView.setText("Your Score: " + score + " / " + totalQuestions);

        // Display Result (Passed / Failed)
        if (score >= totalQuestions * 0.6) {
            resultTextView.setText("🎉 Congratulations! You Passed!");
        } else {
            resultTextView.setText("❌ Better Luck Next Time!");
        }

        // Restart Button Click Listener
        restartButton.setOnClickListener(view -> {
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
