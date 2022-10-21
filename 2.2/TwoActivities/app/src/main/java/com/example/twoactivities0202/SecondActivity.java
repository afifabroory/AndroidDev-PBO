package com.example.twoactivities0202;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.twoactivities0202.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private final static String LOG_TAG = SecondActivity.class.getSimpleName();
    public final static String EXTRA_REPLY = "com.example.twoactivities0202.extra.REPLY";

    private ActivitySecondBinding secondBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        secondBinding = ActivitySecondBinding.inflate(getLayoutInflater());

        secondBinding.buttonMain.setOnClickListener(view -> {
            Log.d(LOG_TAG, "Reply button clicked");

            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra(EXTRA_REPLY, secondBinding.editText.getText().toString());

            setResult(RESULT_OK, intent);
            finish();
        });

        setContentView(secondBinding.getRoot());

        Intent intent = getIntent();
        secondBinding.textView2.setText(intent.getStringExtra(MainActivity.EXTRA_MESSAGE));
    }
}