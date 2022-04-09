/**
 * projectName: design-pattern
 * fileName: DoubleElevenGiftInfoStrategyServiceImpl.java
 * packageName: com.sikiapp.designpattern.strategy
 * date: 2019-08-01 下午4:01
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.strategy;

import org.springframework.stereotype.Service;

/**
 * @className: DoubleElevenGiftInfoStrategyServiceImpl
 * @packageName: com.sikiapp.designpattern.strategy
 * @description: 双11活动 （策略B）
 * @author: Robert
 * @data: 2019-08-01 下午4:01
 * @version: V1.0
 **/
@Service
public class DoubleElevenGiftInfoStrategyServiceImpl implements IGiftInfoStrategyService {

    @Override
    public GiftInfo getGiftInfo() {
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setId(2L).setName("棉袄");
        System.out.println("双11活动礼品 （策略B）");
        return giftInfo;
    }

    @Override
    public int getTypeId() {
        return 2;
    }
}