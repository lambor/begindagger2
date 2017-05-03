package com.lambor.test.begindagger2.simple_component_inject_field;

/**
 * Created by lambor on 17-5-3.
 */

public class Test {
    public static void main(String[] args) {
        FieldComponent component = DaggerFieldComponent.create();
        Host host = component.createHost();
        System.out.println(host.str);
        component.injectHost(host);
        System.out.println(host.str);
    }
}
