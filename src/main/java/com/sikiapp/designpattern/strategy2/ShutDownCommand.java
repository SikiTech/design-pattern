/**
 * projectName: design-pattern
 * fileName: ShutDownCommand.java
 * packageName: com.sikiapp.designpattern.strategy2
 * date: 2019-08-01 下午5:24
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.strategy2;

import org.springframework.stereotype.Service;

/**
 * @className: ShutDownCommand
 * @packageName: com.sikiapp.designpattern.strategy2
 * @description: 具体策略
 * @author: Robert
 * @data: 2019-08-01 下午5:24
 * @version: V1.0
 **/
@Service
public class ShutDownCommand implements InnerCommand {

    @Override
    public void process(String msg) {
        System.out.println(this.getClass().getSimpleName() + " execute, args:" + msg);
    }
}