package com.example.codingchallenge022;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.codingchallenge022.databinding.ActivityShoppingListBinding;

public class ShoppingListActivity extends AppCompatActivity {
    private ActivityShoppingListBinding shoppingListBinding;
    private final Button[] mButton = {
            shoppingListBinding.button,
            shoppingListBinding.button2,
            shoppingListBinding.button3,
            shoppingListBinding.button4,
            shoppingListBinding.button5,
            shoppingListBinding.button6,
    };
    public final static String ITEM_TAG = "com.example.codingchallenge022.EXTRA.ITEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(shoppingListBinding.getRoot());

        for (Button button : mButton) {
            button.setOnClickListener(v -> {
                Button btn = (Button) v;

                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra(ITEM_TAG, btn.getText().toString());

                setResult(RESULT_OK, intent);
                finish();
            });
        }
    }
}