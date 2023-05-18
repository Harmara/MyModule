package com.example.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button a002Button;
    Button b002Button;
    Button c206Button;
    Button c338Button;
    Button c346Button;
    Button c378Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a002Button = findViewById(R.id.a002Button);
        b002Button = findViewById(R.id.b002Button);
        c206Button = findViewById(R.id.c206Button);
        c338Button = findViewById(R.id.c338Button);
        c346Button = findViewById(R.id.c346Button);
        c378Button = findViewById(R.id.c378Button);

        a002Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moduleCode = "A002";
                String moduleName = "Eating Well, Living Well";
                String academicYear = "2023";
                String semester = "3";
                String moduleCredit = "2";
                String venue = "E26L";


                Intent intent = new Intent(MainActivity.this, ModulesDetail.class);


                intent.putExtra("moduleCode", moduleCode);
                intent.putExtra("moduleName", moduleName);
                intent.putExtra("academicYear", academicYear);
                intent.putExtra("semester", semester);
                intent.putExtra("moduleCredit", moduleCredit);
                intent.putExtra("venue", venue);


                startActivity(intent);
            }
        });

        b002Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moduleCode = "B002";
                String moduleName = "Effective Digital Marketing";
                String academicYear = "2023";
                String semester = "3";
                String moduleCredit = "2";
                String venue = "E25F";


                Intent intent = new Intent(MainActivity.this, ModulesDetail.class);


                intent.putExtra("moduleCode", moduleCode);
                intent.putExtra("moduleName", moduleName);
                intent.putExtra("academicYear", academicYear);
                intent.putExtra("semester", semester);
                intent.putExtra("moduleCredit", moduleCredit);
                intent.putExtra("venue", venue);


                startActivity(intent);
            }
        });

        c206Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moduleCode = "C206";
                String moduleName = "Software Development Process";
                String academicYear = "2023";
                String semester = "3";
                String moduleCredit = "4";
                String venue = "W64M";


                Intent intent = new Intent(MainActivity.this, ModulesDetail.class);


                intent.putExtra("moduleCode", moduleCode);
                intent.putExtra("moduleName", moduleName);
                intent.putExtra("academicYear", academicYear);
                intent.putExtra("semester", semester);
                intent.putExtra("moduleCredit", moduleCredit);
                intent.putExtra("venue", venue);


                startActivity(intent);
        }
        });

        c338Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moduleCode = "C338";
                String moduleName = "Ai and Machine Learning";
                String academicYear = "2023";
                String semester = "3";
                String moduleCredit = "4";
                String venue = "E62L";


                Intent intent = new Intent(MainActivity.this, ModulesDetail.class);

                // Pass the module information as extras to the intent
                intent.putExtra("moduleCode", moduleCode);
                intent.putExtra("moduleName", moduleName);
                intent.putExtra("academicYear", academicYear);
                intent.putExtra("semester", semester);
                intent.putExtra("moduleCredit", moduleCredit);
                intent.putExtra("venue", venue);


                startActivity(intent);
            }
        });

        c346Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moduleCode = "C346";
                String moduleName = "Mobile app Development";
                String academicYear = "2023";
                String semester = "3";
                String moduleCredit = "4";
                String venue = "E63A";


                Intent intent = new Intent(MainActivity.this, ModulesDetail.class);


                intent.putExtra("moduleCode", moduleCode);
                intent.putExtra("moduleName", moduleName);
                intent.putExtra("academicYear", academicYear);
                intent.putExtra("semester", semester);
                intent.putExtra("moduleCredit", moduleCredit);
                intent.putExtra("venue", venue);


                startActivity(intent);
            }
        });

        c378Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moduleCode = "C378";
                String moduleName = "Business Analytics";
                String academicYear = "2023";
                String semester = "3";
                String moduleCredit = "4";
                String venue = "E62L";

                // Create an intent to start the detail activity
                Intent intent = new Intent(MainActivity.this, ModulesDetail.class);

                // Pass the module information as extras to the intent
                intent.putExtra("moduleCode", moduleCode);
                intent.putExtra("moduleName", moduleName);
                intent.putExtra("academicYear", academicYear);
                intent.putExtra("semester", semester);
                intent.putExtra("moduleCredit", moduleCredit);
                intent.putExtra("venue", venue);

                // Start the detail activity
                startActivity(intent);
            }
        });


}}