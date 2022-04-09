package com.sikiapp.designpattern.strategy;

/**
 * @title: IGiftInfoStrategyService
 * @package com.sikiapp.designpattern.strategy
 * @description: 策略抽象类
 * @author: Robert
 * @date: 2019/8/1 下午3:46
 * @version: V1.0
*/
public interface IGiftInfoStrategyService {

    GiftInfo getGiftInfo();
    int getTypeId();
}
