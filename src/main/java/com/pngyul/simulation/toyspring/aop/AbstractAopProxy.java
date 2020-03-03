package com.pngyul.simulation.toyspring.aop;

/**
 * Created by pngyul on 19/08/08.
 */
public abstract class AbstractAopProxy implements AopProxy {

    protected AdvisedSupport advised;

    public AbstractAopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }
}
