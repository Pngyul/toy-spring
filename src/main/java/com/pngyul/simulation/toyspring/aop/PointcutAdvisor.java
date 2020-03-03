package com.pngyul.simulation.toyspring.aop;

/**
 * Created by pngyul on 19/08/08.
 */
public interface PointcutAdvisor extends Advisor {

   Pointcut getPointcut();
}
