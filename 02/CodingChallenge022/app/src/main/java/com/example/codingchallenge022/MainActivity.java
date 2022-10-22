package com.example.codingchallenge022;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.codingchallenge022.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;
    private int mTextViewCount = 0;
    private final TextView[] mTextView = {
            mainBinding.textView,
            mainBinding.textView2,
            mainBinding.textView3,
            mainBinding.textView4,
            mainBinding.textView5,
            mainBinding.textView6,
            mainBinding.textView7,
            mainBinding.textView8,
            mainBinding.textView9,
    };
    private final ActivityResultLauncher<Intent> mAddShoppingList =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                    result -> {
                        if (result.getResultCode() == RESULT_OK) {
                            Intent intent = result.getData();

                            String item = intent.getStringExtra(ShoppingListActivity.ITEM_TAG);
                            mTextView[mTextViewCount].setText(item);
                            mTextViewCount++;
                        }
                    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mainBinding.getRoot());

        mainBinding.addItem.setOnClickListener(v -> {
            Intent intent = new Intent(this, ShoppingListActivity.class);
            mAddShoppingList.launch(intent);
        });
    }
}