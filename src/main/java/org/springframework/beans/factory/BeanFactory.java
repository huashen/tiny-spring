package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @author wardseptember
 * @create 2021-01-24 17:23
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    <T> T getBean(String name, Class<T> requireType) throws BeansException;

    <T> T getBean(Class<T> requireType) throws BeansException;

    boolean containsBean(String name);

}
