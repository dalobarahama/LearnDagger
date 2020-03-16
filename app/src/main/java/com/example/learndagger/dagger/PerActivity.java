package com.example.learndagger.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by pengalatdite on 3/16/2020.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface PerActivity {
}
