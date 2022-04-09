/**
 * projectName: design-pattern
 * fileName: LifeRisk.java
 * packageName: com.sikiapp.designpattern.template
 * date: 2020-04-16 下午10:22
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.template;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Robert
 * @data 2020-04-16 下午10:22
 * @version V1.0
 **/
public abstract class LifeRisk {
    private static final int DAYS_PER_WEEK = 7;

    abstract long countWeeks(LocalDateTime now, int years, boolean hasRisk);

    protected long countWeeks(LocalDateTime now, int years) {
        LocalDateTime life = now.plusYears(years);
        Duration duration = Duration.between(life, now);
        long days = duration.toDays();
        return days / DAYS_PER_WEEK;
    }
}





