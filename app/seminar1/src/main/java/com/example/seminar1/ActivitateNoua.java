package com.example.seminar1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivitateNoua extends AppCompatActivity {

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

        Log.i("Halangau_Alexandru", "onCreate - INFO");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Halangau_Alexandru", "onStart - DEBUG");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Halangau_Alexandru", "onResume - VERBOSE");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("Halangau_Alexandru", "onPause - WARNING");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Halangau_Alexandru", "onStop - ERROR");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Halangau_Alexandru", "onDestroy - INFO");
    }

    public void deschideActivitate(View view) {
        Intent it = new Intent(this, ActivitateRezultat.class);
        Bundle bundle = new Bundle();
        bundle.putString("Mesaj", "Mesaj din prima activitate!");
        bundle.putInt("numar1", 5);
        bundle.putInt("numar2", 7);
        it.putExtras(bundle);
        startActivityForResult(it, 70);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 70) {
            if (resultCode == RESULT_OK) {
                String mesaj = data.getStringExtra("mesaj");
                int suma = data.getIntExtra("suma", 0);

                StringBuilder builder = new StringBuilder(mesaj);
                builder.append(" ").append(suma);

                Toast.makeText(this, builder.toString(), Toast.LENGTH_LONG).show();
            }
        }
    }
}
