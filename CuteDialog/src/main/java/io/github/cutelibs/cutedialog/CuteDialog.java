package io.github.cutelibs.cutedialog;


import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.core.content.ContextCompat;

import io.github.cutelibs.cutedialog.databinding.CuteDialogMainLayoutBinding;


/**
 * Created by ahmmedrejowan with CuteLibs on 2022.
 */


public class CuteDialog extends Dialog {

    // Enums
    public static final int POSITION_CENTER = 1;
    public static final int POSITION_TOP = 2;
    public static final int POSITION_BOTTOM = 3;
    public static final int STYLE_NORMAL = 1;
    public static final int STYLE_BOLD = 2;
    public static final int STYLE_ITALIC = 3;
    public static final int STYLE_BOLD_ITALIC = 4;
    public static final int HEADER_ICON = 1;
    public static final int HEADER_IMAGE = 2;
    public static final int HEADER_ANIMATION = 3;
    // Default Value
    private static final int WHOLE_BACKGROUND_COLOR_DEFAULT = Color.parseColor("#FFFFFF");
    private static final int CLOSE_ICON_COLOR_DEFAULT = Color.parseColor("#A0A0A0");
    private static final int TITLE_TEXT_COLOR_DEFAULT = Color.parseColor("#398AB9");
    private static final int DESC_TEXT_COLOR_DEFAULT = Color.parseColor("#222222");
    private static final int BUTTON_BACKGROUND_COLOR_DEFAULT = Color.parseColor("#398AB9");
    private static final int POSITIVE_BUTTON_TEXT_COLOR_DEFAULT = Color.parseColor("#FFFFFF");
    private static final int NEGATIVE_BUTTON_TEXT_COLOR_DEFAULT = Color.parseColor("#222222");
    private static final int CLOSE_ICON_SIZE_DEFAULT = 30;
    private static final int WHOLE_CORNER_RADIUS_DEFAULT = 10;
    private static final int WHOLE_PADDING_DEFAULT = 10;
    private static final int TITLE_TEXT_SIZE_DEFAULT = 20;
    private static final int DESC_TEXT_SIZE_DEFAULT = 14;
    private static final int BUTTON_CORNER_RADIUS_DEFAULT = 10;
    private static final int BUTTON_TEXT_SIZE_DEFAULT = 16;
    private static final String POSITIVE_BUTTON_TEXT_DEFAULT = "Yes";
    private static final String NEGATIVE_BUTTON_TEXT_DEFAULT = "No";
    private static final String TITLE_TEXT_DEFAULT = "";
    private static final String DESC_TEXT_DEFAULT = "";
    private final Context context;
    CuteDialogMainLayoutBinding binding;
    private int HEADER_CHOOSER = 1;


