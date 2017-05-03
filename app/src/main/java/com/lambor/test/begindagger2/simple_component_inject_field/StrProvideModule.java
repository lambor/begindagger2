package com.lambor.test.begindagger2.simple_component_inject_field;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lambor on 17-5-3.
 */

@Module
public class StrProvideModule {
    @Provides @Named("instance_field_str")
    String string() {
        return "hello dagger2";
    }

    @Provides
    Host newHost() {
        return new Host();
    }
}