package io.github.cutelibs.cutedialogdemo;


import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import io.github.cutelibs.cutedialog.CuteDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button);
        b.setOnClickListener(v -> {
            new CuteDialog(this)
                    .isCancelable(true)
                    .setPositiveListener(v1 -> {
                        Toast.makeText(MainActivity.this, "Positive", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeListener(v2 -> {
                        Toast.makeText(MainActivity.this, "Negative", Toast.LENGTH_SHORT).show();
                    })
                    .setCloseListener(v3 -> {
                            Toast.makeText(MainActivity.this, "Dismiss", Toast.LENGTH_SHORT).show();
                    })
                    .show();

        });


    }
}