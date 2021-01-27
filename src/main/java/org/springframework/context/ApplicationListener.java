package org.springframework.context;

import java.util.EventListener;

/**
 * @author wardseptember
 * @create 2021-01-26 10:01
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    void onApplicationEvent(E event);

}
