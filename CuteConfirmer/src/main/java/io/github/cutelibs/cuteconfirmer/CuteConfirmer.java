package io.github.cutelibs.cuteconfirmer;


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


public class CuteConfirmer {


    public static class withoutConfirmation {

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
        // whole_card
        private static int WHOLE_BACKGROUND_COLOR = 0;
        private static int WHOLE_CORNER_RADIUS = 0;
        private static int WHOLE_DIALOG_POSITION = 1;
        private static int WHOLE_PADDING = 0;
        private static boolean WHOLE_CANCELABLE = true;
        // close_icon
        private static int CLOSE_ICON = 0;
        private static int CLOSE_ICON_SIZE = 0;
        private static int CLOSE_ICON_COLOR = 0;
        // header chooser
        private static int HEADER_CHOOSER = 1;
        // main_icon
        private static int MAIN_ICON = 0;
        //  main_image
        private static int MAIN_IMAGE = 0;
        // main_animation
        private static int MAIN_ANIMATION = 0;
        // title_text
        private static String TITLE_TEXT = "Delete File!";
        private static int TITLE_TEXT_SIZE = 0;
        private static int TITLE_TEXT_COLOR = 0;
        private static int TITLE_TEXT_STYLE = 1;
        // desc_text
        private static String DESC_TEXT = "Do you want to delete this file?";
        private static int DESC_TEXT_SIZE = 0;
        private static int DESC_TEXT_COLOR = 0;
        private static int DESC_TEXT_STYLE = 1;
        // negative_button / positive_button
        private static int BUTTON_CORNER_RADIUS = 0;
        private static int BUTTON_BACKGROUND_COLOR = 0;
        private static int BUTTON_TEXT_SIZE = 0;
        // positive_text
        private static String POSITIVE_BUTTON_TEXT = "Yes";
        private static int POSITIVE_BUTTON_TEXT_COLOR = 0;

        // negative_text
        private static String NEGATIVE_BUTTON_TEXT = "No";
        private static int NEGATIVE_BUTTON_TEXT_COLOR = 0;

        // Others
        private final Context context;
        io.github.cutelibs.cuteconfirmer.databinding.CuteConfirmerMainBinding binding;


        public withoutConfirmation(Context context) {
            this.context = context;
        }

        public withoutConfirmation setDialogStyle(int bgColor, int cornerRadius, int dialogPosition, int padding) {
            WHOLE_BACKGROUND_COLOR = bgColor;
            WHOLE_CORNER_RADIUS = cornerRadius;
            WHOLE_DIALOG_POSITION = dialogPosition;
            WHOLE_PADDING = padding;

            return this;
        }

        public withoutConfirmation setCancelable(boolean cancelable) {
            WHOLE_CANCELABLE = cancelable;
            return this;
        }


        // close icon
        public withoutConfirmation setCloseIconStyle(int iconResID, int sizeInDP, int colorOfIcon) {
            CLOSE_ICON = iconResID;
            CLOSE_ICON_SIZE = sizeInDP;
            CLOSE_ICON_COLOR = colorOfIcon;

            return this;
        }


        public withoutConfirmation setHeader(int chooser) {
            HEADER_CHOOSER = chooser;
            return this;
        }

        public withoutConfirmation setHeaderIcon(int icon) {
            MAIN_ICON = icon;
            return this;
        }

        public withoutConfirmation setHeaderImage(int image) {
            MAIN_IMAGE = image;
            return this;
        }

        public withoutConfirmation setHeaderAnimation(int animation) {
            MAIN_ANIMATION = animation;
            return this;
        }

        public withoutConfirmation setTitle(String titleText, int textSizeInSP, int textColor, int textStyle) {
            TITLE_TEXT = titleText;
            TITLE_TEXT_SIZE = textSizeInSP;
            TITLE_TEXT_COLOR = textColor;
            TITLE_TEXT_STYLE = textStyle;
            return this;
        }

