package com.anyuan.droidui;

import android.content.Context;

public class Library {

    public static String getHelloMessage(Context context) {
        return context.getString(R.string.hello);
    }

}
