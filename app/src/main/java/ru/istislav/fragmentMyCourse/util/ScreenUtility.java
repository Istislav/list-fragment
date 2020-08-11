package ru.istislav.fragmentMyCourse.util;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

public class ScreenUtility {
    private Activity activity;
    private float dpWidth;
    private float dpHeight;

    public ScreenUtility(Activity activity) {
        this.activity = activity;

        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics ourMetrics = new DisplayMetrics();

        display.getMetrics(ourMetrics);

        float density = activity.getResources().getDisplayMetrics().density;
        dpHeight = ourMetrics.heightPixels / density;
        dpWidth = ourMetrics.widthPixels / density;
    }

    public float getDpWidth() {
        return dpWidth;
    }

    public float getDpHeight() {
        return dpHeight;
    }


}
