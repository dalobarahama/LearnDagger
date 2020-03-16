package com.example.learndagger.dagger;

import com.example.learndagger.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by pengalatdite on 3/16/2020.
 */
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    Driver getDriver();
}
