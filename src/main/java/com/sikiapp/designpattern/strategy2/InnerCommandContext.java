/**
 * projectName: design-pattern
 * fileName: InnerCommandContext.java
 * packageName: com.sikiapp.designpattern.strategy2
 * date: 2019-08-01 下午5:27
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.strategy2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @className: InnerCommandContext
 * @packageName: com.sikiapp.designpattern.strategy2
 * @description: 策略角色
 * @author: Robert
 * @data: 2019-08-01 下午5:27
 * @version: V1.0
 **/
@Slf4j
@Component
public class InnerCommandContext {

    /**
     * 注入所有策略
     */
    private static final Map<String, String> allClazz = SystemCommandEnum.getAllClazz();

    /**
     * 兼容需要命令后接参数的数据 :!q args
     * 创建一个策略实例，通常用String、Enum、Class作为入参类型
     * @param command
     * @return
     */
    public InnerCommand getInstance(String command) {
        String[] trim = command.trim().split(" ");
        String clazz = allClazz.get(trim[0]);
        InnerCommand innerCommand = null;
        try {
            innerCommand = (InnerCommand) SpringBeanFactory.getBean(Class.forName(clazz));
        } catch (Exception e) {
            log.error("Exception", e);
        }

        return innerCommand;
    }



}