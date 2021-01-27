package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author wardseptember
 * @create 2021-01-26 15:32
 */
public interface MethodBeforeAdvice extends BeforeAdvice {

    void before(Method method, Object[] args, Object target) throws Throwable;

}
