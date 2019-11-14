package com.example.uebungsblatt_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MyPreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_preferences);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new MyPreferenceFragment()).commit();
    }
}
