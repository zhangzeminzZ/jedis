package com.zhangzemin;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * jedis常用api
 */
public class TestApi {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("121.40.250.195",6379);
        jedis.set("k1","v1");
        jedis.set("k2","v2");
        jedis.set("k3","v3");
        System.out.println(jedis.get("k1"));
        Set<String> set = jedis.keys("*");
        System.out.println(set.size());
    }
}
