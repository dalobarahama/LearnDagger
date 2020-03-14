package com.example.learndagger.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by pengalatdite on 3/13/2020.
 */
public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving...");
    }
}