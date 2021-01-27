package org.springframework.context.event;

import org.springframework.context.ApplicationContext;

/**
 * @author wardseptember
 * @create 2021-01-26 10:14
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

    public ContextRefreshedEvent(ApplicationContext source) {
        super(source);
    }
}
