package com.example.learndagger;

/**
 * Created by pengalatdite on 3/13/2020.
 */
public class Wheels {
    //we don't own this class so we can't annotate it with @Inject

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
