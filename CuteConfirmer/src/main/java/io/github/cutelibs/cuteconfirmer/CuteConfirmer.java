package io.github.cutelibs.cuteconfirmer;

import android.content.Context;
import android.widget.Toast;

public class CuteConfirmer {


    public static int IS_DIALOG_CONFIRMED = 2;
    private final Context context;


    public CuteConfirmer(Context context) {
        this.context = context;
    }

    public void show() {

        if (IS_DIALOG_CONFIRMED == 0) {
            Toast.makeText(context, "Value is 0 / No", Toast.LENGTH_SHORT).show();
        } else if (IS_DIALOG_CONFIRMED == 1) {
            Toast.makeText(context, "Value is 1 / Yes", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Value is Unknown", Toast.LENGTH_SHORT).show();

        }

    }

}
