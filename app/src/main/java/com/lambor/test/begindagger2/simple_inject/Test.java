package com.lambor.test.begindagger2.simple_inject;

/**
 * Created by lambor on 17-5-3.
 * 可以发现没有Component作为Module和Host之间的桥梁,注入需要较多代码
 */

public class Test {
    public static void main(String[] args) {
        InjecttedHost host = new InjecttedHost();
        InjecttedHost_MembersInjector.create(InjectStrProviderModule_ProvideFactory.create(new InjectStrProviderModule())).injectMembers(host);

        System.out.println(host.injecttedStr);
    }
}
