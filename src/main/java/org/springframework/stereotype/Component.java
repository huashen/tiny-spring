package org.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @author wardseptember
 * @create 2021-01-25 23:56
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Component {
    String value() default "";
}
