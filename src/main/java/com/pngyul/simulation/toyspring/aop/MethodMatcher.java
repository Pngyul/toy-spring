package com.pngyul.simulation.toyspring.aop;

import java.lang.reflect.Method;

/**
 * Created by pngyul on 19/08/08.
 */
public interface MethodMatcher {

    Boolean matchers(Method method, Class beanClass);
}
