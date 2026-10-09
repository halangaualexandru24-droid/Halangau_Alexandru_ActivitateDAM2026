package com.example.seminar1;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Halangau_Alexandru";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i(TAG, "MainActivity: onCreate - INFO");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity: onStart - DEBUG");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "MainActivity: onResume - VERBOSE");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG, "MainActivity: onPause - WARNING");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "MainActivity: onStop - ERROR");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "MainActivity: onDestroy - INFO");
    }
}
