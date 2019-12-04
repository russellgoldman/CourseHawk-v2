package com.example.cp470_group_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//Required imports


public class Dashboard extends AppCompatActivity {
    BottomNavigationView bottomNav;
    ImageButton courseRegi;
    ImageButton viewFavs;
    ImageButton viewRatings;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        intent = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        String date_n = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(new Date());
        TextView date  = findViewById(R.id.todays_date);
        date.setText(date_n);
        courseRegi = findViewById(R.id.viewCourseRegi);
        courseRegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Dashboard.this, CourseReg.class);
                startActivity(intent);
            }
        });
        viewFavs = findViewById(R.id.viewFavs);
        viewFavs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Dashboard.this, CourseReg.class);
                startActivity(intent);
            }
        });
        viewRatings = findViewById(R.id.viewYourRatings);
        viewRatings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Dashboard.this, CourseReg.class);
                startActivity(intent);
            }
        });
        bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_courses:
                        intent = new Intent(Dashboard.this, CoursePageActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.navigation_programs:
                        intent = new Intent(Dashboard.this, CourseReg.class);
                        startActivity(intent);
                        break;
                    case R.id.navigation_settings:
                        intent = new Intent(Dashboard.this, CourseReg.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });



    }
}