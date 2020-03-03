package com.pngyul.simulation.toyspring;

/**
 * Created by pngyul on 19/08/08.
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHelloWorld() {
        System.out.println("hello world!");
    }
}
