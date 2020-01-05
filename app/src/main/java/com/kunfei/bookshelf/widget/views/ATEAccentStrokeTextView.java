package com.kunfei.bookshelf.widget.views;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

import com.kunfei.bookshelf.R;
import com.kunfei.bookshelf.utils.ScreenUtils;
import com.kunfei.bookshelf.utils.Selector;
import com.kunfei.bookshelf.utils.theme.ThemeStore;

public class ATEAccentStrokeTextView extends AppCompatTextView {
    public ATEAccentStrokeTextView(Context context) {
        super(context);
        init(context, null);
    }

    public ATEAccentStrokeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ATEAccentStrokeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            setBackground(Selector.shapeBuild()
                    .setCornerRadius(ScreenUtils.dpToPx(3))
                    .setStrokeWidth(ScreenUtils.dpToPx(1))
                    .setDisabledStrokeColor(context.getResources().getColor(R.color.md_grey_500))
                    .setDefaultStrokeColor(ThemeStore.accentColor(context))
                    .setPressedBgColor(context.getResources().getColor(R.color.transparent30))
                    .create());
        }else {
            setBackgroundDrawable(Selector.shapeBuild()
                    .setCornerRadius(ScreenUtils.dpToPx(3))
                    .setStrokeWidth(ScreenUtils.dpToPx(1))
                    .setDisabledStrokeColor(context.getResources().getColor(R.color.md_grey_500))
                    .setDefaultStrokeColor(ThemeStore.accentColor(context))
                    .setPressedBgColor(context.getResources().getColor(R.color.transparent30))
                    .create());
        }
        setTextColor(Selector.colorBuild()
                .setDefaultColor(ThemeStore.accentColor(context))
                .setDisabledColor(context.getResources().getColor(R.color.md_grey_500))
                .create());
    }
}
