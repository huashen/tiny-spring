package org.springframework.beans;

/**
 * @author wardseptember
 * @create 2021-01-24 17:10
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
