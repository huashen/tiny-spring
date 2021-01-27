package org.springframework.beans.factory.config;

import org.springframework.beans.BeansException;

/**
 * @author wardseptember
 * @create 2021-01-24 17:43
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
