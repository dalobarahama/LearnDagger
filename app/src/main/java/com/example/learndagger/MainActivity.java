package com.example.learndagger;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learndagger.car.Car;
import com.example.learndagger.dagger.CarComponent;
import com.example.learndagger.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        carComponent.inject(this);

        car.drive();
    }
}
