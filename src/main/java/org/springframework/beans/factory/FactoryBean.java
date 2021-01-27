package org.springframework.beans.factory;

/**
 * @author wardseptember
 * @create 2021-01-24 17:05
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
