package com.aljammal.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterLibary {

    public static void t(Context mContext, String message) {
        Toast.makeText(mContext, "" + message, Toast.LENGTH_SHORT).show();
    }
}
