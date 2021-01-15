package com.hhao.redislock.command;

/**
 * @Author: zhaoje
 * @DateTime: 2021/1/15 16:07
 * @Description: TODO 应用启动时进行执行
 */
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(1)
public class MyCommandLineRunner1 implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
//        System.out.println("Runner1>>>" + Arrays.toString(args));
    }
}
