package com.pngyul.simulation.toyspring.aop;

/**
 * Created by pngyul on 19/08/08.
 */
public interface ClassFilter {

    Boolean matchers(Class beanClass) throws Exception;
}
