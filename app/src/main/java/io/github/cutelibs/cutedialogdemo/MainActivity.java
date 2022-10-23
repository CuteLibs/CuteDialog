package io.github.cutelibs.cutedialogdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import io.github.cutelibs.cutedialog.CuteDialog;
import io.github.cutelibs.cutedialog.CuteDialog;
import io.github.cutelibs.cutedialogdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.design1.setOnClickListener(v -> new CuteDialog(this)
                .setHeader(CuteDialog.HEADER_ICON)
                .setHeaderIcon(R.drawable.icon_1)
                .setTitle("Wrong Time", 0, 0, 0)
                .setDesc("You can't do this right now.\nTry Later", 0, 0, 0)
                .show());

        binding.design2.setOnClickListener(v -> new CuteDialog(this)
                .setHeader(CuteDialog.HEADER_IMAGE)
                .setHeaderImage(R.drawable.image_1)
                .setTitle("Take a break", 0, 0, 0)
                .setDesc("Isn't it a great time to go for a walk?", 0, 0, 0)
                .show());

        binding.design3.setOnClickListener(v -> new CuteDialog(this)
                .setHeader(CuteDialog.HEADER_ANIMATION)
                .setHeaderAnimation(R.raw.anim1)
                .setTitle("Set Reminder", 0, 0, 0)
                .setDesc("Do you want me to remind you? ", 0, 0, 0)
                .show());

        binding.design4.setOnClickListener(v -> new CuteDialog(this)
                .setHeader(CuteDialog.HEADER_IMAGE)
                .setHeaderImage(R.drawable.image_3)
                .setTitle("Take a break", 0, 0, 0)
                .setDesc("Isn't it a great time to go for a walk?", 0, 0, 0)
                .setVisibilityOptions(false, false, false, false, true)
                .show());

        binding.design5.setOnClickListener(v -> new CuteDialog(this)
                .setHeader(CuteDialog.HEADER_ANIMATION)
                .setHeaderAnimation(R.raw.anim2)
                .setTitle("Need Help?", 0, 0, 0)
                .setDesc("It's okay to ask for help, don't shy :) ", 0, 0, 0)
                .setVisibilityOptions(true, false, false, false, false)
                .show());


        binding.design6.setOnClickListener(v -> new CuteDialog(this)
                .setHeader(CuteDialog.HEADER_ANIMATION)
                .setHeaderAnimation(R.raw.anim3)
                .setDesc("Message Sent Successfully!", 0, 0, 0)
                .setVisibilityOptions(false, true, false, false, true)
                .setPositiveButtonText("Okay", 0, 0)
                .show());

        binding.design7.setOnClickListener(v -> new CuteDialog(this)
                .setDialogStyle(Color.WHITE, 10, CuteDialog.POSITION_CENTER, 10)
                .isCancelable(true)
                .setCloseIconStyle(0, 30, Color.DKGRAY)
                .setHeader(CuteDialog.HEADER_IMAGE)
                .setHeaderImage(R.drawable.image_4)
                .setTitle("Something is Wrong", 0, R.color.design1, 0)
                .setDesc("I don't know what went wrong, but there is a problem.", 0, 0, 0)
                .setPositiveButtonText("Try Again", R.color.white, 0)
                .setNegativeButtonText("Cancel", R.color.design1, 0)
                .setPositiveButtonStyle(0, R.color.design1, 0, 0, 0)
                .setNegativeButtonStyle(0, 0, R.color.design1, 3, 0)
                .setPositiveButtonListener(v1 -> Toast.makeText(this, "Positive Button Clicked", Toast.LENGTH_SHORT).show())
                .setNegativeButtonListener(v12 -> Toast.makeText(this, "Negative Button Clicked", Toast.LENGTH_SHORT).show())
                .setCloseListener(v13 -> Toast.makeText(this, "Close Icon Clicked", Toast.LENGTH_SHORT).show())
                .show());

        binding.design8.setOnClickListener(v -> new CuteDialog(this)
                .setHeader(CuteDialog.HEADER_IMAGE)
                .setHeaderImage(R.drawable.image_5)
                .setTitle("Time for Study", 0, R.color.design2, 0)
                .setDesc("It's time for some reading and writing. Take a break from phone.", 0, 0, 0)
                .setPositiveButtonStyle(0, R.color.design2, 0, 0, 0)
                .setNegativeButtonStyle(0, 0, R.color.design2, 0, 0)
                .show());

        binding.design9.setOnClickListener(v -> new CuteDialog(this)
                .setHeader(CuteDialog.HEADER_ICON)
                .setHeaderIcon(R.drawable.icon_5)
                .setTitle("Idea!", 0, R.color.design3, 0)
                .setDesc("Do you want to save this idea?", 0, 0, 0)
                .setPositiveButtonStyle(0, R.color.design3, 0, 0, 0)
                .setNegativeButtonStyle(0, 0, R.color.design3, 0, 0)
                .show());

        binding.design10.setOnClickListener(v -> new CuteDialog(this)
                .setHeader(CuteDialog.HEADER_ANIMATION)
                .setHeaderAnimation(R.raw.anim4)
                .setTitle("No Internet", 0, 0, 0)
                .setVisibilityOptions(false, false, true, false, false)
                .show());

        binding.design11.setOnClickListener(v -> {
            
            new CuteDialog.withIcon(this)
                    .setPo
            
            
        });


    }
}