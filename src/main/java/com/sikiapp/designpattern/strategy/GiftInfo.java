/**
 * projectName: design-pattern
 * fileName: GiftInfo.java
 * packageName: com.sikiapp.designpattern.strategy
 * date: 2019-08-01 下午3:48
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.strategy;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @className: GiftInfo
 * @packageName: com.sikiapp.designpattern.strategy
 * @description: 礼物实体类
 * @author: Robert
 * @data: 2019-08-01 下午3:48
 * @version: V1.0
 **/
@Data
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class GiftInfo implements Serializable {
    private static final long serialVersionUID = -92829400602471187L;

    private Long id;
    private String name;
}