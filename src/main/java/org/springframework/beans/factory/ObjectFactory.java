package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @author wardseptember
 * @create 2021-02-22 14:03
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}
