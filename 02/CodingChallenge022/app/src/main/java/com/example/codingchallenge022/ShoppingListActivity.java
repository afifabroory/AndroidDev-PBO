package com.example.codingchallenge022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.codingchallenge022.databinding.ActivityShoppingListBinding;

public class ShoppingListActivity extends AppCompatActivity {
    private ActivityShoppingListBinding shoppingListBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(shoppingListBinding.getRoot());
    }
}