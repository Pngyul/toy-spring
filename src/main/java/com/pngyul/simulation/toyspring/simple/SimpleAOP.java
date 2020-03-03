package com.pngyul.simulation.toyspring.simple;

import java.lang.reflect.Proxy;

/**
 * Created by pngyul on 19/08/08.
 */
public class SimpleAOP {

    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }
}