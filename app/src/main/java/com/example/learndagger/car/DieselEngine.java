package com.example.learndagger.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by pengalatdite on 3/13/2020.
 */
public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started. Horsepower " + horsePower);
    }
}
