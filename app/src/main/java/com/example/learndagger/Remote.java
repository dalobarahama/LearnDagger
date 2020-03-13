package com.example.learndagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by pengalatdite on 3/13/2020.
 */
public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote() {

    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}
