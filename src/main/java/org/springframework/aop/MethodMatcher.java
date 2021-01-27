package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author wardseptember
 * @create 2021-01-26 16:31
 */
public interface MethodMatcher {
    boolean matches(Method method, Class<?> targetClass);

}
