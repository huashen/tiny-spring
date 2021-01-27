package org.springframework.core.convert.converter;

/**
 * @author wardseptember
 * @create 2021-01-24 22:40
 */
public interface ConverterFactory<S, R> {

    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}
