/**
 * projectName: design-pattern
 * fileName: GiftInfoStrategyContext.java
 * packageName: com.sikiapp.designpattern.strategy
 * date: 2019-08-01 下午4:04
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.strategy;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @className: GiftInfoStrategyContext
 * @packageName: com.sikiapp.designpattern.strategy
 * @description: 策略角色
 * @author: Robert
 * @data: 2019-08-01 下午4:04
 * @version: V1.0
 **/
@Component
public class GiftInfoStrategyContext {

    // 注入策略
    @Resource
    private List<IGiftInfoStrategyService> giftInfoStrategyServiceList;

    public GiftInfo getGiftInfo(int typeId) {
        Optional<IGiftInfoStrategyService> optional = giftInfoStrategyServiceList.stream()
                .filter(service -> service.getTypeId() == typeId)
                .findFirst();

        if (optional.isPresent()) {
            IGiftInfoStrategyService strategyService = optional.get();
            return strategyService.getGiftInfo();
        }

        return null;
    }




}