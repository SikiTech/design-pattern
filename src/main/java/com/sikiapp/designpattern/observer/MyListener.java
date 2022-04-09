/**
 * projectName: design-pattern
 * fileName: MyListener.java
 * packageName: com.sikiapp.designpattern.observer
 * date: 2020-04-23 上午10:50
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听器
 * @author Robert
 * @data 2020-04-23 上午10:50
 * @version V1.0
 **/
@Component
public class MyListener implements ApplicationListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof MyEvent) {
            System.out.println("into onApplicationEvent()");
            MyEvent myEvent = (MyEvent) event;
            myEvent.print();
        }
    }
}