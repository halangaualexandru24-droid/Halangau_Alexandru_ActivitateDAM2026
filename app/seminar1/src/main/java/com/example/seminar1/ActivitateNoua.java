package com.example.seminar1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivitateNoua extends AppCompatActivity {

    private static final String TAG = "Halangau_Alexandru";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitate_noua);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.i(TAG, "ActivitateNoua: onCreate - INFO");

        Button button = findViewById(R.id.button);
        if (button != null) {
            button.setOnClickListener(this::deschideActivitate);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivitateNoua: onStart - DEBUG");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "ActivitateNoua: onResume - VERBOSE");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG, "ActivitateNoua: onPause - WARNING");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "ActivitateNoua: onStop - ERROR");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "ActivitateNoua: onDestroy - INFO");
    }

    public void deschideActivitate(View view) {
        Intent it = new Intent(this, ActivitateRezultat.class);
        startActivity(it);
    }
}
