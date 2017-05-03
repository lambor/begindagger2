package com.lambor.test.begindagger2.simple_component_inject_field;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by lambor on 17-5-3.
 */

public class Host {
    @Inject @Named("instance_field_str")
    String str;
}
