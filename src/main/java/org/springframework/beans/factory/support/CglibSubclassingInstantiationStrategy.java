package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @author wardseptember
 * @create 2021-01-25 23:26
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {

    /**
     * 使用CGLIB动态生成子类
     *
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        //TODO 感兴趣的小伙伴可以实现下
        throw new UnsupportedOperationException("CGLIB instantiation strategy is not supported");
    }
}