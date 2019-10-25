package com.devtoyz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * @author Hongyi Zheng
 * @date 2019/10/25
 */
@Component
public class RedisConfig {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    @Autowired(required = false)
    public void setRedisTemplate(RedisTemplate redisTemplate){
        RedisSerializer<String> stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        redisTemplate.setValueSerializer(stringRedisSerializer);
        redisTemplate.setHashKeySerializer(stringRedisSerializer);
        redisTemplate.setHashValueSerializer(stringRedisSerializer);
        this.redisTemplate = redisTemplate;
    }

    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    public String get(final String key){
        ValueOperations<String, String> operations = redisTemplate.opsForValue();
        return operations.get(key);
    }

    public boolean set(final String key, String value) {
        return set(key, value, 60L);
    }

    public boolean set(final String key, String value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<String, String> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
        }
        return result;
    }

}
