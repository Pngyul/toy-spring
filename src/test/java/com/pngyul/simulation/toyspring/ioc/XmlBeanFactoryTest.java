package com.pngyul.simulation.toyspring.ioc;

import com.pngyul.simulation.toyspring.Car;
import com.pngyul.simulation.toyspring.HelloService;
import com.pngyul.simulation.toyspring.Wheel;
import com.pngyul.simulation.toyspring.ioc.xml.XmlBeanFactory;
import org.junit.Test;

/**
 * Created by pngyul on 19/08/08.
 */
public class XmlBeanFactoryTest {

    @Test
    public void getBean() throws Exception {
        System.out.println("--------- IOC test ----------");
        String location = getClass().getClassLoader().getResource("toy-spring.xml").getFile();
        XmlBeanFactory bf = new XmlBeanFactory(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);

        System.out.println("\n--------- AOP test ----------");
        HelloService helloService = (HelloService) bf.getBean("helloService");
        helloService.sayHelloWorld();
    }
}