package com.example.learndagger.dagger;

import com.example.learndagger.car.Engine;
import com.example.learndagger.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

/**
 * Created by pengalatdite on 3/13/2020.
 */

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
