package com.example.uebungsblatt_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button insertButton;
    private EditText editText;
    public static final String MAIN_ACTIVITY_TRANSFER_INT = "main_activity_transfer_string";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertButton = findViewById(R.id.insertButton);
        editText = findViewById(R.id.editText);
        insertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editText.getText().toString().isEmpty()){
                    Intent startIntent = new Intent(MainActivity.this, ListActivity.class);
                    startIntent.putExtra(MAIN_ACTIVITY_TRANSFER_INT, Integer.valueOf(editText.getText().toString()));
                    startActivity(startIntent);
                }else{
                    Toast.makeText(MainActivity.this, getString(R.string.empty_input), Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
