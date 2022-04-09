/**
 * projectName: design-pattern
 * fileName: UserFactoryBean.java
 * packageName: com.sikiapp.designpattern.spring.factory
 * date: 2020-04-22 下午8:56
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.designpattern.spring.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 *
 * @author Robert
 * @data 2020-04-22 下午8:56
 * @version V1.0
 **/
@Component("user")
public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        // 假设User的实例化过程比较复杂，在此处进行User的实例化
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}