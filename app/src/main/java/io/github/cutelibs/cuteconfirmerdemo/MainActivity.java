package io.github.cutelibs.cuteconfirmerdemo;


import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

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
                    .setDialogStyle(Color.WHITE, 10, ConfirmerEnums.POSITION_CENTER, 10)
                    .setCancelable(true)
                    .setCloseIconStyle(R.drawable.ic_baseline_change_history_24, 30, Color.RED)
                    .setHeader(ConfirmerEnums.HEADER_ANIMATION)
                    .setHeaderAnimation(R.raw.demo_anim)
                    .setTitle("Title", 20, Color.BLACK, ConfirmerEnums.STYLE_BOLD)
                    .setDesc("Hello Boy dsfhjasdff asdjkfa sdlflasd jflajsdlkjf", 15, Color.BLACK, ConfirmerEnums.STYLE_NORMAL)
                    .setButtonStyle(20, Color.GREEN, 10)
                    .setPositiveText("Okay", Color.DKGRAY)
                    .setNegativeText("Cancel", Color.RED)
                    .show();

        });


    }
}