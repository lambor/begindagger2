package com.lambor.test.begindagger2.simle_component;

/**
 * Created by lambor on 17-5-3.
 */

public class Test {
    public static void main(String[] args) {
        System.out.println(DaggerHelloComponent.create().hello1());
        System.out.println(DaggerHelloComponent.create().hello2());
    }
}
