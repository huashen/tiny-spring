package org.springframework.beans.factory;

/**
 * @author wardseptember
 * @create 2021-01-24 18:31
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
