package org.springframework.context.event;

import org.springframework.context.ApplicationContext;

/**
 * @author wardseptember
 * @create 2021-01-26 10:12
 */
public class ContextClosedEvent extends ApplicationContextEvent {

    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
