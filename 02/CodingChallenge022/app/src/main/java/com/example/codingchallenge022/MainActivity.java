package com.example.codingchallenge022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.codingchallenge022.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mainBinding.getRoot());

        mainBinding.addItem.setOnClickListener(v -> {
            Intent intent = new Intent(this, ShoppingListActivity.class);
            startActivity(intent);
        });
    }
}