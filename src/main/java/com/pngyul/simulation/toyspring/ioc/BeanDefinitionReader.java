package com.pngyul.simulation.toyspring.ioc;

import java.io.FileNotFoundException;

/**
 * Created by pngyul on 19/08/08.
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws FileNotFoundException, Exception;

}
