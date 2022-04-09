/**
 * projectName: design-pattern
 * fileName: SpringBeanFactory.java
 * packageName: com.sikiapp.designpattern.strategy2
 * date: 2019-08-01 下午5:14
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.strategy2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @className: SpringBeanFactory
 * @packageName: com.sikiapp.designpattern.strategy2
 * @description: Spring 容器
 * @author: Robert
 * @data: 2019-08-01 下午5:14
 * @version: V1.0
 **/
@Component
public class SpringBeanFactory implements ApplicationContextAware {

    public static ApplicationContext context;

    public static <T> T getBean(Class<T> clazz){
        return context.getBean(clazz);
    }

    public static <T> T getBean(String name,Class<T> clazz){
        return context.getBean(name,clazz);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}