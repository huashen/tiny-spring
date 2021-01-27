package org.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @author wardseptember
 * @create 2021-01-26 09:50
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {
    String value() default "singleton";
}
