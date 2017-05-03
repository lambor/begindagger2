package com.lambor.test.begindagger2.simple_component_inject_field;

import dagger.Component;

/**
 * Created by lambor on 17-5-3.
 */

@Component(
        modules = StrProvideModule.class
)
public interface FieldComponent {
    Host injectHost(Host host);
    Host createHost();
}
