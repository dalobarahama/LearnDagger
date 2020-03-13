package com.example.learndagger;

import dagger.Component;

/**
 * Created by pengalatdite on 3/13/2020.
 */

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
