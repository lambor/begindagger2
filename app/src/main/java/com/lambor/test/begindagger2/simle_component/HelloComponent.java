package com.lambor.test.begindagger2.simle_component;

import javax.inject.Named;

import dagger.Component;

/**
 * Created by lambor on 17-5-3.
 *
 * http://stackoverflow.com/questions/37149407/dagger-1-to-2-migration-members-injection-methods-may-only-return-the-injected
 *
 * Component只能有三种方法声明
 *
 * 1.inject something into some object, which is the error you see. Those methods usually return void, but you can just return the same object, if you try to have something like a builder.
 *
 * MyInjectedObject inject(MyInjectedObject object); // or
 * void inject(MyInjectedObject object);
 *
 *
 * 2.Subcomponents, for which you would include the needed modules as parameters (if they require initialization)\
 *
 * MySubcomponent plus(MyModuleA module);
 *
 *
 * 3.and basically just "getters" or correctly called provision methods to expose objects, to manually get them from the component, and to your subcomponents
 *
 * MyExposedThing getMything();
 *
 */
@Component(
        modules = HelloModule.class
)
public interface HelloComponent {
    @Named("instance_hello")
    String hello1();
    @Named("static_hello")
    String hello2();
}
