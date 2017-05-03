package com.lambor.test.begindagger2.simle_component;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lambor on 17-5-3.
 */

@Module
public class HelloModule {
    @Provides @Named("instance_hello") String instance_hello() {
        return "instance_hello():hello dagger2.";
    }

    @Provides @Named("static_hello") static String static_hello() {
        return "static_hello():hello dagger2.";
    }
}
