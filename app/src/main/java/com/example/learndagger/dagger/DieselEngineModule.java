package com.example.learndagger.dagger;

import com.example.learndagger.car.DieselEngine;
import com.example.learndagger.car.Engine;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pengalatdite on 3/13/2020.
 */

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}
