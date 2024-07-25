package com.ioomex.olecodeApp.utils;

import cn.hutool.core.util.ObjUtil;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * RedisTest
 *
 * @author sutton
 * @since 2024-07-25 16:00
 */
@SpringBootTest
public class RedisTest {

    private static final Logger log = LoggerFactory.getLogger(RedisTest.class);

    @Resource
    private RedisUtil redisUtil;


    @Test
    public void test() {
        redisUtil.set("hello","world");
        Object object = redisUtil.get("hello");
        if (ObjUtil.isNotEmpty(object)){
            log.info("world  {}",object);
        }
    }
}