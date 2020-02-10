package com.opopona.optemis;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

public class Preferences {
    private final static String FONT_STYLE = "text_size";

    private final Context context;

    public Preferences(Context context) {
        this.context = context;
    }

    protected SharedPreferences open() {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    protected SharedPreferences.Editor edit() {
        return open().edit();
    }

    public FontStyle getFontStyle() {
        return FontStyle.valueOf(open().getString(FONT_STYLE,
                FontStyle.Medium.name()));
    }

    public void setFontStyle(FontStyle style) {
        edit().putString(FONT_STYLE, style.name()).commit();
    }
}