package com.pngyul.simulation.toyspring.simple;

import com.pngyul.simulation.toyspring.Car;
import com.pngyul.simulation.toyspring.Wheel;
import org.junit.Test;

/**
 * Created by pngyul on 19/08/08.
 */
public class SimpleIOCTest {

    @Test
    public void getBean() throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("toy-spring-ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}