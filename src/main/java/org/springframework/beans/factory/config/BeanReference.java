package org.springframework.beans.factory.config;

/**
 * @author wardseptember
 * @create 2021-01-24 17:44
 */
public class BeanReference {
    private final String beanName;


    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
