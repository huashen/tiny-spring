package org.springframework.core.convert;

/**
 * @author wardseptember
 * @create 2021-01-24 18:00
 */
public interface ConversionService {

    boolean canConvert(Class<?> sourceType, Class<?> targetType);

    <T> T convert(Object source, Class<T> targetType);
}
