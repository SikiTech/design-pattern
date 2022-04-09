/**
 * projectName: design-pattern
 * fileName: MyEvent.java
 * packageName: com.sikiapp.designpattern.observer
 * date: 2020-04-23 上午10:38
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.observer;

import org.springframework.context.ApplicationEvent;

/**
 * 事件类
 * @author Robert
 * @data 2020-04-23 上午10:38
 * @version V1.0
 **/
public class MyEvent extends ApplicationEvent {


    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which zthe event initially occurred (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
        System.out.println("My Event");
    }

    public void print() {
        System.out.println("hello spring event");
    }






}