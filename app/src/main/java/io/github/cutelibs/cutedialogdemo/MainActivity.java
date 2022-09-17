package io.github.cutelibs.cutedialogdemo;


import android.graphics.Color;
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
                    .setHeader(CuteDialog.HEADER_ANIMATION)
                    .setDialogStyle(0,20,0,0)
                    .setPositiveText("Okay", Color.WHITE,CuteDialog.STYLE_BOLD)
                    .isCancelable(false)
                    .show();

        });


    }
}