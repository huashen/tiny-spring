package org.springframework.beans.factory.config;

/**
 * @author wardseptember
 * @create 2021-01-24 17:45
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void addSingleton(String beanName, Object singletonObject);

}
