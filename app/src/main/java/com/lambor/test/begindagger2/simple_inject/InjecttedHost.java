package com.lambor.test.begindagger2.simple_inject;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by lambor on 17-5-3.
 */

public class InjecttedHost {
    @Inject @Named("injecttedStr")
    String injecttedStr;
}
