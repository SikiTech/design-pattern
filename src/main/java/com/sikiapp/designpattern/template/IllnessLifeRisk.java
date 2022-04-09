/**
 * projectName: design-pattern
 * fileName: IllnessLifeRisk.java
 * packageName: com.sikiapp.designpattern.template
 * date: 2020-04-16 下午10:26
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.template;

import java.time.LocalDateTime;

/**
 *
 * @author Robert
 * @data 2020-04-16 下午10:26
 * @version V1.0
 **/
public class IllnessLifeRisk extends LifeRisk {
    private static final int Illness_SUB = 5;

    @Override
    public long countWeeks(LocalDateTime now, int years, boolean illeness) {
        if (illeness) {
            years -= Illness_SUB;
        }
        return super.countWeeks(now, years);
    }
}