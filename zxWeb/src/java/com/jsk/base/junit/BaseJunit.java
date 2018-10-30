package com.jsk.base.junit;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Title: BaseJunit.java
 * @Description: 测试基类 
 * @author: lizp
 * @date: 2018年6月13日 下午8:56:51
 */
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml","classpath:spring/spring-mvc.xml"})
@WebAppConfiguration
public abstract class BaseJunit extends AbstractJUnit4SpringContextTests {

}
