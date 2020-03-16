package com.example.learndagger;

import android.app.Application;

import com.example.learndagger.dagger.AppComponent;
import com.example.learndagger.dagger.DaggerAppComponent;

/**
 * Created by pengalatdite on 3/16/2020.
 */
public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
