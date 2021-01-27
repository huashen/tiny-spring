package org.springframework.core.convert.converter;

/**
 * @author wardseptember
 * @create 2021-01-24 22:47
 */
public interface ConverterRegistry {

    void addConverter(Converter<?, ?> converter);

    void addConverterFactory(ConverterFactory<?, ?> converterFactory);

    void addConverter(GenericConverter converter);
}
