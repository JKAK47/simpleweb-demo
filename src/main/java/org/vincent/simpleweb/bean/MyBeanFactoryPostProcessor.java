package org.vincent.simpleweb.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * simpleweb-demo.org.vincent.simpleweb.bean <br/>
 * Created by PengRong on 2018/7/17. <br/>
 *
 * @author PengRong <br/>
 * @Description TODO(${END})
 * @ClassName: ${CLASS}
 * @since 2018-07-17 14:34 <br/>
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public MyBeanFactoryPostProcessor() {
        super();
        System.out.println("这是BeanFactoryPostProcessor实现类构造器！！");
    }
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out
                .println("BeanFactoryPostProcessor调用postProcessBeanFactory方法");
        BeanDefinition bd = beanFactory.getBeanDefinition("person");
        bd.getPropertyValues().addPropertyValue("phone", "110");
    }
}
