package com.example.quiz_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CgpaCalculator extends AppCompatActivity {
    private LinearLayout courseContainer;
    private Button btnAddCourse, btnCalculateGPA;
    private TextView tvResult;
    private ArrayList<EditText> gpaInputs = new ArrayList<>();
    private ArrayList<EditText> creditInputs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_calculator); // Corrected layout file

        // Initialize UI components
        courseContainer = findViewById(R.id.courseContainer);
        btnAddCourse = findViewById(R.id.btnAddCourse);
        btnCalculateGPA = findViewById(R.id.btnCalculateGPA);
        tvResult = findViewById(R.id.tvResult);

        btnAddCourse.setOnClickListener(view -> addCourseInput());
        btnCalculateGPA.setOnClickListener(view -> calculateCGPA());
    }

    // Add input fields dynamically for each course
    private void addCourseInput() {
        View courseRow = getLayoutInflater().inflate(R.layout.course_input, null);

        EditText etGpa = courseRow.findViewById(R.id.gpaEditText);
        EditText etCredit = courseRow.findViewById(R.id.creditEditText);

        courseContainer.addView(courseRow);
        gpaInputs.add(etGpa);
        creditInputs.add(etCredit);
    }

    // Calculate CGPA
    private void calculateCGPA() {
        double totalGpaCredits = 0;
        double totalCredits = 0;

        for (int i = 0; i < gpaInputs.size(); i++) {
            String gpaStr = gpaInputs.get(i).getText().toString();
            String creditStr = creditInputs.get(i).getText().toString();

            if (!gpaStr.isEmpty() && !creditStr.isEmpty()) {
                try {
                    double gpa = Double.parseDouble(gpaStr);
                    double credit = Double.parseDouble(creditStr);

                    if (gpa >= 0.0 && gpa <= 4.0 && credit > 0) {
                        totalGpaCredits += gpa * credit;
                        totalCredits += credit;
                    } else {
                        tvResult.setText("Enter valid GPA (0.0 - 4.0) and credit (>0)");
                        return;
                    }
                } catch (NumberFormatException e) {
                    tvResult.setText("Invalid input! Enter numbers only.");
                    return;
                }
            }
        }

        if (totalCredits > 0) {
            double cgpa = totalGpaCredits / totalCredits;
            tvResult.setText("Total CGPA: " + String.format("%.2f", cgpa));
        } else {
            tvResult.setText("Please enter valid values.");
        }
    }
}
