package com.example.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    MainContainer mainContainer;

    BottomNavigationView main_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_bottom = findViewById(R.id.main_bottom);

        mainContainer = new MainContainer();


        //Fragment 띄우기
        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainContainer).commit();

        main_bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mainpage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainContainer).commit();
                        return true;

                }
                return false;
            }
        });
    }


}