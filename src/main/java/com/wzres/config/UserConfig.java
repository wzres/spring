package com.wzres.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName UserConfig
 * @date 2023-08-21 19:04
 */
@Configuration //代替spring.xml配置文件，在这个类当中完成配置。
@ComponentScan("com.wzres") //组件扫描
@EnableTransactionManagement //开启事务注解驱动器
public class UserConfig {

}
