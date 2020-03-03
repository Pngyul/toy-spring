package com.pngyul.simulation.toyspring.ioc.factory;

/**
 * Created by pngyul on 19/08/08.
 */
public interface BeanFactoryAware {

    void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
