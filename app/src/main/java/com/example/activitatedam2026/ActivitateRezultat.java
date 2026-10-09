package com.example.activitatedam2026;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivitateRezultat extends AppCompatActivity {

    private static final String TAG = "Halangau_Alexandru";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitate_rezultat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.i(TAG, "ActivitateRezultat: onCreate - INFO");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivitateRezultat: onStart - DEBUG");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "ActivitateRezultat: onResume - VERBOSE");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG, "ActivitateRezultat: onPause - WARNING");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "ActivitateRezultat: onStop - ERROR");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "ActivitateRezultat: onDestroy - INFO");
    }
}
