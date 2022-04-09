package com.sikiapp.designpattern.strategy2;

/**
 * @title: InnerCommand
 * @package com.sikiapp.designpattern.strategy2
 * @description: 策略抽象接口
 * @author: Robert
 * @date: 2019/8/1 下午5:21
 * @version: V1.0
*/
public interface InnerCommand {

    /**
     * 执行
     * @param msg
     */
    void process(String msg);
}
