package com.example.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ModulesDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules_detail);

        Intent intent = getIntent();
        String moduleCode = intent.getStringExtra("moduleCode");
        String moduleName = intent.getStringExtra("moduleName");
        String academicYear = intent.getStringExtra("academicYear");
        String semester = intent.getStringExtra("semester");
        String moduleCredit = intent.getStringExtra("moduleCredit");
        String venue = intent.getStringExtra("venue");


        TextView moduleCodeTextView = findViewById(R.id.moduleCodeTextView);
        TextView moduleNameTextView = findViewById(R.id.moduleNameTextView);
        TextView academicYearTextView = findViewById(R.id.academicYearTextView);
        TextView semesterTextView = findViewById(R.id.semesterTextView);
        TextView moduleCreditTextView = findViewById(R.id.moduleCreditTextView);
        TextView venueTextView = findViewById(R.id.venueTextView);


        moduleCodeTextView.setText("Module Code: " + moduleCode);
        moduleNameTextView.setText("Module Name: " + moduleName);
        academicYearTextView.setText("Academic Year: " + academicYear);
        semesterTextView.setText("Semester: " + semester);
        moduleCreditTextView.setText("Module Credit: " + moduleCredit);
        venueTextView.setText("Venue: " + venue);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
