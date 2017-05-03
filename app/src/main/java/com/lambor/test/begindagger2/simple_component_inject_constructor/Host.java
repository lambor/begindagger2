package com.lambor.test.begindagger2.simple_component_inject_constructor;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by lambor on 17-5-3.
 */

public class Host {
    String str;

    @Inject
    public Host(@Named("constructor_str_param") String str) {
        this.str = str;
    }
}
