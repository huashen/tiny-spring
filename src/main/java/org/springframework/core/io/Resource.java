package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wardseptember
 * @create 2021-01-25 11:04
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
