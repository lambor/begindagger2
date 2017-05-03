package com.lambor.test.begindagger2.simple_inject;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lambor on 17-5-3.
 */

@Module
public class InjectStrProviderModule {
    @Provides @Named("injecttedStr")
    String provide() {
        return "inject string from module";
    }
}
