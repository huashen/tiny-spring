package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @author wardseptember
 * @create 2021-01-24 17:22
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
