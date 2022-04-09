/**
 * projectName: design-pattern
 * fileName: BadBahitLifeRisk.java
 * packageName: com.sikiapp.designpattern.template
 * date: 2020-04-16 下午10:25
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.template;

import java.time.LocalDateTime;

/**
 *
 * @author Robert
 * @data 2020-04-16 下午10:25
 * @version V1.0
 **/
public class BadBahitLifeRisk extends LifeRisk {
    private static final int BADHABIT_SUB = 5;

    @Override
    public long countWeeks(LocalDateTime now, int years, boolean badBabit) {
        if (badBabit) {
            years -= BADHABIT_SUB;
        }
        return super.countWeeks(now, years);
    }
}