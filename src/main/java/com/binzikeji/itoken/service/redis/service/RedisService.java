package com.binzikeji.itoken.service.redis.service;

/**
 * @Description
 * @Author Bin
 * @Date 2019/4/15 11:35
 **/
public interface RedisService {

    void put(String key, Object value, long seconds);

    Object get(String key);
}
