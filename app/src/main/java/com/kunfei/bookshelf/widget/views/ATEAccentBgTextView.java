package com.kunfei.bookshelf.widget.views;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

import com.kunfei.bookshelf.utils.ColorUtil;
import com.kunfei.bookshelf.utils.ScreenUtils;
import com.kunfei.bookshelf.utils.Selector;
import com.kunfei.bookshelf.utils.theme.ThemeStore;

public class ATEAccentBgTextView extends AppCompatTextView {
    public ATEAccentBgTextView(Context context) {
        super(context);
        init(context, null);
    }

    public ATEAccentBgTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ATEAccentBgTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            setBackground(Selector.shapeBuild()
                    .setCornerRadius(ScreenUtils.dpToPx(3))
                    .setDefaultBgColor(ThemeStore.accentColor(context))
                    .setPressedBgColor(ColorUtil.darkenColor(ThemeStore.accentColor(context)))
                    .create());
        }else{
            setBackgroundDrawable(Selector.shapeBuild()
                    .setCornerRadius(ScreenUtils.dpToPx(3))
                    .setDefaultBgColor(ThemeStore.accentColor(context))
                    .setPressedBgColor(ColorUtil.darkenColor(ThemeStore.accentColor(context)))
                    .create());
        }
        setTextColor(Color.WHITE);
    }
}
