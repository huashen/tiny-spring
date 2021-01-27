package org.springframework.core.io;

/**
 * @author wardseptember
 * @create 2021-01-25 11:05
 */
public interface ResourceLoader {

    Resource getResource(String location);
}
