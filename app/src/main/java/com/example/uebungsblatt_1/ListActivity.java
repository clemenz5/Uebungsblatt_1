package com.example.uebungsblatt_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private ListView content_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent openIntent = getIntent();
        int highestValue = openIntent.getIntExtra(MainActivity.MAIN_ACTIVITY_TRANSFER_INT, 0);

        content_list = findViewById(R.id.content_list);
        content_list.setAdapter(new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, createDescendingList(highestValue)));
    }

    private List<Integer> createDescendingList(int highestValue){
        List<Integer> descendingList= new LinkedList<Integer>();
        for(int i = highestValue; i>0; i--){
            descendingList.add(i);
        }
        return descendingList;
    }
}
