package org.springframework.core.convert.converter;

/**
 * 类型转换抽象接口
 *
 * @author wardseptember
 * @create 2021-01-24 22:39
 */
public interface Converter<S, T> {

    T convert(S source);

}
