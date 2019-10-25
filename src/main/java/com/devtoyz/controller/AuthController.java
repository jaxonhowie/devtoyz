package com.devtoyz.controller;

import com.devtoyz.config.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 *
 * @author Hongyi Zheng
 * @date 2019/10/25
 */
@RestController
public class AuthController {

    @Autowired
    RedisConfig redisConfig;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String userLogin(){
        return null;
    }

    @PostMapping("/redis/write")
    public boolean write(@RequestParam(value = "key") String key,@RequestParam(value = "value") String value){
        return redisConfig.set(key,value);
    }

    @PostMapping("/redis/get")
    public String get(@RequestParam("key") String key) {
        return redisConfig.get(key);
    }

}
