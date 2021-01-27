package org.springframework.aop;

/**
 * @author wardseptember
 * @create 2021-01-26 16:31
 */
public interface ClassFilter {
    boolean matches(Class<?> clazz);
}
