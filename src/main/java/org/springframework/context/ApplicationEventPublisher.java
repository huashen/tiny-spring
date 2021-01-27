package org.springframework.context;


/**
 * 事件发布者接口
 *
 * @author wardseptember
 * @create 2021-01-26 09:58
 */
public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);
}
