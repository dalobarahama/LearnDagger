package com.example.learndagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by pengalatdite on 3/13/2020.
 */
public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine() {

    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started");
    }
}