    public CuteDialog(Context context) {
        super(context);
        this.context = context;
        binding = CuteDialogMainLayoutBinding.inflate(LayoutInflater.from(context));
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        getWindow().setLayout(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        setContentView(binding.getRoot());
        inits();

    }

    private void inits() {
        // whole card design
        getWindow().setGravity(Gravity.CENTER);
        setCancelable(true);
        binding.wholeCard.setCardBackgroundColor(WHOLE_BACKGROUND_COLOR_DEFAULT);
        binding.wholeCard.setRadius(WHOLE_CORNER_RADIUS_DEFAULT * 4);

        // padding
        binding.padding1.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING_DEFAULT * 4));
        binding.padding2.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING_DEFAULT * 2));
        binding.padding3.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING_DEFAULT * 4));
        binding.padding4.setLayoutParams(new LinearLayout.LayoutParams(WHOLE_PADDING_DEFAULT * 4, ViewGroup.LayoutParams.WRAP_CONTENT));
        binding.padding5.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING_DEFAULT * 4));
        if (HEADER_CHOOSER == 1) {
            binding.padding6.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING_DEFAULT * 4));
        } else {
            binding.padding6.setVisibility(View.GONE);
        }

        // close icon
        binding.closeIcon.setImageResource(R.drawable.cute_dialog_close_icon);
        binding.closeIcon.setColorFilter(CLOSE_ICON_COLOR_DEFAULT);
        binding.closeIcon.getLayoutParams().height = CLOSE_ICON_SIZE_DEFAULT * 2;
        binding.closeIcon.getLayoutParams().width = CLOSE_ICON_SIZE_DEFAULT * 2;

        // header visibility
        binding.mainIcon.setVisibility(View.VISIBLE);
        binding.mainImage.setVisibility(View.GONE);
        binding.mainAnimation.setVisibility(View.GONE);

        // title Text
        binding.titleText.setText(TITLE_TEXT_DEFAULT);
        binding.titleText.setTextSize(TypedValue.COMPLEX_UNIT_SP, TITLE_TEXT_SIZE_DEFAULT);
        binding.titleText.setTextColor(TITLE_TEXT_COLOR_DEFAULT);
        binding.titleText.setTypeface(binding.titleText.getTypeface(), Typeface.BOLD);

        // description Text
        binding.descText.setText(DESC_TEXT_DEFAULT);
        binding.descText.setTextSize(TypedValue.COMPLEX_UNIT_SP, DESC_TEXT_SIZE_DEFAULT);
        binding.descText.setTextColor(DESC_TEXT_COLOR_DEFAULT);
        binding.descText.setTypeface(binding.descText.getTypeface(), Typeface.NORMAL);

        // positive button style
        binding.positiveButton.setRadius(BUTTON_CORNER_RADIUS_DEFAULT * 4);
        binding.positiveButton.setCardBackgroundColor(BUTTON_BACKGROUND_COLOR_DEFAULT);
        binding.positiveButton.setStrokeColor(BUTTON_BACKGROUND_COLOR_DEFAULT);
        binding.positiveButton.setStrokeWidth(1);

        // negative button style
        binding.negativeButton.setRadius(BUTTON_CORNER_RADIUS_DEFAULT * 4);
        binding.negativeButton.setCardBackgroundColor(WHOLE_BACKGROUND_COLOR_DEFAULT);
        binding.negativeButton.setStrokeColor(BUTTON_BACKGROUND_COLOR_DEFAULT);
        binding.negativeButton.setStrokeWidth(1);

        // button text
        binding.positiveText.setTextSize(TypedValue.COMPLEX_UNIT_SP, BUTTON_TEXT_SIZE_DEFAULT);
        binding.negativeText.setTextSize(TypedValue.COMPLEX_UNIT_SP, BUTTON_TEXT_SIZE_DEFAULT);
        binding.positiveText.setText(POSITIVE_BUTTON_TEXT_DEFAULT);
        binding.positiveText.setTextColor(POSITIVE_BUTTON_TEXT_COLOR_DEFAULT);
        binding.negativeText.setText(NEGATIVE_BUTTON_TEXT_DEFAULT);
        binding.negativeText.setTextColor(NEGATIVE_BUTTON_TEXT_COLOR_DEFAULT);

        // button click
        binding.positiveButton.setOnClickListener(v -> dismiss());
        binding.negativeButton.setOnClickListener(v -> dismiss());
        binding.closeIcon.setOnClickListener(v -> dismiss());

    }

    public CuteDialog setDialogStyle(int bgColor, int cornerRadius, int dialogPosition, int padding) {

        // set dialog position
        if (dialogPosition == 1) {
            getWindow().setGravity(Gravity.CENTER);
        } else if (dialogPosition == 2) {
            getWindow().setGravity(Gravity.TOP);
        } else if (dialogPosition == 3) {
            getWindow().setGravity(Gravity.BOTTOM);
        } else {
            getWindow().setGravity(Gravity.CENTER);
        }

        // wholeCard background
        if (bgColor != 0) {
            try {
                binding.wholeCard.setCardBackgroundColor(ContextCompat.getColor(context, bgColor));
            } catch (Resources.NotFoundException e) {
                binding.wholeCard.setCardBackgroundColor(bgColor);
            }
        }

        // wholeCard corner radius
        if (cornerRadius != 0) {
            binding.wholeCard.setRadius(cornerRadius * 4);
        }

        // wholeCard padding
        if (padding != 0) {
            binding.padding1.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, padding * 4));
            binding.padding2.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, padding * 2));
            binding.padding3.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, padding * 4));
            binding.padding4.setLayoutParams(new LinearLayout.LayoutParams(padding * 4, ViewGroup.LayoutParams.WRAP_CONTENT));
            binding.padding5.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, padding * 4));
            if (HEADER_CHOOSER == 1) {
                binding.padding6.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, padding * 4));
            } else {
                binding.padding6.setVisibility(View.GONE);
            }
        }

        return this;
    }

    public CuteDialog isCancelable(boolean cancelable) {
        setCancelable(cancelable);
        return this;
    }

    public CuteDialog setCloseIconStyle(int iconResID, int sizeInDP, int colorOfIcon) {

        // closeIcon
        if (iconResID != 0) {
            try {
                binding.closeIcon.setImageResource(iconResID);
            } catch (Resources.NotFoundException e) {
                binding.closeIcon.setImageResource(R.drawable.cute_dialog_close_icon);
            }
        }

        // closeIcon color
        if (colorOfIcon != 0) {
            try {
                binding.closeIcon.setColorFilter(ContextCompat.getColor(context, colorOfIcon));
            } catch (Resources.NotFoundException e) {
                binding.closeIcon.setColorFilter(colorOfIcon);
            }
        }

        // closeIcon size
        if (sizeInDP != 0) {
            binding.closeIcon.getLayoutParams().height = sizeInDP * 2;
            binding.closeIcon.getLayoutParams().width = sizeInDP * 2;
            binding.closeIcon.requestLayout();
        }

        return this;
    }

    public CuteDialog setHeader(int chooser) {
        HEADER_CHOOSER = chooser;

        if (chooser == 2) {
            binding.mainIcon.setVisibility(View.GONE);
            binding.mainImage.setVisibility(View.VISIBLE);
            binding.mainAnimation.setVisibility(View.GONE);
            binding.padding6.setVisibility(View.GONE);
        } else if (chooser == 3) {
            binding.mainIcon.setVisibility(View.GONE);
            binding.mainImage.setVisibility(View.GONE);
            binding.mainAnimation.setVisibility(View.VISIBLE);
            binding.padding6.setVisibility(View.GONE);
        } else {
            binding.mainIcon.setVisibility(View.VISIBLE);
            binding.mainImage.setVisibility(View.GONE);
            binding.mainAnimation.setVisibility(View.GONE);
            binding.padding6.setVisibility(View.VISIBLE);
        }

        return this;
    }

    public CuteDialog setHeaderIcon(int icon) {
        try {
            binding.mainIcon.setImageResource(icon);
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }
        return this;
    }

    public CuteDialog setHeaderImage(int image) {
        try {
            binding.mainImage.setImageResource(image);
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }

        return this;
    }

    public CuteDialog setHeaderAnimation(int animation) {
        try {
            binding.mainAnimation.setAnimation(animation);
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }

        return this;
    }

    public CuteDialog setTitle(String titleText, int textSizeInSP, int textColor, int textStyle) {
        binding.titleText.setText(titleText);

        if (textSizeInSP != 0) {
            binding.titleText.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSizeInSP);
        }

        // title Text color
        if (textColor != 0) {
            try {
                binding.titleText.setTextColor(ContextCompat.getColor(context, textColor));
            } catch (Resources.NotFoundException e) {
                binding.titleText.setTextColor(textColor);
            }
        }

        // title text style
        if (textStyle == 1) {
            binding.titleText.setTypeface(binding.titleText.getTypeface(), Typeface.NORMAL);
        } else if (textStyle == 2) {
            binding.titleText.setTypeface(binding.titleText.getTypeface(), Typeface.BOLD);
        } else if (textStyle == 3) {
            binding.titleText.setTypeface(binding.titleText.getTypeface(), Typeface.ITALIC);
        } else if (textStyle == 4) {
            binding.titleText.setTypeface(binding.titleText.getTypeface(), Typeface.BOLD_ITALIC);
        } else {
            binding.titleText.setTypeface(binding.titleText.getTypeface(), Typeface.NORMAL);
        }

        return this;
    }

    public CuteDialog setDesc(String descText, int textSizeInSP, int textColor, int textStyle) {

        binding.descText.setText(descText);

        if (textSizeInSP != 0) {
            binding.descText.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSizeInSP);
        }

        // desc Text color
        if (textColor != 0) {
            try {
                binding.descText.setTextColor(ContextCompat.getColor(context, textColor));
            } catch (Resources.NotFoundException e) {
                binding.descText.setTextColor(textColor);
            }
        }

        // desc text style
        if (textStyle == 1) {
            binding.descText.setTypeface(binding.descText.getTypeface(), Typeface.NORMAL);
        } else if (textStyle == 2) {
            binding.descText.setTypeface(binding.descText.getTypeface(), Typeface.BOLD);
        } else if (textStyle == 3) {
            binding.descText.setTypeface(binding.descText.getTypeface(), Typeface.ITALIC);
        } else if (textStyle == 4) {
            binding.descText.setTypeface(binding.descText.getTypeface(), Typeface.BOLD_ITALIC);
        } else {
            binding.descText.setTypeface(binding.descText.getTypeface(), Typeface.NORMAL);
        }

        return this;
    }

    public CuteDialog setPositiveButtonStyle(int radiusOfButton, int bgColorOfButton, int borderColor, int borderWidth, int textSizeInSP) {

        if (radiusOfButton != 0) {
            binding.positiveButton.setRadius(radiusOfButton * 4);
        }

        if (bgColorOfButton != 0) {
            try {
                binding.positiveButton.setCardBackgroundColor(ContextCompat.getColor(context, bgColorOfButton));
            } catch (Resources.NotFoundException e) {
                binding.positiveButton.setCardBackgroundColor(bgColorOfButton);
            }
        }

        if (borderColor != 0) {
            try {
                binding.positiveButton.setStrokeColor(ContextCompat.getColor(context, borderColor));
            } catch (Resources.NotFoundException e) {
                binding.positiveButton.setStrokeColor(borderColor);
            }
        } else {
            if (bgColorOfButton != 0) {
                try {
                    binding.positiveButton.setStrokeColor(ContextCompat.getColor(context, bgColorOfButton));
                } catch (Resources.NotFoundException e) {
                    binding.positiveButton.setStrokeColor(bgColorOfButton);
                }
            }
        }

        if (borderWidth != 0) {
            binding.positiveButton.setStrokeWidth(borderWidth);
        }

        if (textSizeInSP != 0) {
            binding.positiveText.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSizeInSP);
        }

        return this;
    }

    public CuteDialog setNegativeButtonStyle(int radiusOfButton, int bgColorOfButton, int borderColor, int borderWidth, int textSizeInSP) {

        if (radiusOfButton != 0) {
            binding.negativeButton.setRadius(radiusOfButton * 4);

        }

        if (bgColorOfButton != 0) {
            try {
                binding.negativeButton.setCardBackgroundColor(ContextCompat.getColor(context, bgColorOfButton));
            } catch (Resources.NotFoundException e) {
                binding.negativeButton.setCardBackgroundColor(bgColorOfButton);
            }
        }

        if (borderColor != 0) {
            try {
                binding.negativeButton.setStrokeColor(ContextCompat.getColor(context, borderColor));
            } catch (Resources.NotFoundException e) {
                binding.negativeButton.setStrokeColor(borderColor);
            }
        } else {
            if (bgColorOfButton != 0) {
                try {
                    binding.negativeButton.setStrokeColor(ContextCompat.getColor(context, bgColorOfButton));
                } catch (Resources.NotFoundException e) {
                    binding.negativeButton.setStrokeColor(bgColorOfButton);
                }
            }
        }

        if (borderWidth != 0) {
            binding.negativeButton.setStrokeWidth(borderWidth);
        }


        if (textSizeInSP != 0) {
            binding.negativeText.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSizeInSP);
        }


        return this;
    }

    public CuteDialog setPositiveButtonText(String positiveText, int textColor, int textStyle) {
        binding.positiveText.setText(positiveText);
        if (textColor != 0) {
            try {
                binding.positiveText.setTextColor(ContextCompat.getColor(context, textColor));
            } catch (Resources.NotFoundException e) {
                binding.positiveText.setTextColor(textColor);
            }
        }

        // positive text style
        if (textStyle == 1) {
            binding.positiveText.setTypeface(binding.positiveText.getTypeface(), Typeface.NORMAL);
        } else if (textStyle == 2) {
            binding.positiveText.setTypeface(binding.positiveText.getTypeface(), Typeface.BOLD);
        } else if (textStyle == 3) {
            binding.positiveText.setTypeface(binding.positiveText.getTypeface(), Typeface.ITALIC);
        } else if (textStyle == 4) {
            binding.positiveText.setTypeface(binding.positiveText.getTypeface(), Typeface.BOLD_ITALIC);
        } else {
            binding.positiveText.setTypeface(binding.positiveText.getTypeface(), Typeface.NORMAL);
        }

        return this;
    }

    public CuteDialog setNegativeButtonText(String negativeText, int textColor, int textStyle) {

        binding.negativeText.setText(negativeText);
        if (textColor != 0) {
            try {
                binding.negativeText.setTextColor(ContextCompat.getColor(context, textColor));
            } catch (Resources.NotFoundException e) {
                binding.negativeText.setTextColor(textColor);
            }
        }

        // negative text style
        if (textStyle == 1) {
            binding.negativeText.setTypeface(binding.negativeText.getTypeface(), Typeface.NORMAL);
        } else if (textStyle == 2) {
            binding.negativeText.setTypeface(binding.negativeText.getTypeface(), Typeface.BOLD);
        } else if (textStyle == 3) {
            binding.negativeText.setTypeface(binding.negativeText.getTypeface(), Typeface.ITALIC);
        } else if (textStyle == 4) {
            binding.negativeText.setTypeface(binding.negativeText.getTypeface(), Typeface.BOLD_ITALIC);
        } else {
            binding.negativeText.setTypeface(binding.negativeText.getTypeface(), Typeface.NORMAL);
        }

        return this;
    }

    public CuteDialog setVisibilityOptions(boolean hideCloseIcon, boolean hideTitle, boolean hideDesc, boolean hidePositiveButton, boolean hideNegativeButton) {

        if (hideCloseIcon) {
            binding.closeIcon.setVisibility(View.GONE);
        } else {
            binding.closeIcon.setVisibility(View.VISIBLE);
        }

        if (hideTitle) {
            binding.titleText.setVisibility(View.GONE);
        } else {
            binding.titleText.setVisibility(View.VISIBLE);
        }

        if (hideDesc) {
            binding.descText.setVisibility(View.GONE);
        } else {
            binding.descText.setVisibility(View.VISIBLE);
        }

        if (hidePositiveButton) {
            binding.positiveButton.setVisibility(View.GONE);
        } else {
            binding.positiveButton.setVisibility(View.VISIBLE);
        }

        if (hideNegativeButton) {
            binding.negativeButton.setVisibility(View.GONE);
        } else {
            binding.negativeButton.setVisibility(View.VISIBLE);
        }

        if (hideNegativeButton || hidePositiveButton) {
            binding.padding4.setVisibility(View.GONE);
        } else {
            binding.padding4.setVisibility(View.VISIBLE);
        }

        return this;

    }

    public CuteDialog setPositiveButtonListener(View.OnClickListener listener) {
        binding.positiveButton.setOnClickListener(v -> {
            listener.onClick(v);
            dismiss();
        });
        return this;
    }

    public CuteDialog setNegativeButtonListener(View.OnClickListener listener) {
        binding.negativeButton.setOnClickListener(v -> {
            listener.onClick(v);
            dismiss();
        });
        return this;
    }

    public CuteDialog setCloseListener(View.OnClickListener listener) {
        binding.closeIcon.setOnClickListener(v -> {
            listener.onClick(v);
            dismiss();
        });
        return this;
    }


}
