/**
 * projectName: design-pattern
 * fileName: SummerBuyDayGiftInfoStrategyServiceImpl.java
 * packageName: com.sikiapp.designpattern.strategy
 * date: 2019-08-01 下午3:54
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.strategy;

import org.springframework.stereotype.Service;

/**
 * @className: SummerBuyDayGiftInfoStrategyServiceImpl
 * @packageName: com.sikiapp.designpattern.strategy
 * @description: 夏季购物节（策略A）
 * @author: Robert
 * @data: 2019-08-01 下午3:54
 * @version: V1.0
 **/
@Service
public class SummerBuyDayGiftInfoStrategyServiceImpl implements IGiftInfoStrategyService {

    @Override
    public GiftInfo getGiftInfo() {
        // 模拟从数据库中查询
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setId(1L).setName("冰箱");
        System.out.println("夏季购物节礼品（策略A）");
        return giftInfo;
    }

    @Override
    public int getTypeId() {
        return 1;
    }
}