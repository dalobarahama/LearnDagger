package com.example.learndagger.car;

import android.util.Log;

/**
 * Created by pengalatdite on 3/13/2020.
 */
public class Tires {
    //we don't own this class so we can't annotate it with @Inject

    private static final String TAG = "Car";

    public void inflate() {
        Log.d(TAG, "Tires inflated");
    }
}
