package com.example.uebungsblatt_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView = findViewById(R.id.result_activity_result_view);
        int value = getIntent().getIntExtra(MainActivity.MAIN_ACTIVITY_TRANSFER_INT, 0);

        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        int muliplicationFactor = Integer.valueOf(prefs.getAll().get("multiplication_factor").toString());
        textView.setText("Result: " + (value * muliplicationFactor));
    }
}
