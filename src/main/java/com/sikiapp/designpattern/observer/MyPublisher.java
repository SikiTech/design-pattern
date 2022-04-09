/**
 * projectName: design-pattern
 * fileName: MyPubisher.java
 * packageName: com.sikiapp.designpattern.observer
 * date: 2020-04-23 上午11:43
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.observer;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * 发布事件
 * @author Robert
 * @data 2020-04-23 上午11:43
 * @version V1.0
 **/
@Component
public class MyPublisher implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void publishEvent(ApplicationEvent event) {
        System.out.println("into publishEvent()");
        applicationContext.publishEvent(event);
    }

}