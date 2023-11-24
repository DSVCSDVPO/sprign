package com.zhuboxuan.reggie;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@Slf4j //输出日志,方便调试的
@SpringBootApplication  //spring项目启动项
@ServletComponentScan  //过滤器启动项
@MapperScan("com.zhuboxuan.reggie.dao")  
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class, args);
        //第一个参数就是Spring应用的入口类；第二个参数args是启动Spring应用的命令行参数
        //调用run方法；准备spring的上下文，完成容器的初始化，创建，加载等。会在不同的时机触发监听器的不同事件。
        log.info("项目启动成功......");  //因为上面导入了slf4j(日志) 这个就是日志的输出方法
    }
}
