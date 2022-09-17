package io.github.cutelibs.cuteconfirmerdemo;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import io.github.cutelibs.cuteconfirmer.ConfirmerEnums;
import io.github.cutelibs.cuteconfirmer.CuteConfirmer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b = findViewById(R.id.button);
        b.setOnClickListener(v -> {

            new CuteConfirmer.withoutConfirmation(this)
                    .show();

        });


    }
}