        public withoutConfirmation setDesc(String descText, int textSizeInSP, int textColor, int textStyle) {
            DESC_TEXT = descText;
            DESC_TEXT_SIZE = textSizeInSP;
            DESC_TEXT_COLOR = textColor;
            DESC_TEXT_STYLE = textStyle;
            return this;
        }

        public withoutConfirmation setButtonStyle(int radiusOfButton, int bgColorOfButton, int textSizeInSP) {
            BUTTON_CORNER_RADIUS = radiusOfButton;
            BUTTON_BACKGROUND_COLOR = bgColorOfButton;
            BUTTON_TEXT_SIZE = textSizeInSP;

            return this;
        }

        public withoutConfirmation setPositiveText(String positiveText, int textColor) {
            POSITIVE_BUTTON_TEXT = positiveText;
            POSITIVE_BUTTON_TEXT_COLOR = textColor;
            return this;
        }

        public withoutConfirmation setNegativeText(String negativeText, int textColor) {
            NEGATIVE_BUTTON_TEXT = negativeText;
            NEGATIVE_BUTTON_TEXT_COLOR = textColor;
            return this;
        }


        public void show() {

            binding = io.github.cutelibs.cuteconfirmer.databinding.CuteConfirmerMainBinding.inflate(LayoutInflater.from(context));

            final Dialog dialog = new Dialog(context);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            dialog.getWindow().setLayout(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
            dialog.setContentView(binding.getRoot());

            // set dialog position
            if (WHOLE_DIALOG_POSITION == 1) {
                dialog.getWindow().setGravity(Gravity.CENTER);
            } else if (WHOLE_DIALOG_POSITION == 2) {
                dialog.getWindow().setGravity(Gravity.TOP);
            } else if (WHOLE_DIALOG_POSITION == 3) {
                dialog.getWindow().setGravity(Gravity.BOTTOM);
            } else {
                dialog.getWindow().setGravity(Gravity.CENTER);
            }

            // cancelable
            dialog.setCancelable(WHOLE_CANCELABLE);


            // wholeCard background
            if (WHOLE_BACKGROUND_COLOR != 0) {
                try {
                    binding.wholeCard.setCardBackgroundColor(ContextCompat.getColor(context, WHOLE_BACKGROUND_COLOR));
                    binding.positiveButtonBg.setCardBackgroundColor(ContextCompat.getColor(context, WHOLE_BACKGROUND_COLOR));
                } catch (Resources.NotFoundException e) {
                    binding.wholeCard.setCardBackgroundColor(WHOLE_BACKGROUND_COLOR);
                    binding.positiveButtonBg.setCardBackgroundColor(WHOLE_BACKGROUND_COLOR);
                }
            } else {
                binding.wholeCard.setCardBackgroundColor(WHOLE_BACKGROUND_COLOR_DEFAULT);
                binding.positiveButtonBg.setCardBackgroundColor(WHOLE_BACKGROUND_COLOR_DEFAULT);
            }

            // wholeCard corner radius
            if (WHOLE_CORNER_RADIUS != 0) {
                binding.wholeCard.setRadius(WHOLE_CORNER_RADIUS * 4);
            } else {
                binding.wholeCard.setRadius(WHOLE_CORNER_RADIUS_DEFAULT * 4);
            }


            // wholeCard padding
            if (WHOLE_PADDING != 0) {
                binding.padding1.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING * 4));
                binding.padding2.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING * 2));
                binding.padding3.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING * 4));
                binding.padding4.setLayoutParams(new LinearLayout.LayoutParams(WHOLE_PADDING * 2, ViewGroup.LayoutParams.WRAP_CONTENT));
                binding.padding5.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING * 4));
                if (HEADER_CHOOSER == 1) {
                    binding.padding6.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING * 4));
                } else {
                    binding.padding6.setVisibility(View.GONE);
                }

            } else {
                binding.padding1.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING_DEFAULT * 4));
                binding.padding2.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING_DEFAULT * 2));
                binding.padding3.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING_DEFAULT * 4));
                binding.padding4.setLayoutParams(new LinearLayout.LayoutParams(WHOLE_PADDING_DEFAULT * 2, ViewGroup.LayoutParams.WRAP_CONTENT));
                binding.padding5.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING_DEFAULT * 4));
                if (HEADER_CHOOSER == 1) {
                    binding.padding6.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, WHOLE_PADDING_DEFAULT * 4));
                } else {
                    binding.padding6.setVisibility(View.GONE);
                }
            }


            // closeIcon
            if (CLOSE_ICON != 0) {
                try {
                    binding.closeIcon.setImageResource(CLOSE_ICON);
                } catch (Resources.NotFoundException e) {
                    binding.closeIcon.setImageResource(R.drawable.ic_close_cute_confirmer);
                }
            } else {
                binding.closeIcon.setImageResource(R.drawable.ic_close_cute_confirmer);
            }

            // closeIcon color
            if (CLOSE_ICON_COLOR != 0) {
                try {
                    binding.closeIcon.setColorFilter(ContextCompat.getColor(context, CLOSE_ICON_COLOR));
                } catch (Resources.NotFoundException e) {
                    binding.closeIcon.setColorFilter(CLOSE_ICON_COLOR);
                }
            } else {
                binding.closeIcon.setColorFilter(CLOSE_ICON_COLOR_DEFAULT);
            }


            // closeIcon size

            if (CLOSE_ICON_SIZE != 0) {
                binding.closeIcon.getLayoutParams().height = CLOSE_ICON_SIZE * 2;
                binding.closeIcon.getLayoutParams().width = CLOSE_ICON_SIZE * 2;
                binding.closeIcon.requestLayout();
            } else {
                binding.closeIcon.getLayoutParams().height = CLOSE_ICON_SIZE_DEFAULT * 2;
                binding.closeIcon.getLayoutParams().width = CLOSE_ICON_SIZE_DEFAULT * 2;
            }


            // header chooser
            if (HEADER_CHOOSER == 1) {
                binding.mainIcon.setVisibility(View.VISIBLE);
                binding.mainImage.setVisibility(View.GONE);
                binding.mainAnimation.setVisibility(View.GONE);

                // mainIcon
                if (MAIN_ICON != 0) {
                    try {
                        binding.mainIcon.setImageResource(MAIN_ICON);
                    } catch (Resources.NotFoundException e) {
                        binding.mainIcon.setImageResource(R.drawable.ic_cute_confirmer);
                    }
                } else {
                    binding.mainIcon.setImageResource(R.drawable.ic_cute_confirmer);
                }


            } else if (HEADER_CHOOSER == 2) {
                binding.mainIcon.setVisibility(View.GONE);
                binding.mainImage.setVisibility(View.VISIBLE);
                binding.mainAnimation.setVisibility(View.GONE);

                // mainImage
                if (MAIN_IMAGE != 0) {
                    try {
                        binding.mainImage.setImageResource(MAIN_IMAGE);
                    } catch (Resources.NotFoundException e) {
                        binding.mainImage.setImageResource(R.drawable.cute_confirmer_demo_image);
                    }
                } else {
                    binding.mainImage.setImageResource(R.drawable.cute_confirmer_demo_image);
                }


            } else if (HEADER_CHOOSER == 3) {
                binding.mainIcon.setVisibility(View.GONE);
                binding.mainImage.setVisibility(View.GONE);
                binding.mainAnimation.setVisibility(View.VISIBLE);

                // mainAnimation
                if (MAIN_ANIMATION != 0) {
                    try {
                        binding.mainAnimation.setAnimation(MAIN_ANIMATION);
                    } catch (Resources.NotFoundException e) {
                        binding.mainAnimation.setAnimation(R.raw.cute_confimer_demo_anim);
                    }
                } else {
                    binding.mainAnimation.setAnimation(R.raw.cute_confimer_demo_anim);
                }

            } else {
                binding.mainIcon.setVisibility(View.VISIBLE);
                binding.mainImage.setVisibility(View.GONE);
                binding.mainAnimation.setVisibility(View.GONE);

                // mainIcon
                if (MAIN_ICON != 0) {
                    try {
                        binding.mainIcon.setImageResource(MAIN_ICON);
                    } catch (Resources.NotFoundException e) {
                        binding.mainIcon.setImageResource(R.drawable.ic_cute_confirmer);
                    }
                } else {
                    binding.mainIcon.setImageResource(R.drawable.ic_cute_confirmer);
                }


            }


            // title Text
            binding.titleText.setText(TITLE_TEXT);
            if (TITLE_TEXT_SIZE != 0) {
                binding.titleText.setTextSize(TypedValue.COMPLEX_UNIT_SP, TITLE_TEXT_SIZE);
            } else {
                binding.titleText.setTextSize(TypedValue.COMPLEX_UNIT_SP, TITLE_TEXT_SIZE_DEFAULT);
            }


            // title Text color
            if (TITLE_TEXT_COLOR != 0) {
                try {
                    binding.titleText.setTextColor(ContextCompat.getColor(context, TITLE_TEXT_COLOR));
                } catch (Resources.NotFoundException e) {
                    binding.titleText.setTextColor(TITLE_TEXT_COLOR);
                }
            } else {
                binding.titleText.setTextColor(TITLE_TEXT_COLOR_DEFAULT);
            }

            // title text style
            if (TITLE_TEXT_STYLE == 1) {
                binding.titleText.setTypeface(binding.titleText.getTypeface(), Typeface.NORMAL);
            } else if (TITLE_TEXT_STYLE == 2) {
                binding.titleText.setTypeface(binding.titleText.getTypeface(), Typeface.BOLD);
            } else if (TITLE_TEXT_STYLE == 3) {
                binding.titleText.setTypeface(binding.titleText.getTypeface(), Typeface.ITALIC);
            } else if (TITLE_TEXT_STYLE == 4) {
                binding.titleText.setTypeface(binding.titleText.getTypeface(), Typeface.BOLD_ITALIC);
            } else {
                binding.titleText.setTypeface(binding.titleText.getTypeface(), Typeface.NORMAL);
            }


            // description Text
            binding.descText.setText(DESC_TEXT);
            if (DESC_TEXT_SIZE != 0) {
                binding.descText.setTextSize(TypedValue.COMPLEX_UNIT_SP, DESC_TEXT_SIZE);
            } else {
                binding.descText.setTextSize(TypedValue.COMPLEX_UNIT_SP, DESC_TEXT_SIZE_DEFAULT);
            }


            // description Text color
            if (DESC_TEXT_COLOR != 0) {
                try {
                    binding.descText.setTextColor(ContextCompat.getColor(context, DESC_TEXT_COLOR));
                } catch (Resources.NotFoundException e) {
                    binding.descText.setTextColor(DESC_TEXT_COLOR);
                }
            } else {
                binding.descText.setTextColor(DESC_TEXT_COLOR_DEFAULT);
            }

            // description text style
            if (DESC_TEXT_STYLE == 1) {
                binding.descText.setTypeface(binding.descText.getTypeface(), Typeface.NORMAL);
            } else if (DESC_TEXT_STYLE == 2) {
                binding.descText.setTypeface(binding.descText.getTypeface(), Typeface.BOLD);
            } else if (DESC_TEXT_STYLE == 3) {
                binding.descText.setTypeface(binding.descText.getTypeface(), Typeface.ITALIC);
            } else if (DESC_TEXT_STYLE == 4) {
                binding.descText.setTypeface(binding.descText.getTypeface(), Typeface.BOLD_ITALIC);
            } else {
                binding.descText.setTypeface(binding.descText.getTypeface(), Typeface.NORMAL);
            }


            // button corner radius

            if (BUTTON_CORNER_RADIUS != 0) {
                binding.positiveButton.setRadius(BUTTON_CORNER_RADIUS * 4);
                binding.negativeButton.setRadius(BUTTON_CORNER_RADIUS * 4);
                binding.positiveButtonBg.setRadius(BUTTON_CORNER_RADIUS * 4);

            } else {
                binding.positiveButton.setRadius(BUTTON_CORNER_RADIUS_DEFAULT * 4);
                binding.negativeButton.setRadius(BUTTON_CORNER_RADIUS_DEFAULT * 4);
                binding.positiveButtonBg.setRadius(BUTTON_CORNER_RADIUS_DEFAULT * 4);
            }


            // button color
            if (BUTTON_BACKGROUND_COLOR != 0) {
                try {
                    binding.positiveButton.setCardBackgroundColor(ContextCompat.getColor(context, BUTTON_BACKGROUND_COLOR));
                    binding.negativeButton.setCardBackgroundColor(ContextCompat.getColor(context, BUTTON_BACKGROUND_COLOR));
                } catch (Resources.NotFoundException e) {
                    binding.positiveButton.setCardBackgroundColor(BUTTON_BACKGROUND_COLOR);
                    binding.negativeButton.setCardBackgroundColor(BUTTON_BACKGROUND_COLOR);
                }
            } else {
                binding.positiveButton.setCardBackgroundColor(BUTTON_BACKGROUND_COLOR_DEFAULT);
                binding.negativeButton.setCardBackgroundColor(BUTTON_BACKGROUND_COLOR_DEFAULT);
            }


            // button text size

            if (BUTTON_TEXT_SIZE != 0) {
                binding.positiveText.setTextSize(TypedValue.COMPLEX_UNIT_SP, BUTTON_TEXT_SIZE);
                binding.negativeText.setTextSize(TypedValue.COMPLEX_UNIT_SP, BUTTON_TEXT_SIZE);
            } else {
                binding.positiveText.setTextSize(TypedValue.COMPLEX_UNIT_SP, BUTTON_TEXT_SIZE_DEFAULT);
                binding.negativeText.setTextSize(TypedValue.COMPLEX_UNIT_SP, BUTTON_TEXT_SIZE_DEFAULT);
            }


            // positive text
            binding.positiveText.setText(POSITIVE_BUTTON_TEXT);

            // positive text color
            if (POSITIVE_BUTTON_TEXT_COLOR != 0) {
                try {
                    binding.positiveText.setTextColor(ContextCompat.getColor(context, POSITIVE_BUTTON_TEXT_COLOR));
                } catch (Resources.NotFoundException e) {
                    binding.positiveText.setTextColor(POSITIVE_BUTTON_TEXT_COLOR);
                }
            } else {
                binding.positiveText.setTextColor(POSITIVE_BUTTON_TEXT_COLOR_DEFAULT);
            }

            // negative text
            binding.negativeText.setText(NEGATIVE_BUTTON_TEXT);

            // negative text color

            if (NEGATIVE_BUTTON_TEXT_COLOR != 0) {
                try {
                    binding.negativeText.setTextColor(ContextCompat.getColor(context, NEGATIVE_BUTTON_TEXT_COLOR));
                } catch (Resources.NotFoundException e) {
                    binding.negativeText.setTextColor(NEGATIVE_BUTTON_TEXT_COLOR);
                }
            } else {
                binding.negativeText.setTextColor(NEGATIVE_BUTTON_TEXT_COLOR_DEFAULT);
            }


            // positive button click listener
            binding.positiveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

            // negative button click listener
            binding.negativeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

            // close icon click listener
            binding.closeIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

            dialog.show();


        }


    }

}
