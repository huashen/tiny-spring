package org.springframework.aop;

/**
 * @author wardseptember
 * @create 2021-01-26 16:32
 */
public interface PointcutAdvisor extends Advisor {
    Pointcut getPointcut();

}
