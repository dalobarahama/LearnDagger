package com.example.learndagger.dagger;

import com.example.learndagger.car.Rims;
import com.example.learndagger.car.Tires;
import com.example.learndagger.car.Wheels;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pengalatdite on 3/13/2020.
 */

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
