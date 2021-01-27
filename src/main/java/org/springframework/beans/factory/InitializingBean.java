package org.springframework.beans.factory;

/**
 * @author wardseptember
 * @create 2021-01-24 18:32
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;

}
