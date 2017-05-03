package com.lambor.test.begindagger2.simple_component_inject_constructor;

import com.lambor.test.begindagger2.simle_component.DaggerHelloComponent;

/**
 * Created by lambor on 17-5-3.
 */

public class Test {
    public static void main(String[] args) {
        Host component = DaggerConstructorComponent.create().createHost();
        System.out.println(component.str);
    }
}
