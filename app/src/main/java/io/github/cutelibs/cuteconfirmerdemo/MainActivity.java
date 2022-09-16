package io.github.cutelibs.cuteconfirmerdemo;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import io.github.cutelibs.cuteconfirmer.CuteConfirmer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CuteConfirmer.IS_DIALOG_CONFIRMED = 1;

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            new CuteConfirmer(this)
                    .show();
        });


    }
}