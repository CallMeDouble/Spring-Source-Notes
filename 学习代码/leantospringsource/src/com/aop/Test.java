package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by walmt on 2017/8/4.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:com/aop/springaop.xml");
        TestBean bean = (TestBean) bf.getBean("test");
        bean.test();
    }
}
