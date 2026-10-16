package com.example.activitatedam2026;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivitateRezultat extends AppCompatActivity {

    private int suma;

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

        Intent it = getIntent();
        if (it != null && it.getExtras() != null) {
            Bundle bundle = it.getExtras();
            String mesajExtra = bundle.getString("Mesaj", "");
            String mesaj = (mesajExtra != null) ? mesajExtra : "";
            int nr1 = bundle.getInt("numar1", 0);
            int nr2 = bundle.getInt("numar2", 0);
            suma = nr1 + nr2;

            String textAfisat = mesaj + " " + nr1 + " " + nr2;
            Toast.makeText(this, textAfisat, Toast.LENGTH_SHORT).show();
        }

        Log.i("Halangau_Alexandru", "ActivitateRezultat: onCreate - INFO");
    }

    public void intoarcereInActivitate(View view) {
        String altMesaj = "Mesaj de intoarcere!";
        Intent it = new Intent();
        it.putExtra("mesaj", altMesaj);
        it.putExtra("suma", suma);
        setResult(RESULT_OK, it);
        finish();
    }
}
