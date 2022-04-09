package com.sikiapp.designpattern.strategy2;

import java.util.HashMap;
import java.util.Map;

/**
 * @title: SystemCommandEnum
 * @package com.sikiapp.designpattern.strategy2
 * @description: 策略枚举类
 * @author: Robert
 * @date: 2019/8/1 下午5:28
 * @version: V1.0
*/
public enum SystemCommandEnum {

    SHUT_DOWN(":q!        ", "退出程序", "ShutDownCommand"),
       RELOAD(":reboot       ", "重启系统", "ReloadCommand")
    ;

    SystemCommandEnum(String commandType, String desc, String clazz) {
        this.commandType = commandType;
        this.desc = desc;
        this.clazz = clazz;
    }

    /**
     *  枚举值码
     */
    private final String commandType;

    /**
     * 枚举描述
     */
    private final String desc;

    /**
     * 实现类
     */
    private final String clazz ;

    public String getCommandType() {
        return commandType;
    }

    public String getDesc() {
        return desc;
    }

    public String getClazz() {
        return clazz;
    }

    /**
     * 获取全部枚举值码
     * @return 全部枚举值码
     */
    public static Map<String,String> getAllStatusCode() {
        Map<String,String> map = new HashMap<String, String>(16) ;
        for (SystemCommandEnum status : values()) {
            map.put(status.getCommandType(), status.getDesc()) ;
        }
        return map;
    }

    /**
     * 获取实现类
     * @return
     */
    public static Map<String,String> getAllClazz() {
        Map<String,String> map = new HashMap<String, String>(16) ;
        for (SystemCommandEnum status : values()) {
            map.put(status.getCommandType().trim(), "com.sikiapp.designpattern.strategy2." + status.getClazz()) ;
        }
        return map;
    }

}
