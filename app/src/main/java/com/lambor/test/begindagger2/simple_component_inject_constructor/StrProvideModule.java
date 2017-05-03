package com.lambor.test.begindagger2.simple_component_inject_constructor;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lambor on 17-5-3.
 */

@Module
public class StrProvideModule {
    @Provides @Named("constructor_str_param")
    String provide() {
        return "hello dagger2";
    }
}
