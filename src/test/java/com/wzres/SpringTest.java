package com.wzres;

import com.wzres.config.UserConfig;
import com.wzres.domian.User;
import com.wzres.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName SpringTest
 * @date 2023-08-21 17:31
 */
public class SpringTest {

    //使用配置类
    @Test
    public void testConfig(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
        UserService userServiceImpl = annotationConfigApplicationContext.getBean("userServiceImpl", UserService.class);
        userServiceImpl.editUser(1,1);
    }


    @Test
    public void testSpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceImpl = applicationContext.getBean("userServiceImpl", UserService.class);
        userServiceImpl.editUser(1,1);
    }

    @Test
    public void testStart(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }
}
