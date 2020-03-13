package com.example.learndagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by pengalatdite on 3/13/2020.
 */
public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public DieselEngine() {

    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started");
    }
}
