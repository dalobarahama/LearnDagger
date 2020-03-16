package com.example.learndagger;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learndagger.car.Car;
import com.example.learndagger.dagger.ActivityComponent;
import com.example.learndagger.dagger.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = DaggerActivityComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .appComponent(((ExampleApp) getApplication()).getAppComponent())
                .build();

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
