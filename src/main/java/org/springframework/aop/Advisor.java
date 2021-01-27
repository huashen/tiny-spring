package org.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @author wardseptember
 * @create 2021-01-26 15:54
 */
public interface Advisor {

    Advice getAdvice();
}
