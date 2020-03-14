package com.example.learndagger.dagger;

import com.example.learndagger.MainActivity;
import com.example.learndagger.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by pengalatdite on 3/13/2020.
 */

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
