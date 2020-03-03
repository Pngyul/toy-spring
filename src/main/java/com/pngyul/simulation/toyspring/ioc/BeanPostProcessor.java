package com.pngyul.simulation.toyspring.ioc;

/**
 * Created by pngyul on 19/08/08.
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception;

    Object postProcessAfterInitialization(Object bean, String beanName) throws Exception;
}
