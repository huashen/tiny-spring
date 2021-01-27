package org.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author wardseptember
 * @create 2021-01-24 18:06
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Inherited
@Documented
public @interface Qualifier {

    String value() default "";

}
