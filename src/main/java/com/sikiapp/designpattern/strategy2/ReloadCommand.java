/**
 * projectName: design-pattern
 * fileName: ReloadCommand.java
 * packageName: com.sikiapp.designpattern.strategy2
 * date: 2019-08-01 下午5:26
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.strategy2;

import org.springframework.stereotype.Service;

/**
 * @className: ReloadCommand
 * @packageName: com.sikiapp.designpattern.strategy2
 * @description: 具体策略
 * @author: Robert
 * @data: 2019-08-01 下午5:26
 * @version: V1.0
 **/
@Service
public class ReloadCommand implements InnerCommand{

    @Override
    public void process(String msg) {
        System.out.println(this.getClass().getSimpleName() + " execute, args:" + msg);
    }
}