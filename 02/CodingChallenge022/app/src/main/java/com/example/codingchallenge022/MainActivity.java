package com.example.codingchallenge022;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.codingchallenge022.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private final String LOG_TAG = MainActivity.class.getSimpleName();
    private int mTextViewCount = 0;
    private ActivityMainBinding mainBinding;
    private TextView[] mTextView;
    private final ActivityResultLauncher<Intent> mAddShoppingList =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                    result -> {
                        if (result.getResultCode() == RESULT_OK) {
                            Intent intent = result.getData();

                            String item = intent.getStringExtra(ShoppingListActivity.ITEM_TAG);
                            mTextView[mTextViewCount].setText(item);
                            mTextViewCount++;

                            if (mTextViewCount == 9) {
                                mainBinding.addItem.setEnabled(false);
                            }
                        }
                    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        mTextView = new TextView[]{
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

        mainBinding.addItem.setOnClickListener(v -> {
            Intent intent = new Intent(this, ShoppingListActivity.class);
            mAddShoppingList.launch(intent);
        });
    }
}