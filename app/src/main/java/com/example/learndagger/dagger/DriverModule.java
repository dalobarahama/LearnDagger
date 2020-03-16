package com.example.learndagger.dagger;

import com.example.learndagger.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pengalatdite on 3/16/2020.
 */
@Module
public abstract class DriverModule {

    @Provides
    @Singleton
    static Driver provideDriver() {
        return new Driver();
    }
}
